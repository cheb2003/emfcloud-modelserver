/**
 *
 */
package com.xnzk.flash.meta;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

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
 * @see com.xnzk.flash.meta.MetaFactory
 * @model kind="package"
 * @generated
 */
public interface MetaPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "meta";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.example.org/meta";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "meta";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    MetaPackage eINSTANCE = com.xnzk.flash.meta.impl.MetaPackageImpl.init();

    /**
     * The meta object id for the '{@link com.xnzk.flash.meta.impl.BaseEntityImpl <em>Base Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.xnzk.flash.meta.impl.BaseEntityImpl
     * @see com.xnzk.flash.meta.impl.MetaPackageImpl#getBaseEntity()
     * @generated
     */
    int BASE_ENTITY = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_ENTITY__ID = 0;

    /**
     * The number of structural features of the '<em>Base Entity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_ENTITY_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Base Entity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_ENTITY_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link com.xnzk.flash.meta.impl.AuditImpl <em>Audit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.xnzk.flash.meta.impl.AuditImpl
     * @see com.xnzk.flash.meta.impl.MetaPackageImpl#getAudit()
     * @generated
     */
    int AUDIT = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUDIT__ID = BASE_ENTITY__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUDIT__NAME = BASE_ENTITY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Created Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUDIT__CREATED_DATE = BASE_ENTITY_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Created By</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUDIT__CREATED_BY = BASE_ENTITY_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Last Modified By</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUDIT__LAST_MODIFIED_BY = BASE_ENTITY_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUDIT__LAST_MODIFIED_DATE = BASE_ENTITY_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Deleted By</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUDIT__DELETED_BY = BASE_ENTITY_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Deleted Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUDIT__DELETED_DATE = BASE_ENTITY_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Audit</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUDIT_FEATURE_COUNT = BASE_ENTITY_FEATURE_COUNT + 7;

    /**
     * The number of operations of the '<em>Audit</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUDIT_OPERATION_COUNT = BASE_ENTITY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link com.xnzk.flash.meta.impl.NamedImpl <em>Named</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.xnzk.flash.meta.impl.NamedImpl
     * @see com.xnzk.flash.meta.impl.MetaPackageImpl#getNamed()
     * @generated
     */
    int NAMED = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED__NAME = 0;

    /**
     * The number of structural features of the '<em>Named</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Named</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '<em>Local Date Time</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.time.LocalDateTime
     * @see com.xnzk.flash.meta.impl.MetaPackageImpl#getLocalDateTime()
     * @generated
     */
    int LOCAL_DATE_TIME = 3;


    /**
     * Returns the meta object for class '{@link com.xnzk.flash.meta.BaseEntity <em>Base Entity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Base Entity</em>'.
     * @see com.xnzk.flash.meta.BaseEntity
     * @generated
     */
    EClass getBaseEntity();

    /**
     * Returns the meta object for the attribute '{@link com.xnzk.flash.meta.BaseEntity#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see com.xnzk.flash.meta.BaseEntity#getId()
     * @see #getBaseEntity()
     * @generated
     */
    EAttribute getBaseEntity_Id();

    /**
     * Returns the meta object for class '{@link com.xnzk.flash.meta.Audit <em>Audit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Audit</em>'.
     * @see com.xnzk.flash.meta.Audit
     * @generated
     */
    EClass getAudit();

    /**
     * Returns the meta object for the attribute '{@link com.xnzk.flash.meta.Audit#getCreatedDate <em>Created Date</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Created Date</em>'.
     * @see com.xnzk.flash.meta.Audit#getCreatedDate()
     * @see #getAudit()
     * @generated
     */
    EAttribute getAudit_CreatedDate();

    /**
     * Returns the meta object for the attribute '{@link com.xnzk.flash.meta.Audit#getCreatedBy <em>Created By</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Created By</em>'.
     * @see com.xnzk.flash.meta.Audit#getCreatedBy()
     * @see #getAudit()
     * @generated
     */
    EAttribute getAudit_CreatedBy();

    /**
     * Returns the meta object for the attribute '{@link com.xnzk.flash.meta.Audit#getLastModifiedBy <em>Last Modified By</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Last Modified By</em>'.
     * @see com.xnzk.flash.meta.Audit#getLastModifiedBy()
     * @see #getAudit()
     * @generated
     */
    EAttribute getAudit_LastModifiedBy();

    /**
     * Returns the meta object for the attribute '{@link com.xnzk.flash.meta.Audit#getLastModifiedDate <em>Last Modified Date</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Last Modified Date</em>'.
     * @see com.xnzk.flash.meta.Audit#getLastModifiedDate()
     * @see #getAudit()
     * @generated
     */
    EAttribute getAudit_LastModifiedDate();

    /**
     * Returns the meta object for the attribute '{@link com.xnzk.flash.meta.Audit#getDeletedBy <em>Deleted By</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Deleted By</em>'.
     * @see com.xnzk.flash.meta.Audit#getDeletedBy()
     * @see #getAudit()
     * @generated
     */
    EAttribute getAudit_DeletedBy();

    /**
     * Returns the meta object for the attribute '{@link com.xnzk.flash.meta.Audit#getDeletedDate <em>Deleted Date</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Deleted Date</em>'.
     * @see com.xnzk.flash.meta.Audit#getDeletedDate()
     * @see #getAudit()
     * @generated
     */
    EAttribute getAudit_DeletedDate();

    /**
     * Returns the meta object for class '{@link com.xnzk.flash.meta.Named <em>Named</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Named</em>'.
     * @see com.xnzk.flash.meta.Named
     * @generated
     */
    EClass getNamed();

    /**
     * Returns the meta object for the attribute '{@link com.xnzk.flash.meta.Named#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see com.xnzk.flash.meta.Named#getName()
     * @see #getNamed()
     * @generated
     */
    EAttribute getNamed_Name();

    /**
     * Returns the meta object for data type '{@link java.time.LocalDateTime <em>Local Date Time</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Local Date Time</em>'.
     * @see java.time.LocalDateTime
     * @model instanceClass="java.time.LocalDateTime"
     * @generated
     */
    EDataType getLocalDateTime();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    MetaFactory getMetaFactory();

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
         * The meta object literal for the '{@link com.xnzk.flash.meta.impl.BaseEntityImpl <em>Base Entity</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see com.xnzk.flash.meta.impl.BaseEntityImpl
         * @see com.xnzk.flash.meta.impl.MetaPackageImpl#getBaseEntity()
         * @generated
         */
        EClass BASE_ENTITY = eINSTANCE.getBaseEntity();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BASE_ENTITY__ID = eINSTANCE.getBaseEntity_Id();

        /**
         * The meta object literal for the '{@link com.xnzk.flash.meta.impl.AuditImpl <em>Audit</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see com.xnzk.flash.meta.impl.AuditImpl
         * @see com.xnzk.flash.meta.impl.MetaPackageImpl#getAudit()
         * @generated
         */
        EClass AUDIT = eINSTANCE.getAudit();

        /**
         * The meta object literal for the '<em><b>Created Date</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute AUDIT__CREATED_DATE = eINSTANCE.getAudit_CreatedDate();

        /**
         * The meta object literal for the '<em><b>Created By</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute AUDIT__CREATED_BY = eINSTANCE.getAudit_CreatedBy();

        /**
         * The meta object literal for the '<em><b>Last Modified By</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute AUDIT__LAST_MODIFIED_BY = eINSTANCE.getAudit_LastModifiedBy();

        /**
         * The meta object literal for the '<em><b>Last Modified Date</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute AUDIT__LAST_MODIFIED_DATE = eINSTANCE.getAudit_LastModifiedDate();

        /**
         * The meta object literal for the '<em><b>Deleted By</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute AUDIT__DELETED_BY = eINSTANCE.getAudit_DeletedBy();

        /**
         * The meta object literal for the '<em><b>Deleted Date</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute AUDIT__DELETED_DATE = eINSTANCE.getAudit_DeletedDate();

        /**
         * The meta object literal for the '{@link com.xnzk.flash.meta.impl.NamedImpl <em>Named</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see com.xnzk.flash.meta.impl.NamedImpl
         * @see com.xnzk.flash.meta.impl.MetaPackageImpl#getNamed()
         * @generated
         */
        EClass NAMED = eINSTANCE.getNamed();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NAMED__NAME = eINSTANCE.getNamed_Name();

        /**
         * The meta object literal for the '<em>Local Date Time</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.time.LocalDateTime
         * @see com.xnzk.flash.meta.impl.MetaPackageImpl#getLocalDateTime()
         * @generated
         */
        EDataType LOCAL_DATE_TIME = eINSTANCE.getLocalDateTime();

    }

} //MetaPackage
