/**
 *
 */
package com.xnzk.flash.meta;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.xnzk.flash.meta.MetaPackage
 * @generated
 */
public interface MetaFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    MetaFactory eINSTANCE = com.xnzk.flash.meta.impl.MetaFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Base Entity</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Base Entity</em>'.
     * @generated
     */
    BaseEntity createBaseEntity();

    /**
     * Returns a new object of class '<em>Audit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Audit</em>'.
     * @generated
     */
    Audit createAudit();

    /**
     * Returns a new object of class '<em>Named</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Named</em>'.
     * @generated
     */
    Named createNamed();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    MetaPackage getMetaPackage();

} //MetaFactory
