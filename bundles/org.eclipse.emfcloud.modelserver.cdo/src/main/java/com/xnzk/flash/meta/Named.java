/**
 *
 */
package com.xnzk.flash.meta;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.xnzk.flash.meta.Named#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.xnzk.flash.meta.MetaPackage#getNamed()
 * @model
 * @generated
 */
public interface Named extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see com.xnzk.flash.meta.MetaPackage#getNamed_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link com.xnzk.flash.meta.Named#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // Named
