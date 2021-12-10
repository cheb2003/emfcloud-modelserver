/**
 *
 */
package com.xnzk.flash.meta.tenant.util;

import com.xnzk.flash.meta.Audit;
import com.xnzk.flash.meta.BaseEntity;
import com.xnzk.flash.meta.Named;

import com.xnzk.flash.meta.tenant.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.xnzk.flash.meta.tenant.TenantPackage
 * @generated
 */
public class TenantAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static TenantPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TenantAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = TenantPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject) object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TenantSwitch<Adapter> modelSwitch =
            new TenantSwitch<Adapter>() {
                @Override
                public Adapter caseTenant(Tenant object) {
                    return createTenantAdapter();
                }

                @Override
                public Adapter caseApplication(Application object) {
                    return createApplicationAdapter();
                }

                @Override
                public Adapter caseFlow(Flow object) {
                    return createFlowAdapter();
                }

                @Override
                public Adapter caseComponent(Component object) {
                    return createComponentAdapter();
                }

                @Override
                public Adapter caseBaseEntity(BaseEntity object) {
                    return createBaseEntityAdapter();
                }

                @Override
                public Adapter caseNamed(Named object) {
                    return createNamedAdapter();
                }

                @Override
                public Adapter caseAudit(Audit object) {
                    return createAuditAdapter();
                }

                @Override
                public Adapter defaultCase(EObject object) {
                    return createEObjectAdapter();
                }
            };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject) target);
    }


    /**
     * Creates a new adapter for an object of class '{@link com.xnzk.flash.meta.tenant.Tenant <em>Tenant</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see com.xnzk.flash.meta.tenant.Tenant
     * @generated
     */
    public Adapter createTenantAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link com.xnzk.flash.meta.tenant.Application <em>Application</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see com.xnzk.flash.meta.tenant.Application
     * @generated
     */
    public Adapter createApplicationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link com.xnzk.flash.meta.tenant.Flow <em>Flow</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see com.xnzk.flash.meta.tenant.Flow
     * @generated
     */
    public Adapter createFlowAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link com.xnzk.flash.meta.tenant.Component <em>Component</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see com.xnzk.flash.meta.tenant.Component
     * @generated
     */
    public Adapter createComponentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link com.xnzk.flash.meta.BaseEntity <em>Base Entity</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see com.xnzk.flash.meta.BaseEntity
     * @generated
     */
    public Adapter createBaseEntityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link com.xnzk.flash.meta.Named <em>Named</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see com.xnzk.flash.meta.Named
     * @generated
     */
    public Adapter createNamedAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link com.xnzk.flash.meta.Audit <em>Audit</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see com.xnzk.flash.meta.Audit
     * @generated
     */
    public Adapter createAuditAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //TenantAdapterFactory
