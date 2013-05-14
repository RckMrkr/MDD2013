/**
 */
package OurPartialIFC;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Our Ifc Rel Associates Material</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OurPartialIFC.OurIfcRelAssociatesMaterial#getRelatedElements <em>Related Elements</em>}</li>
 *   <li>{@link OurPartialIFC.OurIfcRelAssociatesMaterial#getMaterial <em>Material</em>}</li>
 * </ul>
 * </p>
 *
 * @see OurPartialIFC.OurPartialIFCPackage#getOurIfcRelAssociatesMaterial()
 * @model
 * @generated
 */
public interface OurIfcRelAssociatesMaterial extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Related Elements</b></em>' reference list.
	 * The list contents are of type {@link OurPartialIFC.OurIfcRoot}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Elements</em>' reference list.
	 * @see OurPartialIFC.OurPartialIFCPackage#getOurIfcRelAssociatesMaterial_RelatedElements()
	 * @model required="true"
	 * @generated
	 */
	EList<OurIfcRoot> getRelatedElements();

	/**
	 * Returns the value of the '<em><b>Material</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material</em>' reference.
	 * @see #setMaterial(OurIfcMaterialSelect)
	 * @see OurPartialIFC.OurPartialIFCPackage#getOurIfcRelAssociatesMaterial_Material()
	 * @model required="true"
	 * @generated
	 */
	OurIfcMaterialSelect getMaterial();

	/**
	 * Sets the value of the '{@link OurPartialIFC.OurIfcRelAssociatesMaterial#getMaterial <em>Material</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material</em>' reference.
	 * @see #getMaterial()
	 * @generated
	 */
	void setMaterial(OurIfcMaterialSelect value);

} // OurIfcRelAssociatesMaterial
