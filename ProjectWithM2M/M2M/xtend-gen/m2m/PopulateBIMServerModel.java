package m2m;

import OurPartialIFC.OurIFC;
import OurPartialIFC.OurIfcElement;
import OurPartialIFC.OurIfcElementType;
import OurPartialIFC.OurIfcMaterial;
import OurPartialIFC.OurIfcMaterialLayer;
import OurPartialIFC.OurIfcMaterialLayerSet;
import OurPartialIFC.OurIfcMaterialLayerSetUsage;
import OurPartialIFC.OurIfcMaterialList;
import OurPartialIFC.OurIfcMaterialSelect;
import OurPartialIFC.OurIfcRelAssociatesMaterial;
import OurPartialIFC.OurIfcRoot;
import com.google.common.base.Objects;
import java.util.Arrays;
import java.util.List;
import model.GuidCompressor;
import org.bimserver.emf.IdEObject;
import org.bimserver.ifc.IfcModel;
import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Factory;
import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcElement;
import org.bimserver.models.ifc2x3tc1.IfcElementType;
import org.bimserver.models.ifc2x3tc1.IfcMaterial;
import org.bimserver.models.ifc2x3tc1.IfcMaterialLayer;
import org.bimserver.models.ifc2x3tc1.IfcMaterialLayerSet;
import org.bimserver.models.ifc2x3tc1.IfcMaterialLayerSetUsage;
import org.bimserver.models.ifc2x3tc1.IfcMaterialList;
import org.bimserver.models.ifc2x3tc1.IfcMaterialSelect;
import org.bimserver.models.ifc2x3tc1.IfcObjectDefinition;
import org.bimserver.models.ifc2x3tc1.IfcOwnerHistory;
import org.bimserver.models.ifc2x3tc1.IfcRelAssociatesMaterial;
import org.bimserver.models.ifc2x3tc1.IfcRoot;
import org.bimserver.models.ifc2x3tc1.impl.Ifc2x3tc1FactoryImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class PopulateBIMServerModel implements IWorkflowComponent {
  private String ifcDataSlot = "random";
  
  private String partialIFCDataSlot = "random";
  
  private final Ifc2x3tc1Package ifcPackage = Ifc2x3tc1Package.eINSTANCE;
  
  private IfcModel ifcModel;
  
  private IfcOwnerHistory ownerHistory;
  
  private OurIFC partialIFCModel;
  
  public String setifcDataSlot(final String slotname) {
    String _ifcDataSlot = this.ifcDataSlot = slotname;
    return _ifcDataSlot;
  }
  
  public String setpartialIFCDataSlot(final String slotname) {
    String _partialIFCDataSlot = this.partialIFCDataSlot = slotname;
    return _partialIFCDataSlot;
  }
  
  public void invoke(final IWorkflowContext ctx) {
    Object _get = ctx.get(this.ifcDataSlot);
    this.ifcModel = ((IfcModel) _get);
    Object _get_1 = ctx.get(this.partialIFCDataSlot);
    this.partialIFCModel = ((OurIFC) _get_1);
    EClass _ifcOwnerHistory = this.ifcPackage.getIfcOwnerHistory();
    List<IdEObject> _all = this.ifcModel.<IdEObject>getAll(_ifcOwnerHistory);
    IdEObject _get_2 = _all.get(0);
    this.ownerHistory = ((IfcOwnerHistory) _get_2);
    EList<OurIfcRelAssociatesMaterial> _materialAssociation = this.partialIFCModel.getMaterialAssociation();
    for (final OurIfcRelAssociatesMaterial relation : _materialAssociation) {
      int _iD = relation.getID();
      boolean _equals = (_iD == 0);
      if (_equals) {
        this.addRelation(relation, null);
      }
    }
  }
  
  private void addRelation(final OurIfcRelAssociatesMaterial relation, final IfcMaterialSelect materialInput) {
    try {
      IfcMaterialSelect material = materialInput;
      Ifc2x3tc1Factory factory = Ifc2x3tc1FactoryImpl.eINSTANCE;
      IfcRelAssociatesMaterial _createIfcRelAssociatesMaterial = factory.createIfcRelAssociatesMaterial();
      EClass _eClass = _createIfcRelAssociatesMaterial.eClass();
      IdEObject _create = this.ifcModel.<IdEObject>create(_eClass);
      IfcRelAssociatesMaterial newRelation = ((IfcRelAssociatesMaterial) _create);
      int _minus = (-1);
      relation.setID(_minus);
      String _newIfcGloballyUniqueId = GuidCompressor.getNewIfcGloballyUniqueId();
      newRelation.setGlobalId(_newIfcGloballyUniqueId);
      newRelation.setOwnerHistory(this.ownerHistory);
      boolean _equals = Objects.equal(material, null);
      if (_equals) {
        OurIfcMaterialSelect _material = relation.getMaterial();
        int _iD = _material.getID();
        boolean _equals_1 = (_iD == 0);
        if (_equals_1) {
          OurIfcMaterialSelect _material_1 = relation.getMaterial();
          IfcMaterial _addMaterial = this.addMaterial(((OurIfcMaterial) _material_1));
          material = _addMaterial;
        } else {
          OurIfcMaterialSelect _material_2 = relation.getMaterial();
          IfcMaterialSelect _findMaterial = this.findMaterial(_material_2);
          material = _findMaterial;
        }
      }
      newRelation.setRelatingMaterial(material);
      EList<OurIfcRoot> _relatedElements = relation.getRelatedElements();
      for (final OurIfcRoot element : _relatedElements) {
        EList<IfcRoot> _relatedObjects = newRelation.getRelatedObjects();
        IfcObjectDefinition _findElement = this.findElement(element);
        _relatedObjects.add(_findElement);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private IfcMaterial addMaterial(final OurIfcMaterial inputMaterial) {
    try {
      Ifc2x3tc1Factory factory = Ifc2x3tc1FactoryImpl.eINSTANCE;
      IfcMaterial _createIfcMaterial = factory.createIfcMaterial();
      EClass _eClass = _createIfcMaterial.eClass();
      IdEObject _create = this.ifcModel.<IdEObject>create(_eClass);
      IfcMaterial newMaterial = ((IfcMaterial) _create);
      EList<OurIfcRelAssociatesMaterial> _materialAssociation = this.partialIFCModel.getMaterialAssociation();
      final Function1<OurIfcRelAssociatesMaterial,Boolean> _function = new Function1<OurIfcRelAssociatesMaterial,Boolean>() {
          public Boolean apply(final OurIfcRelAssociatesMaterial it) {
            boolean _and = false;
            OurIfcMaterialSelect _material = it.getMaterial();
            boolean _equals = Objects.equal(_material, inputMaterial);
            if (!_equals) {
              _and = false;
            } else {
              int _iD = it.getID();
              int _minus = (-1);
              boolean _notEquals = (_iD != _minus);
              _and = (_equals && _notEquals);
            }
            return Boolean.valueOf(_and);
          }
        };
      Iterable<OurIfcRelAssociatesMaterial> _filter = IterableExtensions.<OurIfcRelAssociatesMaterial>filter(_materialAssociation, _function);
      for (final OurIfcRelAssociatesMaterial relation : _filter) {
        this.addRelation(relation, newMaterial);
      }
      String _name = inputMaterial.getName();
      newMaterial.setName(_name);
      return newMaterial;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private IfcObjectDefinition _findElement(final OurIfcElement element) {
    List<IfcElement> _allWithSubTypes = this.ifcModel.<IfcElement>getAllWithSubTypes(IfcElement.class);
    final Function1<IfcElement,Boolean> _function = new Function1<IfcElement,Boolean>() {
        public Boolean apply(final IfcElement it) {
          int _expressId = it.getExpressId();
          int _iD = element.getID();
          boolean _equals = (_expressId == _iD);
          return Boolean.valueOf(_equals);
        }
      };
    return IterableExtensions.<IfcElement>findFirst(_allWithSubTypes, _function);
  }
  
  private IfcObjectDefinition _findElement(final OurIfcElementType element) {
    List<IfcElementType> _allWithSubTypes = this.ifcModel.<IfcElementType>getAllWithSubTypes(IfcElementType.class);
    final Function1<IfcElementType,Boolean> _function = new Function1<IfcElementType,Boolean>() {
        public Boolean apply(final IfcElementType it) {
          int _expressId = it.getExpressId();
          int _iD = element.getID();
          boolean _equals = (_expressId == _iD);
          return Boolean.valueOf(_equals);
        }
      };
    return IterableExtensions.<IfcElementType>findFirst(_allWithSubTypes, _function);
  }
  
  private IfcMaterialSelect _findMaterial(final OurIfcMaterial material) {
    List<IfcMaterial> _all = this.ifcModel.<IfcMaterial>getAll(IfcMaterial.class);
    final Function1<IfcMaterial,Boolean> _function = new Function1<IfcMaterial,Boolean>() {
        public Boolean apply(final IfcMaterial it) {
          int _expressId = it.getExpressId();
          int _iD = material.getID();
          boolean _equals = (_expressId == _iD);
          return Boolean.valueOf(_equals);
        }
      };
    return IterableExtensions.<IfcMaterial>findFirst(_all, _function);
  }
  
  private IfcMaterialSelect _findMaterial(final OurIfcMaterialList material) {
    List<IfcMaterialList> _all = this.ifcModel.<IfcMaterialList>getAll(IfcMaterialList.class);
    final Function1<IfcMaterialList,Boolean> _function = new Function1<IfcMaterialList,Boolean>() {
        public Boolean apply(final IfcMaterialList it) {
          int _expressId = it.getExpressId();
          int _iD = material.getID();
          boolean _equals = (_expressId == _iD);
          return Boolean.valueOf(_equals);
        }
      };
    return IterableExtensions.<IfcMaterialList>findFirst(_all, _function);
  }
  
  private IfcMaterialSelect _findMaterial(final OurIfcMaterialLayer material) {
    List<IfcMaterialLayer> _all = this.ifcModel.<IfcMaterialLayer>getAll(IfcMaterialLayer.class);
    final Function1<IfcMaterialLayer,Boolean> _function = new Function1<IfcMaterialLayer,Boolean>() {
        public Boolean apply(final IfcMaterialLayer it) {
          int _expressId = it.getExpressId();
          int _iD = material.getID();
          boolean _equals = (_expressId == _iD);
          return Boolean.valueOf(_equals);
        }
      };
    return IterableExtensions.<IfcMaterialLayer>findFirst(_all, _function);
  }
  
  private IfcMaterialSelect _findMaterial(final OurIfcMaterialLayerSet material) {
    List<IfcMaterialLayerSet> _all = this.ifcModel.<IfcMaterialLayerSet>getAll(IfcMaterialLayerSet.class);
    final Function1<IfcMaterialLayerSet,Boolean> _function = new Function1<IfcMaterialLayerSet,Boolean>() {
        public Boolean apply(final IfcMaterialLayerSet it) {
          int _expressId = it.getExpressId();
          int _iD = material.getID();
          boolean _equals = (_expressId == _iD);
          return Boolean.valueOf(_equals);
        }
      };
    return IterableExtensions.<IfcMaterialLayerSet>findFirst(_all, _function);
  }
  
  private IfcMaterialSelect _findMaterial(final OurIfcMaterialLayerSetUsage material) {
    List<IfcMaterialLayerSetUsage> _all = this.ifcModel.<IfcMaterialLayerSetUsage>getAll(IfcMaterialLayerSetUsage.class);
    final Function1<IfcMaterialLayerSetUsage,Boolean> _function = new Function1<IfcMaterialLayerSetUsage,Boolean>() {
        public Boolean apply(final IfcMaterialLayerSetUsage it) {
          int _expressId = it.getExpressId();
          int _iD = material.getID();
          boolean _equals = (_expressId == _iD);
          return Boolean.valueOf(_equals);
        }
      };
    return IterableExtensions.<IfcMaterialLayerSetUsage>findFirst(_all, _function);
  }
  
  public void postInvoke() {
  }
  
  public void preInvoke() {
  }
  
  private IfcObjectDefinition findElement(final OurIfcRoot element) {
    if (element instanceof OurIfcElement) {
      return _findElement((OurIfcElement)element);
    } else if (element instanceof OurIfcElementType) {
      return _findElement((OurIfcElementType)element);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(element).toString());
    }
  }
  
  private IfcMaterialSelect findMaterial(final OurIfcMaterialSelect material) {
    if (material instanceof OurIfcMaterial) {
      return _findMaterial((OurIfcMaterial)material);
    } else if (material instanceof OurIfcMaterialLayer) {
      return _findMaterial((OurIfcMaterialLayer)material);
    } else if (material instanceof OurIfcMaterialLayerSet) {
      return _findMaterial((OurIfcMaterialLayerSet)material);
    } else if (material instanceof OurIfcMaterialLayerSetUsage) {
      return _findMaterial((OurIfcMaterialLayerSetUsage)material);
    } else if (material instanceof OurIfcMaterialList) {
      return _findMaterial((OurIfcMaterialList)material);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(material).toString());
    }
  }
}
