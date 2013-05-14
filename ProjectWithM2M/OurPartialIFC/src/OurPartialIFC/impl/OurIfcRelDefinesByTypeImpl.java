/**
 */
package OurPartialIFC.impl;

import OurPartialIFC.OurIfcElement;
import OurPartialIFC.OurIfcElementType;
import OurPartialIFC.OurIfcRelDefinesByType;
import OurPartialIFC.OurPartialIFCPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Our Ifc Rel Defines By Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link OurPartialIFC.impl.OurIfcRelDefinesByTypeImpl#getElementType <em>Element Type</em>}</li>
 *   <li>{@link OurPartialIFC.impl.OurIfcRelDefinesByTypeImpl#getDefinedElements <em>Defined Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OurIfcRelDefinesByTypeImpl extends EObjectImpl implements OurIfcRelDefinesByType {
	/**
	 * The cached value of the '{@link #getElementType() <em>Element Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementType()
	 * @generated
	 * @ordered
	 */
	protected OurIfcElementType elementType;

	/**
	 * The cached value of the '{@link #getDefinedElements() <em>Defined Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<OurIfcElement> definedElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OurIfcRelDefinesByTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OurPartialIFCPackage.Literals.OUR_IFC_REL_DEFINES_BY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OurIfcElementType getElementType() {
		if (elementType != null && elementType.eIsProxy()) {
			InternalEObject oldElementType = (InternalEObject)elementType;
			elementType = (OurIfcElementType)eResolveProxy(oldElementType);
			if (elementType != oldElementType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OurPartialIFCPackage.OUR_IFC_REL_DEFINES_BY_TYPE__ELEMENT_TYPE, oldElementType, elementType));
			}
		}
		return elementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OurIfcElementType basicGetElementType() {
		return elementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementType(OurIfcElementType newElementType) {
		OurIfcElementType oldElementType = elementType;
		elementType = newElementType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OurPartialIFCPackage.OUR_IFC_REL_DEFINES_BY_TYPE__ELEMENT_TYPE, oldElementType, elementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OurIfcElement> getDefinedElements() {
		if (definedElements == null) {
			definedElements = new EObjectResolvingEList<OurIfcElement>(OurIfcElement.class, this, OurPartialIFCPackage.OUR_IFC_REL_DEFINES_BY_TYPE__DEFINED_ELEMENTS);
		}
		return definedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OurPartialIFCPackage.OUR_IFC_REL_DEFINES_BY_TYPE__ELEMENT_TYPE:
				if (resolve) return getElementType();
				return basicGetElementType();
			case OurPartialIFCPackage.OUR_IFC_REL_DEFINES_BY_TYPE__DEFINED_ELEMENTS:
				return getDefinedElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OurPartialIFCPackage.OUR_IFC_REL_DEFINES_BY_TYPE__ELEMENT_TYPE:
				setElementType((OurIfcElementType)newValue);
				return;
			case OurPartialIFCPackage.OUR_IFC_REL_DEFINES_BY_TYPE__DEFINED_ELEMENTS:
				getDefinedElements().clear();
				getDefinedElements().addAll((Collection<? extends OurIfcElement>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OurPartialIFCPackage.OUR_IFC_REL_DEFINES_BY_TYPE__ELEMENT_TYPE:
				setElementType((OurIfcElementType)null);
				return;
			case OurPartialIFCPackage.OUR_IFC_REL_DEFINES_BY_TYPE__DEFINED_ELEMENTS:
				getDefinedElements().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OurPartialIFCPackage.OUR_IFC_REL_DEFINES_BY_TYPE__ELEMENT_TYPE:
				return elementType != null;
			case OurPartialIFCPackage.OUR_IFC_REL_DEFINES_BY_TYPE__DEFINED_ELEMENTS:
				return definedElements != null && !definedElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OurIfcRelDefinesByTypeImpl
