/**
 *
 */
package com.xnzk.flash.meta.tenant;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.xnzk.flash.meta.tenant.TenantPackage
 * @generated
 */
public interface TenantFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    TenantFactory eINSTANCE = com.xnzk.flash.meta.tenant.impl.TenantFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Tenant</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Tenant</em>'.
     * @generated
     */
    Tenant createTenant();

    /**
     * Returns a new object of class '<em>Application</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Application</em>'.
     * @generated
     */
    Application createApplication();

    /**
     * Returns a new object of class '<em>Flow</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Flow</em>'.
     * @generated
     */
    Flow createFlow();

    /**
     * Returns a new object of class '<em>Component</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Component</em>'.
     * @generated
     */
    Component createComponent();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    TenantPackage getTenantPackage();

} //TenantFactory
