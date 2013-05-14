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
import OurPartialIFC.OurIfcRelDefinesByType;
import OurPartialIFC.OurIfcRoot;
import OurPartialIFC.impl.OurPartialIFCFactoryImpl;
import java.util.Arrays;
import java.util.List;
import org.bimserver.ifc.IfcModel;
import org.bimserver.models.ifc2x3tc1.IfcElement;
import org.bimserver.models.ifc2x3tc1.IfcElementType;
import org.bimserver.models.ifc2x3tc1.IfcMaterial;
import org.bimserver.models.ifc2x3tc1.IfcMaterialLayer;
import org.bimserver.models.ifc2x3tc1.IfcMaterialLayerSet;
import org.bimserver.models.ifc2x3tc1.IfcMaterialLayerSetUsage;
import org.bimserver.models.ifc2x3tc1.IfcMaterialList;
import org.bimserver.models.ifc2x3tc1.IfcMaterialSelect;
import org.bimserver.models.ifc2x3tc1.IfcObject;
import org.bimserver.models.ifc2x3tc1.IfcRelAssociatesMaterial;
import org.bimserver.models.ifc2x3tc1.IfcRelDefinesByType;
import org.bimserver.models.ifc2x3tc1.IfcRoot;
import org.bimserver.models.ifc2x3tc1.IfcTypeObject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class PopulateOwnModel implements IWorkflowComponent {
  private String newDataModelSlot = "random";
  
  private String dataSlot = "random";
  
  private OurPartialIFCFactoryImpl modelFactory = new Function0<OurPartialIFCFactoryImpl>() {
    public OurPartialIFCFactoryImpl apply() {
      OurPartialIFCFactoryImpl _ourPartialIFCFactoryImpl = new OurPartialIFCFactoryImpl();
      return _ourPartialIFCFactoryImpl;
    }
  }.apply();
  
  private OurIFC ifc;
  
  public String setnewDataModelSlot(final String filenameslot) {
    String _newDataModelSlot = this.newDataModelSlot = filenameslot;
    return _newDataModelSlot;
  }
  
  public String setimportedDataSlot(final String dataSlot) {
    String _dataSlot = this.dataSlot = dataSlot;
    return _dataSlot;
  }
  
  public void invoke(final IWorkflowContext ctx) {
    Object _get = ctx.get(this.dataSlot);
    IfcModel importedData = ((IfcModel) _get);
    List<IfcElement> _allWithSubTypes = importedData.<IfcElement>getAllWithSubTypes(IfcElement.class);
    List<IfcElement> elements = ((List<IfcElement>) _allWithSubTypes);
    List<IfcElementType> _allWithSubTypes_1 = importedData.<IfcElementType>getAllWithSubTypes(IfcElementType.class);
    List<IfcElementType> elementtypes = ((List<IfcElementType>) _allWithSubTypes_1);
    List<IfcMaterialSelect> _allWithSubTypes_2 = importedData.<IfcMaterialSelect>getAllWithSubTypes(IfcMaterialSelect.class);
    List<IfcMaterialSelect> materials = ((List<IfcMaterialSelect>) _allWithSubTypes_2);
    List<IfcRelAssociatesMaterial> _all = importedData.<IfcRelAssociatesMaterial>getAll(IfcRelAssociatesMaterial.class);
    List<IfcRelAssociatesMaterial> relations = ((List<IfcRelAssociatesMaterial>) _all);
    List<IfcRelDefinesByType> _all_1 = importedData.<IfcRelDefinesByType>getAll(IfcRelDefinesByType.class);
    List<IfcRelDefinesByType> typedefs = ((List<IfcRelDefinesByType>) _all_1);
    OurIFC _createOurIFC = this.modelFactory.createOurIFC();
    this.ifc = _createOurIFC;
    int _size = elements.size();
    String _plus = ("Begynder med elementer! - " + Integer.valueOf(_size));
    InputOutput.<String>println(_plus);
    for (final IfcElement BIMElement : elements) {
      {
        OurIfcElement ourElement = this.modelFactory.createOurIfcElement();
        int _expressId = BIMElement.getExpressId();
        ourElement.setID(_expressId);
        String _name = BIMElement.getName();
        ourElement.setDescription(_name);
        EClass _eClass = BIMElement.eClass();
        String _name_1 = _eClass.getName();
        ourElement.setType(_name_1);
        EList<OurIfcElement> _elements = this.ifc.getElements();
        _elements.add(ourElement);
      }
    }
    InputOutput.<String>println("Done med elementer!");
    int _size_1 = elementtypes.size();
    String _plus_1 = ("Begynder med elementtyper! - " + Integer.valueOf(_size_1));
    InputOutput.<String>println(_plus_1);
    for (final IfcElementType BIMElementType : elementtypes) {
      {
        OurIfcElementType ourElementType = this.modelFactory.createOurIfcElementType();
        int _expressId = BIMElementType.getExpressId();
        ourElementType.setID(_expressId);
        EList<OurIfcElementType> _elementtypes = this.ifc.getElementtypes();
        _elementtypes.add(ourElementType);
      }
    }
    InputOutput.<String>println("Done med elementtyper!");
    int _size_2 = materials.size();
    String _plus_2 = ("Begynder med materialer! - " + Integer.valueOf(_size_2));
    InputOutput.<String>println(_plus_2);
    for (final IfcMaterialSelect BIMmaterial : materials) {
      this.addMaterial(BIMmaterial);
    }
    InputOutput.<String>println("Done med materialer!");
    int _size_3 = relations.size();
    String _plus_3 = ("Begynder med materialerelationer! - " + Integer.valueOf(_size_3));
    InputOutput.<String>println(_plus_3);
    for (final IfcRelAssociatesMaterial BIMrelation : relations) {
      {
        OurIfcRelAssociatesMaterial ourRelation = this.modelFactory.createOurIfcRelAssociatesMaterial();
        int _expressId = BIMrelation.getExpressId();
        ourRelation.setID(_expressId);
        IfcMaterialSelect _relatingMaterial = BIMrelation.getRelatingMaterial();
        OurIfcMaterialSelect _findMaterial = this.findMaterial(_relatingMaterial);
        ourRelation.setMaterial(_findMaterial);
        EList<IfcRoot> _relatedObjects = BIMrelation.getRelatedObjects();
        for (final IfcRoot relatedObject : _relatedObjects) {
          boolean _matched = false;
          if (!_matched) {
            if (relatedObject instanceof IfcElement) {
              final IfcElement _ifcElement = (IfcElement)relatedObject;
              _matched=true;
              EList<OurIfcRoot> _relatedElements = ourRelation.getRelatedElements();
              EList<OurIfcElement> _elements = this.ifc.getElements();
              final Function1<OurIfcElement,Boolean> _function = new Function1<OurIfcElement,Boolean>() {
                  public Boolean apply(final OurIfcElement it) {
                    int _iD = it.getID();
                    int _expressId = _ifcElement.getExpressId();
                    boolean _equals = (_iD == _expressId);
                    return Boolean.valueOf(_equals);
                  }
                };
              OurIfcElement _findFirst = IterableExtensions.<OurIfcElement>findFirst(_elements, _function);
              _relatedElements.add(_findFirst);
            }
          }
          if (!_matched) {
            if (relatedObject instanceof IfcElementType) {
              final IfcElementType _ifcElementType = (IfcElementType)relatedObject;
              _matched=true;
              EList<OurIfcRoot> _relatedElements = ourRelation.getRelatedElements();
              EList<OurIfcElementType> _elementtypes = this.ifc.getElementtypes();
              final Function1<OurIfcElementType,Boolean> _function = new Function1<OurIfcElementType,Boolean>() {
                  public Boolean apply(final OurIfcElementType it) {
                    int _iD = it.getID();
                    int _expressId = _ifcElementType.getExpressId();
                    boolean _equals = (_iD == _expressId);
                    return Boolean.valueOf(_equals);
                  }
                };
              OurIfcElementType _findFirst = IterableExtensions.<OurIfcElementType>findFirst(_elementtypes, _function);
              _relatedElements.add(_findFirst);
            }
          }
        }
        EList<OurIfcRelAssociatesMaterial> _materialAssociation = this.ifc.getMaterialAssociation();
        _materialAssociation.add(ourRelation);
      }
    }
    InputOutput.<String>println("Done med materialerelationer!");
    int _size_4 = typedefs.size();
    String _plus_4 = ("Begynder med typerelationer! - " + Integer.valueOf(_size_4));
    InputOutput.<String>println(_plus_4);
    for (final IfcRelDefinesByType BIMtypedef : typedefs) {
      {
        OurIfcRelDefinesByType ourTypedef = this.modelFactory.createOurIfcRelDefinesByType();
        EList<OurIfcElementType> _elementtypes = this.ifc.getElementtypes();
        final Function1<OurIfcElementType,Boolean> _function = new Function1<OurIfcElementType,Boolean>() {
            public Boolean apply(final OurIfcElementType it) {
              int _iD = it.getID();
              IfcTypeObject _relatingType = BIMtypedef.getRelatingType();
              int _expressId = _relatingType.getExpressId();
              boolean _equals = (_iD == _expressId);
              return Boolean.valueOf(_equals);
            }
          };
        OurIfcElementType _findFirst = IterableExtensions.<OurIfcElementType>findFirst(_elementtypes, _function);
        ourTypedef.setElementType(_findFirst);
        EList<IfcObject> _relatedObjects = BIMtypedef.getRelatedObjects();
        for (final IfcObject relatedType : _relatedObjects) {
          EList<OurIfcElement> _definedElements = ourTypedef.getDefinedElements();
          EList<OurIfcElement> _elements = this.ifc.getElements();
          final Function1<OurIfcElement,Boolean> _function_1 = new Function1<OurIfcElement,Boolean>() {
              public Boolean apply(final OurIfcElement it) {
                int _iD = it.getID();
                int _expressId = relatedType.getExpressId();
                boolean _equals = (_iD == _expressId);
                return Boolean.valueOf(_equals);
              }
            };
          OurIfcElement _findFirst_1 = IterableExtensions.<OurIfcElement>findFirst(_elements, _function_1);
          _definedElements.add(_findFirst_1);
        }
        EList<OurIfcElement> _definedElements_1 = ourTypedef.getDefinedElements();
        int _size_5 = _definedElements_1.size();
        boolean _notEquals = (_size_5 != 0);
        if (_notEquals) {
          EList<OurIfcRelDefinesByType> _typedefinitions = this.ifc.getTypedefinitions();
          _typedefinitions.add(ourTypedef);
        }
      }
    }
    InputOutput.<String>println("Done med typerelationer!");
    ctx.put(this.newDataModelSlot, this.ifc);
  }
  
  private OurIfcMaterialSelect _findMaterial(final IfcMaterial material) {
    EList<OurIfcMaterial> _materials = this.ifc.getMaterials();
    final Function1<OurIfcMaterial,Boolean> _function = new Function1<OurIfcMaterial,Boolean>() {
        public Boolean apply(final OurIfcMaterial it) {
          int _iD = it.getID();
          int _expressId = material.getExpressId();
          boolean _equals = (_iD == _expressId);
          return Boolean.valueOf(_equals);
        }
      };
    return IterableExtensions.<OurIfcMaterial>findFirst(_materials, _function);
  }
  
  private OurIfcMaterialSelect _findMaterial(final IfcMaterialList material) {
    EList<OurIfcMaterialList> _materialLists = this.ifc.getMaterialLists();
    final Function1<OurIfcMaterialList,Boolean> _function = new Function1<OurIfcMaterialList,Boolean>() {
        public Boolean apply(final OurIfcMaterialList it) {
          int _iD = it.getID();
          int _expressId = material.getExpressId();
          boolean _equals = (_iD == _expressId);
          return Boolean.valueOf(_equals);
        }
      };
    return IterableExtensions.<OurIfcMaterialList>findFirst(_materialLists, _function);
  }
  
  private OurIfcMaterialSelect _findMaterial(final IfcMaterialLayer material) {
    EList<OurIfcMaterialLayer> _materialLayers = this.ifc.getMaterialLayers();
    final Function1<OurIfcMaterialLayer,Boolean> _function = new Function1<OurIfcMaterialLayer,Boolean>() {
        public Boolean apply(final OurIfcMaterialLayer it) {
          int _iD = it.getID();
          int _expressId = material.getExpressId();
          boolean _equals = (_iD == _expressId);
          return Boolean.valueOf(_equals);
        }
      };
    return IterableExtensions.<OurIfcMaterialLayer>findFirst(_materialLayers, _function);
  }
  
  private OurIfcMaterialSelect _findMaterial(final IfcMaterialLayerSet material) {
    EList<OurIfcMaterialLayerSet> _materialLayerSet = this.ifc.getMaterialLayerSet();
    final Function1<OurIfcMaterialLayerSet,Boolean> _function = new Function1<OurIfcMaterialLayerSet,Boolean>() {
        public Boolean apply(final OurIfcMaterialLayerSet it) {
          int _iD = it.getID();
          int _expressId = material.getExpressId();
          boolean _equals = (_iD == _expressId);
          return Boolean.valueOf(_equals);
        }
      };
    return IterableExtensions.<OurIfcMaterialLayerSet>findFirst(_materialLayerSet, _function);
  }
  
  private OurIfcMaterialSelect _findMaterial(final IfcMaterialLayerSetUsage material) {
    EList<OurIfcMaterialLayerSetUsage> _materialLayerSetUsage = this.ifc.getMaterialLayerSetUsage();
    final Function1<OurIfcMaterialLayerSetUsage,Boolean> _function = new Function1<OurIfcMaterialLayerSetUsage,Boolean>() {
        public Boolean apply(final OurIfcMaterialLayerSetUsage it) {
          int _iD = it.getID();
          int _expressId = material.getExpressId();
          boolean _equals = (_iD == _expressId);
          return Boolean.valueOf(_equals);
        }
      };
    return IterableExtensions.<OurIfcMaterialLayerSetUsage>findFirst(_materialLayerSetUsage, _function);
  }
  
  private boolean _addMaterial(final IfcMaterial material) {
    boolean _xblockexpression = false;
    {
      OurIfcMaterial ourMaterial = this.modelFactory.createOurIfcMaterial();
      int _expressId = material.getExpressId();
      ourMaterial.setID(_expressId);
      String _name = material.getName();
      ourMaterial.setName(_name);
      EList<OurIfcMaterial> _materials = this.ifc.getMaterials();
      boolean _add = _materials.add(ourMaterial);
      _xblockexpression = (_add);
    }
    return _xblockexpression;
  }
  
  private boolean _addMaterial(final IfcMaterialList material) {
    boolean _xblockexpression = false;
    {
      OurIfcMaterialList ourMaterial = this.modelFactory.createOurIfcMaterialList();
      int _expressId = material.getExpressId();
      ourMaterial.setID(_expressId);
      EList<OurIfcMaterialList> _materialLists = this.ifc.getMaterialLists();
      boolean _add = _materialLists.add(ourMaterial);
      _xblockexpression = (_add);
    }
    return _xblockexpression;
  }
  
  private boolean _addMaterial(final IfcMaterialLayer material) {
    boolean _xblockexpression = false;
    {
      OurIfcMaterialLayer ourMaterial = this.modelFactory.createOurIfcMaterialLayer();
      int _expressId = material.getExpressId();
      ourMaterial.setID(_expressId);
      EList<OurIfcMaterialLayer> _materialLayers = this.ifc.getMaterialLayers();
      boolean _add = _materialLayers.add(ourMaterial);
      _xblockexpression = (_add);
    }
    return _xblockexpression;
  }
  
  private boolean _addMaterial(final IfcMaterialLayerSet material) {
    boolean _xblockexpression = false;
    {
      OurIfcMaterialLayerSet ourMaterial = this.modelFactory.createOurIfcMaterialLayerSet();
      int _expressId = material.getExpressId();
      ourMaterial.setID(_expressId);
      EList<OurIfcMaterialLayerSet> _materialLayerSet = this.ifc.getMaterialLayerSet();
      boolean _add = _materialLayerSet.add(ourMaterial);
      _xblockexpression = (_add);
    }
    return _xblockexpression;
  }
  
  private boolean _addMaterial(final IfcMaterialLayerSetUsage material) {
    boolean _xblockexpression = false;
    {
      OurIfcMaterialLayerSetUsage ourMaterial = this.modelFactory.createOurIfcMaterialLayerSetUsage();
      int _expressId = material.getExpressId();
      ourMaterial.setID(_expressId);
      EList<OurIfcMaterialLayerSetUsage> _materialLayerSetUsage = this.ifc.getMaterialLayerSetUsage();
      boolean _add = _materialLayerSetUsage.add(ourMaterial);
      _xblockexpression = (_add);
    }
    return _xblockexpression;
  }
  
  public void postInvoke() {
  }
  
  public void preInvoke() {
  }
  
  private OurIfcMaterialSelect findMaterial(final IfcMaterialSelect material) {
    if (material instanceof IfcMaterial) {
      return _findMaterial((IfcMaterial)material);
    } else if (material instanceof IfcMaterialLayer) {
      return _findMaterial((IfcMaterialLayer)material);
    } else if (material instanceof IfcMaterialLayerSet) {
      return _findMaterial((IfcMaterialLayerSet)material);
    } else if (material instanceof IfcMaterialLayerSetUsage) {
      return _findMaterial((IfcMaterialLayerSetUsage)material);
    } else if (material instanceof IfcMaterialList) {
      return _findMaterial((IfcMaterialList)material);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(material).toString());
    }
  }
  
  private boolean addMaterial(final IfcMaterialSelect material) {
    if (material instanceof IfcMaterial) {
      return _addMaterial((IfcMaterial)material);
    } else if (material instanceof IfcMaterialLayer) {
      return _addMaterial((IfcMaterialLayer)material);
    } else if (material instanceof IfcMaterialLayerSet) {
      return _addMaterial((IfcMaterialLayerSet)material);
    } else if (material instanceof IfcMaterialLayerSetUsage) {
      return _addMaterial((IfcMaterialLayerSetUsage)material);
    } else if (material instanceof IfcMaterialList) {
      return _addMaterial((IfcMaterialList)material);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(material).toString());
    }
  }
}
