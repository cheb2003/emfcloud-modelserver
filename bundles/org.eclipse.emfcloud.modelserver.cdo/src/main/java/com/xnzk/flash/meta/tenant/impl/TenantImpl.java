/**
 *
 */
package com.xnzk.flash.meta.tenant.impl;

import com.xnzk.flash.meta.impl.AuditImpl;

import com.xnzk.flash.meta.tenant.Application;
import com.xnzk.flash.meta.tenant.Tenant;
import com.xnzk.flash.meta.tenant.TenantPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tenant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.xnzk.flash.meta.tenant.impl.TenantImpl#getApplications <em>Applications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TenantImpl extends AuditImpl implements Tenant {
    /**
     * The cached value of the '{@link #getApplications() <em>Applications</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getApplications()
     * @generated
     * @ordered
     */
    protected EList<Application> applications;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TenantImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TenantPackage.Literals.TENANT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Application> getApplications() {
        if (applications == null) {
            applications = new EObjectResolvingEList<Application>(Application.class, this, TenantPackage.TENANT__APPLICATIONS);
        }
        return applications;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TenantPackage.TENANT__APPLICATIONS:
                return getApplications();
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
            case TenantPackage.TENANT__APPLICATIONS:
                getApplications().clear();
                getApplications().addAll((Collection<? extends Application>) newValue);
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
            case TenantPackage.TENANT__APPLICATIONS:
                getApplications().clear();
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
            case TenantPackage.TENANT__APPLICATIONS:
                return applications != null && !applications.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //TenantImpl
