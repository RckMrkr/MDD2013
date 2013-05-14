package org.bimserver.plugins.deserializers;

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

import org.bimserver.plugins.Plugin;
import org.bimserver.plugins.PluginConfiguration;

public interface DeserializerPlugin extends Plugin {
	/**
	 * @param pluginConfiguration User specific settings for this plugin
	 * @return The deserializer
	 */
	Deserializer createDeserializer(PluginConfiguration pluginConfiguration);
	
	/**
	 * @param extension
	 * @return Whether this plugin can handle the given extension
	 */
	boolean canHandleExtension(String extension);
}