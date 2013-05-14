/**
 */
package OurPartialIFC;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Our Ifc Rel Defines By Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OurPartialIFC.OurIfcRelDefinesByType#getElementType <em>Element Type</em>}</li>
 *   <li>{@link OurPartialIFC.OurIfcRelDefinesByType#getDefinedElements <em>Defined Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see OurPartialIFC.OurPartialIFCPackage#getOurIfcRelDefinesByType()
 * @model
 * @generated
 */
public interface OurIfcRelDefinesByType extends EObject {
	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Type</em>' reference.
	 * @see #setElementType(OurIfcElementType)
	 * @see OurPartialIFC.OurPartialIFCPackage#getOurIfcRelDefinesByType_ElementType()
	 * @model required="true"
	 * @generated
	 */
	OurIfcElementType getElementType();

	/**
	 * Sets the value of the '{@link OurPartialIFC.OurIfcRelDefinesByType#getElementType <em>Element Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Type</em>' reference.
	 * @see #getElementType()
	 * @generated
	 */
	void setElementType(OurIfcElementType value);

	/**
	 * Returns the value of the '<em><b>Defined Elements</b></em>' reference list.
	 * The list contents are of type {@link OurPartialIFC.OurIfcElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defined Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defined Elements</em>' reference list.
	 * @see OurPartialIFC.OurPartialIFCPackage#getOurIfcRelDefinesByType_DefinedElements()
	 * @model required="true"
	 * @generated
	 */
	EList<OurIfcElement> getDefinedElements();

} // OurIfcRelDefinesByType
