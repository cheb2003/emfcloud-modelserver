/**
 *
 */
package com.xnzk.flash.meta;

import java.time.LocalDateTime;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.xnzk.flash.meta.Audit#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link com.xnzk.flash.meta.Audit#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link com.xnzk.flash.meta.Audit#getLastModifiedBy <em>Last Modified By</em>}</li>
 *   <li>{@link com.xnzk.flash.meta.Audit#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link com.xnzk.flash.meta.Audit#getDeletedBy <em>Deleted By</em>}</li>
 *   <li>{@link com.xnzk.flash.meta.Audit#getDeletedDate <em>Deleted Date</em>}</li>
 * </ul>
 *
 * @see com.xnzk.flash.meta.MetaPackage#getAudit()
 * @model
 * @generated
 */
public interface Audit extends BaseEntity, Named {
    /**
     * Returns the value of the '<em><b>Created Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Created Date</em>' attribute.
     * @see #setCreatedDate(LocalDateTime)
     * @see com.xnzk.flash.meta.MetaPackage#getAudit_CreatedDate()
     * @model dataType="com.xnzk.flash.meta.LocalDateTime"
     * @generated
     */
    LocalDateTime getCreatedDate();

    /**
     * Sets the value of the '{@link com.xnzk.flash.meta.Audit#getCreatedDate <em>Created Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Created Date</em>' attribute.
     * @see #getCreatedDate()
     * @generated
     */
    void setCreatedDate(LocalDateTime value);

    /**
     * Returns the value of the '<em><b>Created By</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Created By</em>' attribute.
     * @see #setCreatedBy(long)
     * @see com.xnzk.flash.meta.MetaPackage#getAudit_CreatedBy()
     * @model
     * @generated
     */
    long getCreatedBy();

    /**
     * Sets the value of the '{@link com.xnzk.flash.meta.Audit#getCreatedBy <em>Created By</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Created By</em>' attribute.
     * @see #getCreatedBy()
     * @generated
     */
    void setCreatedBy(long value);

    /**
     * Returns the value of the '<em><b>Last Modified By</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Last Modified By</em>' attribute.
     * @see #setLastModifiedBy(long)
     * @see com.xnzk.flash.meta.MetaPackage#getAudit_LastModifiedBy()
     * @model
     * @generated
     */
    long getLastModifiedBy();

    /**
     * Sets the value of the '{@link com.xnzk.flash.meta.Audit#getLastModifiedBy <em>Last Modified By</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Last Modified By</em>' attribute.
     * @see #getLastModifiedBy()
     * @generated
     */
    void setLastModifiedBy(long value);

    /**
     * Returns the value of the '<em><b>Last Modified Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Last Modified Date</em>' attribute.
     * @see #setLastModifiedDate(LocalDateTime)
     * @see com.xnzk.flash.meta.MetaPackage#getAudit_LastModifiedDate()
     * @model dataType="com.xnzk.flash.meta.LocalDateTime"
     * @generated
     */
    LocalDateTime getLastModifiedDate();

    /**
     * Sets the value of the '{@link com.xnzk.flash.meta.Audit#getLastModifiedDate <em>Last Modified Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Last Modified Date</em>' attribute.
     * @see #getLastModifiedDate()
     * @generated
     */
    void setLastModifiedDate(LocalDateTime value);

    /**
     * Returns the value of the '<em><b>Deleted By</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Deleted By</em>' attribute.
     * @see #setDeletedBy(long)
     * @see com.xnzk.flash.meta.MetaPackage#getAudit_DeletedBy()
     * @model
     * @generated
     */
    long getDeletedBy();

    /**
     * Sets the value of the '{@link com.xnzk.flash.meta.Audit#getDeletedBy <em>Deleted By</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Deleted By</em>' attribute.
     * @see #getDeletedBy()
     * @generated
     */
    void setDeletedBy(long value);

    /**
     * Returns the value of the '<em><b>Deleted Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Deleted Date</em>' attribute.
     * @see #setDeletedDate(LocalDateTime)
     * @see com.xnzk.flash.meta.MetaPackage#getAudit_DeletedDate()
     * @model dataType="com.xnzk.flash.meta.LocalDateTime"
     * @generated
     */
    LocalDateTime getDeletedDate();

    /**
     * Sets the value of the '{@link com.xnzk.flash.meta.Audit#getDeletedDate <em>Deleted Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Deleted Date</em>' attribute.
     * @see #getDeletedDate()
     * @generated
     */
    void setDeletedDate(LocalDateTime value);

} // Audit
