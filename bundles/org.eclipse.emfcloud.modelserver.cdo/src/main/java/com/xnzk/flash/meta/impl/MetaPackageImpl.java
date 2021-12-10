/**
 *
 */
package com.xnzk.flash.meta.impl;

import com.xnzk.flash.meta.Audit;
import com.xnzk.flash.meta.BaseEntity;
import com.xnzk.flash.meta.MetaFactory;
import com.xnzk.flash.meta.MetaPackage;
import com.xnzk.flash.meta.Named;

import com.xnzk.flash.meta.tenant.TenantPackage;

import com.xnzk.flash.meta.tenant.impl.TenantPackageImpl;

import java.time.LocalDateTime;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetaPackageImpl extends EPackageImpl implements MetaPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass baseEntityEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass auditEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass namedEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType localDateTimeEDataType = null;

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
     * @see com.xnzk.flash.meta.MetaPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private MetaPackageImpl() {
        super(eNS_URI, MetaFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link MetaPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static MetaPackage init() {
        if (isInited) return (MetaPackage) EPackage.Registry.INSTANCE.getEPackage(MetaPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredMetaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        MetaPackageImpl theMetaPackage = registeredMetaPackage instanceof MetaPackageImpl ? (MetaPackageImpl) registeredMetaPackage : new MetaPackageImpl();

        isInited = true;

        // Obtain or create and register interdependencies
        Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TenantPackage.eNS_URI);
        TenantPackageImpl theTenantPackage = (TenantPackageImpl) (registeredPackage instanceof TenantPackageImpl ? registeredPackage : TenantPackage.eINSTANCE);

        // Create package meta-data objects
        theMetaPackage.createPackageContents();
        theTenantPackage.createPackageContents();

        // Initialize created meta-data
        theMetaPackage.initializePackageContents();
        theTenantPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theMetaPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(MetaPackage.eNS_URI, theMetaPackage);
        return theMetaPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBaseEntity() {
        return baseEntityEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBaseEntity_Id() {
        return (EAttribute) baseEntityEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAudit() {
        return auditEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAudit_CreatedDate() {
        return (EAttribute) auditEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAudit_CreatedBy() {
        return (EAttribute) auditEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAudit_LastModifiedBy() {
        return (EAttribute) auditEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAudit_LastModifiedDate() {
        return (EAttribute) auditEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAudit_DeletedBy() {
        return (EAttribute) auditEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAudit_DeletedDate() {
        return (EAttribute) auditEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNamed() {
        return namedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNamed_Name() {
        return (EAttribute) namedEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getLocalDateTime() {
        return localDateTimeEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MetaFactory getMetaFactory() {
        return (MetaFactory) getEFactoryInstance();
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
        baseEntityEClass = createEClass(BASE_ENTITY);
        createEAttribute(baseEntityEClass, BASE_ENTITY__ID);

        auditEClass = createEClass(AUDIT);
        createEAttribute(auditEClass, AUDIT__CREATED_DATE);
        createEAttribute(auditEClass, AUDIT__CREATED_BY);
        createEAttribute(auditEClass, AUDIT__LAST_MODIFIED_BY);
        createEAttribute(auditEClass, AUDIT__LAST_MODIFIED_DATE);
        createEAttribute(auditEClass, AUDIT__DELETED_BY);
        createEAttribute(auditEClass, AUDIT__DELETED_DATE);

        namedEClass = createEClass(NAMED);
        createEAttribute(namedEClass, NAMED__NAME);

        // Create data types
        localDateTimeEDataType = createEDataType(LOCAL_DATE_TIME);
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

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        auditEClass.getESuperTypes().add(this.getBaseEntity());
        auditEClass.getESuperTypes().add(this.getNamed());

        // Initialize classes, features, and operations; add parameters
        initEClass(baseEntityEClass, BaseEntity.class, "BaseEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getBaseEntity_Id(), ecorePackage.getELong(), "id", null, 0, 1, BaseEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(auditEClass, Audit.class, "Audit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAudit_CreatedDate(), this.getLocalDateTime(), "createdDate", null, 0, 1, Audit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAudit_CreatedBy(), ecorePackage.getELong(), "createdBy", null, 0, 1, Audit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAudit_LastModifiedBy(), ecorePackage.getELong(), "lastModifiedBy", null, 0, 1, Audit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAudit_LastModifiedDate(), this.getLocalDateTime(), "lastModifiedDate", null, 0, 1, Audit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAudit_DeletedBy(), ecorePackage.getELong(), "deletedBy", null, 0, 1, Audit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAudit_DeletedDate(), this.getLocalDateTime(), "deletedDate", null, 0, 1, Audit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(namedEClass, Named.class, "Named", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getNamed_Name(), ecorePackage.getEString(), "name", null, 0, 1, Named.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize data types
        initEDataType(localDateTimeEDataType, LocalDateTime.class, "LocalDateTime", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);
    }

} //MetaPackageImpl
