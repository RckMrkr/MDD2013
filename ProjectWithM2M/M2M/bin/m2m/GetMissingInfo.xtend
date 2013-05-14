package m2m

import OurPartialIFC.OCL.OCLValidation
import OurPartialIFC.OurIFC
import OurPartialIFC.OurIfcElement
import OurPartialIFC.OurIfcMaterial
import OurPartialIFC.OurPartialIFCFactory
import OurPartialIFC.impl.OurPartialIFCFactoryImpl
import java.awt.Color
import java.awt.Font
import java.awt.SystemColor
import javax.swing.JButton
import javax.swing.JComboBox
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.JTextArea
import javax.swing.JTextField
import javax.swing.JTextPane
import javax.swing.JToolBar
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext

class GetMissingInfo implements IWorkflowComponent {
	
	private String dataSlot	   = "random"
	private OurPartialIFCFactory PartialFactory
	private OCLValidation validator
	private OurIFC ifc
	
	private JFrame frmBimIfcMaterial;
	private JTextField materialField;
	private JTextField descriptionField;
	private JComboBox<String> elementList;
	private JComboBox<String> materialList;
	private JLabel lblResult;
	private JButton submitButton
	private EList<OurIfcElement> elements;
	private JTextPane txtpnNoMissingMaterials
	
	
	def setdataSlot(String dataSlot){
 		this.dataSlot = dataSlot;
	}
	
	override invoke(IWorkflowContext ctx) {
		
		ifc = ctx.get(dataSlot) as OurIFC
		
		//elements = createMissingElementList();
		frmBimIfcMaterial = new JFrame();
		frmBimIfcMaterial.setResizable(false);
		frmBimIfcMaterial.setTitle("BIM IFC Material filler");
		frmBimIfcMaterial.setBounds(100, 100, 650, 500);
		frmBimIfcMaterial.setDefaultCloseOperation(JFrame::EXIT_ON_CLOSE);
		frmBimIfcMaterial.getContentPane().setLayout(null);
		
		
		elementList = new JComboBox();
		elementList.setBounds(408, 120, 226, 20);
		frmBimIfcMaterial.getContentPane().add(elementList);
		
		var toolBar = new JToolBar();
		toolBar.setBackground(Color::WHITE);
		toolBar.setBounds(0, 0, 644, 39);		
		frmBimIfcMaterial.getContentPane().add(toolBar);		
		var btnNewButton = new JButton("New button");
		toolBar.add(btnNewButton);
		
		var btnNewButton_1 = new JButton("New button");
		toolBar.add(btnNewButton_1);
		
		lblResult = new JLabel("");
		lblResult.setBounds(0, 40, 644, 39);
		frmBimIfcMaterial.getContentPane().add(lblResult);		

		
		submitButton = new JButton("Submit Change");
		submitButton.setBounds(450,400,175,33);
		submitButton.addActionListener([
	    	var String description;
	    	
	    	var OurIfcMaterial chosenMaterial
	    	
	    	if (materialField.getText().isEmpty()) { // Creating from existing material
	    		chosenMaterial = ifc.materials.get(materialList.selectedIndex)
	    		description = "An existing material has been added and used for this relation"
	    	}
	    	else {
	    		chosenMaterial = PartialFactory.createOurIfcMaterial()
	    		(chosenMaterial as OurIfcMaterial).setName(materialField.getText())
	    		ifc.materials.add(chosenMaterial);
	    		if (validator.materialNameIsUnique(chosenMaterial)){
	    			chosenMaterial.setID(0)
	    			ifc.materials.add(chosenMaterial)
	    			description = "A new material has been added and used for this relation"
	    			buildMaterialList()
	    		}
	    		else{
	    			ifc.materials.remove(chosenMaterial)
	    			chosenMaterial = ifc.materials.findFirst[it.name == materialField.getText()]
	    			description = "A material already had that description. That material has been used"
	    		} 		
	    	}
	    	
	    	
    		var newAssociation = PartialFactory.createOurIfcRelAssociatesMaterial()
    		var selectedElement = elements.get(elementList.getSelectedIndex());
    		
    		if (chosenMaterial == null)
    			println("Et materiale er null")
    		
    		newAssociation.setMaterial(chosenMaterial)
    		newAssociation.setID(0)
    		newAssociation.relatedElements.add(selectedElement);
    	
    		ifc.materialAssociation.add(newAssociation)
			lblResult.setText("A new relation between material and element/elementtype has been made.\r\n" + description);    		    		
    		materialField.setText("");
    		descriptionField.setText("");
    		elements.remove(elementList.getSelectedIndex())
    		rebuildElementList();
		]); // ActionListener to be added
		frmBimIfcMaterial.getContentPane().add(submitButton);
		
		txtpnNoMissingMaterials = new JTextPane();
		txtpnNoMissingMaterials.setEditable(false);
		txtpnNoMissingMaterials.setBounds(10, 80, 624, 25);
		frmBimIfcMaterial.getContentPane().add(txtpnNoMissingMaterials);		
		rebuildElementList();
		if (elements.size == 0){
			return
		}
		var lblChooseElement = new JLabel("Choose element: ");
		lblChooseElement.setBounds(301, 123, 97, 14);
		lblChooseElement.add(new JLabel("thata"));
		frmBimIfcMaterial.getContentPane().add(lblChooseElement);
		
		var lblIfcwallId = new JLabel("IFCWall - ID: 3849281");
		lblIfcwallId.setFont(new Font("Tahoma", Font::PLAIN, 22));
		lblIfcwallId.setBounds(46, 180, 352, 39);
		frmBimIfcMaterial.getContentPane().add(lblIfcwallId);
		
		var txtrSomeMoreInformation = new JTextArea();
		txtrSomeMoreInformation.setBackground(SystemColor::menu);
		txtrSomeMoreInformation.setFont(new Font("Tahoma", Font::PLAIN, 11));
		txtrSomeMoreInformation.setText("Some more information about the material,\r\nmaybe the description?");
		txtrSomeMoreInformation.setBounds(46, 216, 209, 39);
		frmBimIfcMaterial.getContentPane().add(txtrSomeMoreInformation);
		
		var lblA = new JLabel("a)");
		lblA.setBounds(46, 266, 46, 14);
		frmBimIfcMaterial.getContentPane().add(lblA);
		
		var lblB = new JLabel("b)");
		lblB.setBounds(46, 303, 46, 14);
		frmBimIfcMaterial.getContentPane().add(lblB);
		
		var lblExistingMaterial = new JLabel("Existing material");
		lblExistingMaterial.setBounds(70, 266, 97, 14);
		frmBimIfcMaterial.getContentPane().add(lblExistingMaterial);
		
		var lblCreateNewMaterial = new JLabel("Create new material");
		lblCreateNewMaterial.setBounds(70, 303, 97, 14);
		frmBimIfcMaterial.getContentPane().add(lblCreateNewMaterial);
		
		materialList = new JComboBox()
		materialList.setBounds(191, 263, 209, 20);
		frmBimIfcMaterial.getContentPane().add(materialList);
		
		buildMaterialList()
		
		var lblName = new JLabel("Name");
		lblName.setBounds(80, 338, 46, 14);
		frmBimIfcMaterial.getContentPane().add(lblName);
		
		var lblDescription = new JLabel("Description");
		lblDescription.setBounds(80, 370, 87, 14);
		frmBimIfcMaterial.getContentPane().add(lblDescription);
		
		materialField = new JTextField();
		materialField.setBounds(191, 335, 207, 20);
		frmBimIfcMaterial.getContentPane().add(materialField);
		materialField.setColumns(10);
		
		descriptionField = new JTextField();
		descriptionField.setColumns(10);
		descriptionField.setBounds(191, 367, 207, 20);
		frmBimIfcMaterial.getContentPane().add(descriptionField);
		
		var txtpnPic = new JTextPane();
		txtpnPic.setText("Pic?");
		txtpnPic.setBounds(428, 177, 192, 207);
		frmBimIfcMaterial.getContentPane().add(txtpnPic);
	
		frmBimIfcMaterial.setVisible(true)
		
		while(frmBimIfcMaterial.displayable){
			Thread::sleep(1000)
		}
	}
	
	def private rebuildElementList() {
		elements = createMissingElementList();
		
		if (elements.size() == 0)
			frmBimIfcMaterial.dispose()
		else{
			elementList.removeAllItems()
			
			for (element : elements) {
				var idString = Integer::toString(element.ID)
				elementList.addItem(idString + ": " + element.type)
			}
			
			elementList.setSelectedIndex(0);
			
			txtpnNoMissingMaterials.setText(elements.size() + " element(s) missing material")
		}
	}
	
	def private buildMaterialList(){
		
		materialList.removeAllItems();
		
		for (material : ifc.materials) {
			materialList.addItem(material.name)
		}
	}
	
	def private createMissingElementList(){
		var EList<OurIfcElement> unreferencedElements = new BasicEList()
		
		for(element : ifc.elements.sortBy[ID]){
			if (!validator.elementHasAssociation(element))
				unreferencedElements.add(element)
		}
		
		return unreferencedElements
	}
	
	override postInvoke() {
		//throw new UnsupportedOperationException("Auto-generated function stub")
	}
	
	override preInvoke() {
		PartialFactory	= new OurPartialIFCFactoryImpl()
		validator		= new OCLValidation();
	}
	
}