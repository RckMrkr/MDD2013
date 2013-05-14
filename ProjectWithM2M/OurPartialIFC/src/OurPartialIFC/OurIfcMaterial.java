/**
 */
package OurPartialIFC;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Our Ifc Material</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OurPartialIFC.OurIfcMaterial#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see OurPartialIFC.OurPartialIFCPackage#getOurIfcMaterial()
 * @model
 * @generated
 */
public interface OurIfcMaterial extends OurIfcMaterialSelect {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see OurPartialIFC.OurPartialIFCPackage#getOurIfcMaterial_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link OurPartialIFC.OurIfcMaterial#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // OurIfcMaterial
