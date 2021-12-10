/**
 *
 */
package com.xnzk.flash.meta.tenant;

import com.xnzk.flash.meta.MetaPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.xnzk.flash.meta.tenant.TenantFactory
 * @model kind="package"
 * @generated
 */
public interface TenantPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "tenant";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.xnzk.com/tenant";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "tenant";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    TenantPackage eINSTANCE = com.xnzk.flash.meta.tenant.impl.TenantPackageImpl.init();

    /**
     * The meta object id for the '{@link com.xnzk.flash.meta.tenant.impl.TenantImpl <em>Tenant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.xnzk.flash.meta.tenant.impl.TenantImpl
     * @see com.xnzk.flash.meta.tenant.impl.TenantPackageImpl#getTenant()
     * @generated
     */
    int TENANT = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TENANT__ID = MetaPackage.AUDIT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TENANT__NAME = MetaPackage.AUDIT__NAME;

    /**
     * The feature id for the '<em><b>Created Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TENANT__CREATED_DATE = MetaPackage.AUDIT__CREATED_DATE;

    /**
     * The feature id for the '<em><b>Created By</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TENANT__CREATED_BY = MetaPackage.AUDIT__CREATED_BY;

    /**
     * The feature id for the '<em><b>Last Modified By</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TENANT__LAST_MODIFIED_BY = MetaPackage.AUDIT__LAST_MODIFIED_BY;

    /**
     * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TENANT__LAST_MODIFIED_DATE = MetaPackage.AUDIT__LAST_MODIFIED_DATE;

    /**
     * The feature id for the '<em><b>Deleted By</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TENANT__DELETED_BY = MetaPackage.AUDIT__DELETED_BY;

    /**
     * The feature id for the '<em><b>Deleted Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TENANT__DELETED_DATE = MetaPackage.AUDIT__DELETED_DATE;

    /**
     * The feature id for the '<em><b>Applications</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TENANT__APPLICATIONS = MetaPackage.AUDIT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Tenant</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TENANT_FEATURE_COUNT = MetaPackage.AUDIT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Tenant</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TENANT_OPERATION_COUNT = MetaPackage.AUDIT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link com.xnzk.flash.meta.tenant.impl.ApplicationImpl <em>Application</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.xnzk.flash.meta.tenant.impl.ApplicationImpl
     * @see com.xnzk.flash.meta.tenant.impl.TenantPackageImpl#getApplication()
     * @generated
     */
    int APPLICATION = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__ID = MetaPackage.AUDIT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__NAME = MetaPackage.AUDIT__NAME;

    /**
     * The feature id for the '<em><b>Created Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__CREATED_DATE = MetaPackage.AUDIT__CREATED_DATE;

    /**
     * The feature id for the '<em><b>Created By</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__CREATED_BY = MetaPackage.AUDIT__CREATED_BY;

    /**
     * The feature id for the '<em><b>Last Modified By</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__LAST_MODIFIED_BY = MetaPackage.AUDIT__LAST_MODIFIED_BY;

    /**
     * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__LAST_MODIFIED_DATE = MetaPackage.AUDIT__LAST_MODIFIED_DATE;

    /**
     * The feature id for the '<em><b>Deleted By</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__DELETED_BY = MetaPackage.AUDIT__DELETED_BY;

    /**
     * The feature id for the '<em><b>Deleted Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__DELETED_DATE = MetaPackage.AUDIT__DELETED_DATE;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__VERSION = MetaPackage.AUDIT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Application</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION_FEATURE_COUNT = MetaPackage.AUDIT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Application</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION_OPERATION_COUNT = MetaPackage.AUDIT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link com.xnzk.flash.meta.tenant.impl.FlowImpl <em>Flow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.xnzk.flash.meta.tenant.impl.FlowImpl
     * @see com.xnzk.flash.meta.tenant.impl.TenantPackageImpl#getFlow()
     * @generated
     */
    int FLOW = 2;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW__ID = MetaPackage.AUDIT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW__NAME = MetaPackage.AUDIT__NAME;

    /**
     * The feature id for the '<em><b>Created Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW__CREATED_DATE = MetaPackage.AUDIT__CREATED_DATE;

    /**
     * The feature id for the '<em><b>Created By</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW__CREATED_BY = MetaPackage.AUDIT__CREATED_BY;

    /**
     * The feature id for the '<em><b>Last Modified By</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW__LAST_MODIFIED_BY = MetaPackage.AUDIT__LAST_MODIFIED_BY;

    /**
     * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW__LAST_MODIFIED_DATE = MetaPackage.AUDIT__LAST_MODIFIED_DATE;

    /**
     * The feature id for the '<em><b>Deleted By</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW__DELETED_BY = MetaPackage.AUDIT__DELETED_BY;

    /**
     * The feature id for the '<em><b>Deleted Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW__DELETED_DATE = MetaPackage.AUDIT__DELETED_DATE;

    /**
     * The number of structural features of the '<em>Flow</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_FEATURE_COUNT = MetaPackage.AUDIT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Flow</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_OPERATION_COUNT = MetaPackage.AUDIT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link com.xnzk.flash.meta.tenant.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.xnzk.flash.meta.tenant.impl.ComponentImpl
     * @see com.xnzk.flash.meta.tenant.impl.TenantPackageImpl#getComponent()
     * @generated
     */
    int COMPONENT = 3;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__ID = MetaPackage.AUDIT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__NAME = MetaPackage.AUDIT__NAME;

    /**
     * The feature id for the '<em><b>Created Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__CREATED_DATE = MetaPackage.AUDIT__CREATED_DATE;

    /**
     * The feature id for the '<em><b>Created By</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__CREATED_BY = MetaPackage.AUDIT__CREATED_BY;

    /**
     * The feature id for the '<em><b>Last Modified By</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__LAST_MODIFIED_BY = MetaPackage.AUDIT__LAST_MODIFIED_BY;

    /**
     * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__LAST_MODIFIED_DATE = MetaPackage.AUDIT__LAST_MODIFIED_DATE;

    /**
     * The feature id for the '<em><b>Deleted By</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__DELETED_BY = MetaPackage.AUDIT__DELETED_BY;

    /**
     * The feature id for the '<em><b>Deleted Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__DELETED_DATE = MetaPackage.AUDIT__DELETED_DATE;

    /**
     * The number of structural features of the '<em>Component</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT_FEATURE_COUNT = MetaPackage.AUDIT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Component</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT_OPERATION_COUNT = MetaPackage.AUDIT_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link com.xnzk.flash.meta.tenant.Tenant <em>Tenant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Tenant</em>'.
     * @see com.xnzk.flash.meta.tenant.Tenant
     * @generated
     */
    EClass getTenant();

    /**
     * Returns the meta object for the reference list '{@link com.xnzk.flash.meta.tenant.Tenant#getApplications <em>Applications</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Applications</em>'.
     * @see com.xnzk.flash.meta.tenant.Tenant#getApplications()
     * @see #getTenant()
     * @generated
     */
    EReference getTenant_Applications();

    /**
     * Returns the meta object for class '{@link com.xnzk.flash.meta.tenant.Application <em>Application</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Application</em>'.
     * @see com.xnzk.flash.meta.tenant.Application
     * @generated
     */
    EClass getApplication();

    /**
     * Returns the meta object for the attribute '{@link com.xnzk.flash.meta.tenant.Application#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see com.xnzk.flash.meta.tenant.Application#getVersion()
     * @see #getApplication()
     * @generated
     */
    EAttribute getApplication_Version();

    /**
     * Returns the meta object for class '{@link com.xnzk.flash.meta.tenant.Flow <em>Flow</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Flow</em>'.
     * @see com.xnzk.flash.meta.tenant.Flow
     * @generated
     */
    EClass getFlow();

    /**
     * Returns the meta object for class '{@link com.xnzk.flash.meta.tenant.Component <em>Component</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Component</em>'.
     * @see com.xnzk.flash.meta.tenant.Component
     * @generated
     */
    EClass getComponent();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    TenantFactory getTenantFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link com.xnzk.flash.meta.tenant.impl.TenantImpl <em>Tenant</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see com.xnzk.flash.meta.tenant.impl.TenantImpl
         * @see com.xnzk.flash.meta.tenant.impl.TenantPackageImpl#getTenant()
         * @generated
         */
        EClass TENANT = eINSTANCE.getTenant();

        /**
         * The meta object literal for the '<em><b>Applications</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TENANT__APPLICATIONS = eINSTANCE.getTenant_Applications();

        /**
         * The meta object literal for the '{@link com.xnzk.flash.meta.tenant.impl.ApplicationImpl <em>Application</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see com.xnzk.flash.meta.tenant.impl.ApplicationImpl
         * @see com.xnzk.flash.meta.tenant.impl.TenantPackageImpl#getApplication()
         * @generated
         */
        EClass APPLICATION = eINSTANCE.getApplication();

        /**
         * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute APPLICATION__VERSION = eINSTANCE.getApplication_Version();

        /**
         * The meta object literal for the '{@link com.xnzk.flash.meta.tenant.impl.FlowImpl <em>Flow</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see com.xnzk.flash.meta.tenant.impl.FlowImpl
         * @see com.xnzk.flash.meta.tenant.impl.TenantPackageImpl#getFlow()
         * @generated
         */
        EClass FLOW = eINSTANCE.getFlow();

        /**
         * The meta object literal for the '{@link com.xnzk.flash.meta.tenant.impl.ComponentImpl <em>Component</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see com.xnzk.flash.meta.tenant.impl.ComponentImpl
         * @see com.xnzk.flash.meta.tenant.impl.TenantPackageImpl#getComponent()
         * @generated
         */
        EClass COMPONENT = eINSTANCE.getComponent();

    }

} //TenantPackage
