package m2m;

import OurPartialIFC.OCL.OCLValidation;
import OurPartialIFC.OurIFC;
import OurPartialIFC.OurIfcElement;
import OurPartialIFC.OurIfcMaterial;
import OurPartialIFC.OurIfcRelAssociatesMaterial;
import OurPartialIFC.OurIfcRoot;
import OurPartialIFC.OurPartialIFCFactory;
import OurPartialIFC.impl.OurPartialIFCFactoryImpl;
import com.google.common.base.Objects;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class GetMissingInfo implements IWorkflowComponent {
  private String dataSlot = "random";
  
  private OurPartialIFCFactory PartialFactory;
  
  private OCLValidation validator;
  
  private OurIFC ifc;
  
  private JFrame frmBimIfcMaterial;
  
  private JTextField materialField;
  
  private JTextField descriptionField;
  
  private JComboBox<String> elementList;
  
  private JComboBox<String> materialList;
  
  private JLabel lblResult;
  
  private JButton submitButton;
  
  private EList<OurIfcElement> elements;
  
  private JTextPane txtpnNoMissingMaterials;
  
  public String setdataSlot(final String dataSlot) {
    String _dataSlot = this.dataSlot = dataSlot;
    return _dataSlot;
  }
  
  public void invoke(final IWorkflowContext ctx) {
    try {
      Object _get = ctx.get(this.dataSlot);
      this.ifc = ((OurIFC) _get);
      JFrame _jFrame = new JFrame();
      this.frmBimIfcMaterial = _jFrame;
      this.frmBimIfcMaterial.setResizable(false);
      this.frmBimIfcMaterial.setTitle("BIM IFC Material filler");
      this.frmBimIfcMaterial.setBounds(100, 100, 650, 500);
      this.frmBimIfcMaterial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Container _contentPane = this.frmBimIfcMaterial.getContentPane();
      _contentPane.setLayout(null);
      JComboBox<String> _jComboBox = new JComboBox<String>();
      this.elementList = _jComboBox;
      this.elementList.setBounds(408, 120, 226, 20);
      Container _contentPane_1 = this.frmBimIfcMaterial.getContentPane();
      _contentPane_1.add(this.elementList);
      JToolBar _jToolBar = new JToolBar();
      JToolBar toolBar = _jToolBar;
      toolBar.setBackground(Color.WHITE);
      toolBar.setBounds(0, 0, 644, 39);
      Container _contentPane_2 = this.frmBimIfcMaterial.getContentPane();
      _contentPane_2.add(toolBar);
      JButton _jButton = new JButton("New button");
      JButton btnNewButton = _jButton;
      toolBar.add(btnNewButton);
      JButton _jButton_1 = new JButton("New button");
      JButton btnNewButton_1 = _jButton_1;
      toolBar.add(btnNewButton_1);
      JLabel _jLabel = new JLabel("");
      this.lblResult = _jLabel;
      this.lblResult.setBounds(0, 40, 644, 39);
      Container _contentPane_3 = this.frmBimIfcMaterial.getContentPane();
      _contentPane_3.add(this.lblResult);
      JButton _jButton_2 = new JButton("Submit Change");
      this.submitButton = _jButton_2;
      this.submitButton.setBounds(450, 400, 175, 33);
      final ActionListener _function = new ActionListener() {
          public void actionPerformed(final ActionEvent it) {
            String description = null;
            OurIfcMaterial chosenMaterial = null;
            String _text = GetMissingInfo.this.materialField.getText();
            boolean _isEmpty = _text.isEmpty();
            if (_isEmpty) {
              EList<OurIfcMaterial> _materials = GetMissingInfo.this.ifc.getMaterials();
              int _selectedIndex = GetMissingInfo.this.materialList.getSelectedIndex();
              OurIfcMaterial _get = _materials.get(_selectedIndex);
              chosenMaterial = _get;
              description = "An existing material has been added and used for this relation";
            } else {
              OurIfcMaterial _createOurIfcMaterial = GetMissingInfo.this.PartialFactory.createOurIfcMaterial();
              chosenMaterial = _createOurIfcMaterial;
              String _text_1 = GetMissingInfo.this.materialField.getText();
              ((OurIfcMaterial) chosenMaterial).setName(_text_1);
              EList<OurIfcMaterial> _materials_1 = GetMissingInfo.this.ifc.getMaterials();
              _materials_1.add(chosenMaterial);
              boolean _materialNameIsUnique = GetMissingInfo.this.validator.materialNameIsUnique(chosenMaterial);
              if (_materialNameIsUnique) {
                chosenMaterial.setID(0);
                EList<OurIfcMaterial> _materials_2 = GetMissingInfo.this.ifc.getMaterials();
                _materials_2.add(chosenMaterial);
                description = "A new material has been added and used for this relation";
                GetMissingInfo.this.buildMaterialList();
              } else {
                EList<OurIfcMaterial> _materials_3 = GetMissingInfo.this.ifc.getMaterials();
                _materials_3.remove(chosenMaterial);
                EList<OurIfcMaterial> _materials_4 = GetMissingInfo.this.ifc.getMaterials();
                final Function1<OurIfcMaterial,Boolean> _function = new Function1<OurIfcMaterial,Boolean>() {
                    public Boolean apply(final OurIfcMaterial it) {
                      String _name = it.getName();
                      String _text = GetMissingInfo.this.materialField.getText();
                      boolean _equals = Objects.equal(_name, _text);
                      return Boolean.valueOf(_equals);
                    }
                  };
                OurIfcMaterial _findFirst = IterableExtensions.<OurIfcMaterial>findFirst(_materials_4, _function);
                chosenMaterial = _findFirst;
                description = "A material already had that description. That material has been used";
              }
            }
            OurIfcRelAssociatesMaterial newAssociation = GetMissingInfo.this.PartialFactory.createOurIfcRelAssociatesMaterial();
            int _selectedIndex_1 = GetMissingInfo.this.elementList.getSelectedIndex();
            OurIfcElement selectedElement = GetMissingInfo.this.elements.get(_selectedIndex_1);
            boolean _equals = Objects.equal(chosenMaterial, null);
            if (_equals) {
              InputOutput.<String>println("Et materiale er null");
            }
            newAssociation.setMaterial(chosenMaterial);
            newAssociation.setID(0);
            EList<OurIfcRoot> _relatedElements = newAssociation.getRelatedElements();
            _relatedElements.add(selectedElement);
            EList<OurIfcRelAssociatesMaterial> _materialAssociation = GetMissingInfo.this.ifc.getMaterialAssociation();
            _materialAssociation.add(newAssociation);
            String _plus = ("A new relation between material and element/elementtype has been made.\r\n" + description);
            GetMissingInfo.this.lblResult.setText(_plus);
            GetMissingInfo.this.materialField.setText("");
            GetMissingInfo.this.descriptionField.setText("");
            int _selectedIndex_2 = GetMissingInfo.this.elementList.getSelectedIndex();
            GetMissingInfo.this.elements.remove(_selectedIndex_2);
            GetMissingInfo.this.rebuildElementList();
          }
        };
      this.submitButton.addActionListener(_function);
      Container _contentPane_4 = this.frmBimIfcMaterial.getContentPane();
      _contentPane_4.add(this.submitButton);
      JTextPane _jTextPane = new JTextPane();
      this.txtpnNoMissingMaterials = _jTextPane;
      this.txtpnNoMissingMaterials.setEditable(false);
      this.txtpnNoMissingMaterials.setBounds(10, 80, 624, 25);
      Container _contentPane_5 = this.frmBimIfcMaterial.getContentPane();
      _contentPane_5.add(this.txtpnNoMissingMaterials);
      this.rebuildElementList();
      int _size = this.elements.size();
      boolean _equals = (_size == 0);
      if (_equals) {
        return;
      }
      JLabel _jLabel_1 = new JLabel("Choose element: ");
      JLabel lblChooseElement = _jLabel_1;
      lblChooseElement.setBounds(301, 123, 97, 14);
      JLabel _jLabel_2 = new JLabel("thata");
      lblChooseElement.add(_jLabel_2);
      Container _contentPane_6 = this.frmBimIfcMaterial.getContentPane();
      _contentPane_6.add(lblChooseElement);
      JLabel _jLabel_3 = new JLabel("IFCWall - ID: 3849281");
      JLabel lblIfcwallId = _jLabel_3;
      Font _font = new Font("Tahoma", Font.PLAIN, 22);
      lblIfcwallId.setFont(_font);
      lblIfcwallId.setBounds(46, 180, 352, 39);
      Container _contentPane_7 = this.frmBimIfcMaterial.getContentPane();
      _contentPane_7.add(lblIfcwallId);
      JTextArea _jTextArea = new JTextArea();
      JTextArea txtrSomeMoreInformation = _jTextArea;
      txtrSomeMoreInformation.setBackground(SystemColor.menu);
      Font _font_1 = new Font("Tahoma", Font.PLAIN, 11);
      txtrSomeMoreInformation.setFont(_font_1);
      txtrSomeMoreInformation.setText("Some more information about the material,\r\nmaybe the description?");
      txtrSomeMoreInformation.setBounds(46, 216, 209, 39);
      Container _contentPane_8 = this.frmBimIfcMaterial.getContentPane();
      _contentPane_8.add(txtrSomeMoreInformation);
      JLabel _jLabel_4 = new JLabel("a)");
      JLabel lblA = _jLabel_4;
      lblA.setBounds(46, 266, 46, 14);
      Container _contentPane_9 = this.frmBimIfcMaterial.getContentPane();
      _contentPane_9.add(lblA);
      JLabel _jLabel_5 = new JLabel("b)");
      JLabel lblB = _jLabel_5;
      lblB.setBounds(46, 303, 46, 14);
      Container _contentPane_10 = this.frmBimIfcMaterial.getContentPane();
      _contentPane_10.add(lblB);
      JLabel _jLabel_6 = new JLabel("Existing material");
      JLabel lblExistingMaterial = _jLabel_6;
      lblExistingMaterial.setBounds(70, 266, 97, 14);
      Container _contentPane_11 = this.frmBimIfcMaterial.getContentPane();
      _contentPane_11.add(lblExistingMaterial);
      JLabel _jLabel_7 = new JLabel("Create new material");
      JLabel lblCreateNewMaterial = _jLabel_7;
      lblCreateNewMaterial.setBounds(70, 303, 97, 14);
      Container _contentPane_12 = this.frmBimIfcMaterial.getContentPane();
      _contentPane_12.add(lblCreateNewMaterial);
      JComboBox<String> _jComboBox_1 = new JComboBox<String>();
      this.materialList = _jComboBox_1;
      this.materialList.setBounds(191, 263, 209, 20);
      Container _contentPane_13 = this.frmBimIfcMaterial.getContentPane();
      _contentPane_13.add(this.materialList);
      this.buildMaterialList();
      JLabel _jLabel_8 = new JLabel("Name");
      JLabel lblName = _jLabel_8;
      lblName.setBounds(80, 338, 46, 14);
      Container _contentPane_14 = this.frmBimIfcMaterial.getContentPane();
      _contentPane_14.add(lblName);
      JLabel _jLabel_9 = new JLabel("Description");
      JLabel lblDescription = _jLabel_9;
      lblDescription.setBounds(80, 370, 87, 14);
      Container _contentPane_15 = this.frmBimIfcMaterial.getContentPane();
      _contentPane_15.add(lblDescription);
      JTextField _jTextField = new JTextField();
      this.materialField = _jTextField;
      this.materialField.setBounds(191, 335, 207, 20);
      Container _contentPane_16 = this.frmBimIfcMaterial.getContentPane();
      _contentPane_16.add(this.materialField);
      this.materialField.setColumns(10);
      JTextField _jTextField_1 = new JTextField();
      this.descriptionField = _jTextField_1;
      this.descriptionField.setColumns(10);
      this.descriptionField.setBounds(191, 367, 207, 20);
      Container _contentPane_17 = this.frmBimIfcMaterial.getContentPane();
      _contentPane_17.add(this.descriptionField);
      JTextPane _jTextPane_1 = new JTextPane();
      JTextPane txtpnPic = _jTextPane_1;
      txtpnPic.setText("Pic?");
      txtpnPic.setBounds(428, 177, 192, 207);
      Container _contentPane_18 = this.frmBimIfcMaterial.getContentPane();
      _contentPane_18.add(txtpnPic);
      this.frmBimIfcMaterial.setVisible(true);
      boolean _isDisplayable = this.frmBimIfcMaterial.isDisplayable();
      boolean _while = _isDisplayable;
      while (_while) {
        Thread.sleep(1000);
        boolean _isDisplayable_1 = this.frmBimIfcMaterial.isDisplayable();
        _while = _isDisplayable_1;
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private void rebuildElementList() {
    EList<OurIfcElement> _createMissingElementList = this.createMissingElementList();
    this.elements = _createMissingElementList;
    int _size = this.elements.size();
    boolean _equals = (_size == 0);
    if (_equals) {
      this.frmBimIfcMaterial.dispose();
    } else {
      this.elementList.removeAllItems();
      for (final OurIfcElement element : this.elements) {
        {
          int _iD = element.getID();
          String idString = Integer.toString(_iD);
          String _plus = (idString + ": ");
          String _type = element.getType();
          String _plus_1 = (_plus + _type);
          this.elementList.addItem(_plus_1);
        }
      }
      this.elementList.setSelectedIndex(0);
      int _size_1 = this.elements.size();
      String _plus = (Integer.valueOf(_size_1) + " element(s) missing material");
      this.txtpnNoMissingMaterials.setText(_plus);
    }
  }
  
  private void buildMaterialList() {
    this.materialList.removeAllItems();
    EList<OurIfcMaterial> _materials = this.ifc.getMaterials();
    for (final OurIfcMaterial material : _materials) {
      String _name = material.getName();
      this.materialList.addItem(_name);
    }
  }
  
  private EList<OurIfcElement> createMissingElementList() {
    BasicEList<OurIfcElement> _basicEList = new BasicEList<OurIfcElement>();
    EList<OurIfcElement> unreferencedElements = _basicEList;
    EList<OurIfcElement> _elements = this.ifc.getElements();
    final Function1<OurIfcElement,Integer> _function = new Function1<OurIfcElement,Integer>() {
        public Integer apply(final OurIfcElement it) {
          int _iD = it.getID();
          return Integer.valueOf(_iD);
        }
      };
    List<OurIfcElement> _sortBy = IterableExtensions.<OurIfcElement, Integer>sortBy(_elements, _function);
    for (final OurIfcElement element : _sortBy) {
      boolean _elementHasAssociation = this.validator.elementHasAssociation(element);
      boolean _not = (!_elementHasAssociation);
      if (_not) {
        unreferencedElements.add(element);
      }
    }
    return unreferencedElements;
  }
  
  public void postInvoke() {
  }
  
  public void preInvoke() {
    OurPartialIFCFactoryImpl _ourPartialIFCFactoryImpl = new OurPartialIFCFactoryImpl();
    this.PartialFactory = _ourPartialIFCFactoryImpl;
    OCLValidation _oCLValidation = new OCLValidation();
    this.validator = _oCLValidation;
  }
}
