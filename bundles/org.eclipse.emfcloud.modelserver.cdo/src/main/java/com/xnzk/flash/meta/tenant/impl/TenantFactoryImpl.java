/**
 *
 */
package com.xnzk.flash.meta.tenant.impl;

import com.xnzk.flash.meta.tenant.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TenantFactoryImpl extends EFactoryImpl implements TenantFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static TenantFactory init() {
        try {
            TenantFactory theTenantFactory = (TenantFactory) EPackage.Registry.INSTANCE.getEFactory(TenantPackage.eNS_URI);
            if (theTenantFactory != null) {
                return theTenantFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new TenantFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TenantFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case TenantPackage.TENANT:
                return createTenant();
            case TenantPackage.APPLICATION:
                return createApplication();
            case TenantPackage.FLOW:
                return createFlow();
            case TenantPackage.COMPONENT:
                return createComponent();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Tenant createTenant() {
        TenantImpl tenant = new TenantImpl();
        return tenant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Application createApplication() {
        ApplicationImpl application = new ApplicationImpl();
        return application;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Flow createFlow() {
        FlowImpl flow = new FlowImpl();
        return flow;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Component createComponent() {
        ComponentImpl component = new ComponentImpl();
        return component;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TenantPackage getTenantPackage() {
        return (TenantPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static TenantPackage getPackage() {
        return TenantPackage.eINSTANCE;
    }

} //TenantFactoryImpl
