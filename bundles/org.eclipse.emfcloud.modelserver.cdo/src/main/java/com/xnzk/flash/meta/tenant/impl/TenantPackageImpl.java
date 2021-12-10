/**
 *
 */
package com.xnzk.flash.meta.tenant.impl;

import com.xnzk.flash.meta.MetaPackage;

import com.xnzk.flash.meta.impl.MetaPackageImpl;

import com.xnzk.flash.meta.tenant.Application;
import com.xnzk.flash.meta.tenant.Component;
import com.xnzk.flash.meta.tenant.Flow;
import com.xnzk.flash.meta.tenant.Tenant;
import com.xnzk.flash.meta.tenant.TenantFactory;
import com.xnzk.flash.meta.tenant.TenantPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TenantPackageImpl extends EPackageImpl implements TenantPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tenantEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass applicationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass flowEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass componentEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see com.xnzk.flash.meta.tenant.TenantPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private TenantPackageImpl() {
        super(eNS_URI, TenantFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     *
     * <p>This method is used to initialize {@link TenantPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static TenantPackage init() {
        if (isInited) return (TenantPackage) EPackage.Registry.INSTANCE.getEPackage(TenantPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredTenantPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        TenantPackageImpl theTenantPackage = registeredTenantPackage instanceof TenantPackageImpl ? (TenantPackageImpl) registeredTenantPackage : new TenantPackageImpl();

        isInited = true;

        // Obtain or create and register interdependencies
        Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MetaPackage.eNS_URI);
        MetaPackageImpl theMetaPackage = (MetaPackageImpl) (registeredPackage instanceof MetaPackageImpl ? registeredPackage : MetaPackage.eINSTANCE);

        // Create package meta-data objects
        theTenantPackage.createPackageContents();
        theMetaPackage.createPackageContents();

        // Initialize created meta-data
        theTenantPackage.initializePackageContents();
        theMetaPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theTenantPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(TenantPackage.eNS_URI, theTenantPackage);
        return theTenantPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTenant() {
        return tenantEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTenant_Applications() {
        return (EReference) tenantEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getApplication() {
        return applicationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getApplication_Version() {
        return (EAttribute) applicationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFlow() {
        return flowEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getComponent() {
        return componentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TenantFactory getTenantFactory() {
        return (TenantFactory) getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        tenantEClass = createEClass(TENANT);
        createEReference(tenantEClass, TENANT__APPLICATIONS);

        applicationEClass = createEClass(APPLICATION);
        createEAttribute(applicationEClass, APPLICATION__VERSION);

        flowEClass = createEClass(FLOW);

        componentEClass = createEClass(COMPONENT);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        MetaPackage theMetaPackage = (MetaPackage) EPackage.Registry.INSTANCE.getEPackage(MetaPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        tenantEClass.getESuperTypes().add(theMetaPackage.getAudit());
        applicationEClass.getESuperTypes().add(theMetaPackage.getAudit());
        applicationEClass.getESuperTypes().add(theMetaPackage.getNamed());
        flowEClass.getESuperTypes().add(theMetaPackage.getAudit());
        flowEClass.getESuperTypes().add(theMetaPackage.getNamed());
        componentEClass.getESuperTypes().add(theMetaPackage.getAudit());
        componentEClass.getESuperTypes().add(theMetaPackage.getNamed());

        // Initialize classes, features, and operations; add parameters
        initEClass(tenantEClass, Tenant.class, "Tenant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTenant_Applications(), this.getApplication(), null, "applications", null, 0, 2, Tenant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(applicationEClass, Application.class, "Application", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getApplication_Version(), ecorePackage.getEInt(), "version", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(flowEClass, Flow.class, "Flow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);
    }

} //TenantPackageImpl
