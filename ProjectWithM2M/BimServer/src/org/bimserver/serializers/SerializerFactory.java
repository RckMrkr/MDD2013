package org.bimserver.serializers;

/******************************************************************************
 * Copyright (C) 2009-2013  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *****************************************************************************/

import java.util.ArrayList;
import java.util.List;

import org.bimserver.database.BimDatabase;
import org.bimserver.database.BimserverDatabaseException;
import org.bimserver.database.DatabaseSession;
import org.bimserver.database.Query;
import org.bimserver.emf.IfcModelInterface;
import org.bimserver.interfaces.objects.SModelComparePluginDescriptor;
import org.bimserver.interfaces.objects.SModelMergerPluginDescriptor;
import org.bimserver.interfaces.objects.SQueryEnginePluginDescriptor;
import org.bimserver.interfaces.objects.SRenderEnginePluginDescriptor;
import org.bimserver.interfaces.objects.SSerializerPluginDescriptor;
import org.bimserver.interfaces.objects.SServicePluginDescriptor;
import org.bimserver.longaction.DownloadParameters;
import org.bimserver.models.store.GeoTag;
import org.bimserver.models.store.ObjectType;
import org.bimserver.models.store.Project;
import org.bimserver.models.store.SerializerPluginConfiguration;
import org.bimserver.models.store.StorePackage;
import org.bimserver.plugins.PluginConfiguration;
import org.bimserver.plugins.PluginManager;
import org.bimserver.plugins.modelcompare.ModelComparePlugin;
import org.bimserver.plugins.modelmerger.ModelMergerPlugin;
import org.bimserver.plugins.queryengine.QueryEnginePlugin;
import org.bimserver.plugins.renderengine.RenderEnginePlugin;
import org.bimserver.plugins.serializers.ProjectInfo;
import org.bimserver.plugins.serializers.SerializerException;
import org.bimserver.plugins.serializers.SerializerPlugin;
import org.bimserver.plugins.services.ServicePlugin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SerializerFactory {
	private static final Logger LOGGER = LoggerFactory.getLogger(SerializerFactory.class);
	private PluginManager pluginManager;
	private BimDatabase bimDatabase;

	public SerializerFactory() {
	}

	public void init(PluginManager pluginManager, BimDatabase bimDatabase) {
		this.pluginManager = pluginManager;
		this.bimDatabase = bimDatabase;
	}

	public List<SSerializerPluginDescriptor> getAllSerializerPluginDescriptors() {
		List<SSerializerPluginDescriptor> descriptors = new ArrayList<SSerializerPluginDescriptor>();
		for (SerializerPlugin serializerPlugin : pluginManager.getAllSerializerPlugins(true)) {
			descriptors.add(makeSerializerDescriptor(serializerPlugin));
		}
		return descriptors;
	}

	public List<SServicePluginDescriptor> getAllServicePluginDescriptors() {
		List<SServicePluginDescriptor> descriptors = new ArrayList<SServicePluginDescriptor>();
		for (ServicePlugin servicePlugin : pluginManager.getAllServicePlugins(true)) {
			SServicePluginDescriptor descriptor = new SServicePluginDescriptor();
			descriptor.setPluginClassName(servicePlugin.getClass().getName());
			descriptors.add(descriptor);
		}
		return descriptors;
	}
	
	public org.bimserver.plugins.serializers.Serializer create(Project project, String username, IfcModelInterface model, RenderEnginePlugin renderEnginePlugin, DownloadParameters downloadParameters) throws SerializerException {
		DatabaseSession session = bimDatabase.createSession();
		try {
			SerializerPluginConfiguration serializerPluginConfiguration = session.get(StorePackage.eINSTANCE.getSerializerPluginConfiguration(), downloadParameters.getSerializerOid(), Query.getDefault());
			if (serializerPluginConfiguration != null) {
				SerializerPlugin serializerPlugin = (SerializerPlugin) pluginManager.getPlugin(serializerPluginConfiguration.getClassName(), true);
				if (serializerPlugin != null) {
					ObjectType settings = serializerPluginConfiguration.getSettings();
					org.bimserver.plugins.serializers.Serializer serializer = serializerPlugin.createSerializer(new PluginConfiguration(settings));
					if (serializer != null) {
						try {
							ProjectInfo projectInfo = new ProjectInfo();
							projectInfo.setName(project.getName());
							projectInfo.setDescription(project.getDescription());
							GeoTag geoTag = project.getGeoTag();
							if (geoTag != null && geoTag.getEnabled()) {
								projectInfo.setX(geoTag.getX());
								projectInfo.setY(geoTag.getY());
								projectInfo.setZ(geoTag.getZ());
								projectInfo.setDirectionAngle(geoTag.getDirectionAngle());
							}
							projectInfo.setAuthorName(username);
							serializer.init(model, projectInfo, pluginManager, renderEnginePlugin, true);
							return serializer;
						} catch (NullPointerException e) {
							LOGGER.error("", e);
						}
					}
				}
			}
		} catch (BimserverDatabaseException e) {
			LOGGER.error("", e);
		} finally {
			session.close();
		}
		return null;
	}

	public SSerializerPluginDescriptor getSerializerPluginDescriptor(String type) {
		for (SerializerPlugin serializerPlugin : pluginManager.getAllSerializerPlugins(true)) {
			if (serializerPlugin.getClass().getName().equals(type)) {
				return makeSerializerDescriptor(serializerPlugin);
			}
		}
		return null;
	}

	private SSerializerPluginDescriptor makeSerializerDescriptor(SerializerPlugin serializerPlugin) {
		SSerializerPluginDescriptor descriptor = new SSerializerPluginDescriptor();
		descriptor.setDefaultName(serializerPlugin.getDefaultName());
		descriptor.setPluginClassName(serializerPlugin.getClass().getName());
		return descriptor;
	}

	public String getExtension(Long serializerOid) {
		DatabaseSession session = bimDatabase.createSession();
		try {
			SerializerPluginConfiguration found = session.get(StorePackage.eINSTANCE.getSerializerPluginConfiguration(), serializerOid, Query.getDefault());
			if (found != null) {
				return new PluginConfiguration(found.getSettings()).getString(SerializerPlugin.EXTENSION);
			}
		} catch (BimserverDatabaseException e) {
			LOGGER.error("", e);
		} finally {
			session.close();
		}
		return null;
	}

	public List<SRenderEnginePluginDescriptor> getAllRenderEnginePluginDescriptors() {
		List<SRenderEnginePluginDescriptor> descriptors = new ArrayList<SRenderEnginePluginDescriptor>();
		for (RenderEnginePlugin renderEnginePlugin : pluginManager.getAllRenderEnginePlugins(true)) {
			SRenderEnginePluginDescriptor descriptor = new SRenderEnginePluginDescriptor();
			descriptor.setDefaultName(renderEnginePlugin.getDefaultName());
			descriptor.setPluginClassName(renderEnginePlugin.getClass().getName());
			descriptors.add(descriptor);
		}
		return descriptors;
	}

	public List<SQueryEnginePluginDescriptor> getAllQueryEnginePluginDescriptors() {
		List<SQueryEnginePluginDescriptor> descriptors = new ArrayList<SQueryEnginePluginDescriptor>();
		for (QueryEnginePlugin queryEnginePlugin : pluginManager.getAllQueryEnginePlugins(true)) {
			SQueryEnginePluginDescriptor descriptor = new SQueryEnginePluginDescriptor();
			descriptor.setDefaultName(queryEnginePlugin.getDefaultName());
			descriptor.setPluginClassName(queryEnginePlugin.getClass().getName());
			descriptors.add(descriptor);
		}
		return descriptors;
	}

	public List<SModelMergerPluginDescriptor> getAllModelMergerPluginDescriptors() {
		List<SModelMergerPluginDescriptor> descriptors = new ArrayList<SModelMergerPluginDescriptor>();
		for (ModelMergerPlugin queryEnginePlugin : pluginManager.getAllModelMergerPlugins(true)) {
			SModelMergerPluginDescriptor descriptor = new SModelMergerPluginDescriptor();
			descriptor.setDefaultName(queryEnginePlugin.getDefaultName());
			descriptor.setPluginClassName(queryEnginePlugin.getClass().getName());
			descriptors.add(descriptor);
		}
		return descriptors;
	}

	public List<SModelComparePluginDescriptor> getAllModelComparePluginDescriptors() {
		List<SModelComparePluginDescriptor> descriptors = new ArrayList<SModelComparePluginDescriptor>();
		for (ModelComparePlugin queryEnginePlugin : pluginManager.getAllModelComparePlugins(true)) {
			SModelComparePluginDescriptor descriptor = new SModelComparePluginDescriptor();
			descriptor.setDefaultName(queryEnginePlugin.getDefaultName());
			descriptor.setPluginClassName(queryEnginePlugin.getClass().getName());
			descriptors.add(descriptor);
		}
		return descriptors;
	}
}