/**
 *
 */
package com.xnzk.flash.meta.impl;

import com.xnzk.flash.meta.Audit;
import com.xnzk.flash.meta.MetaPackage;
import com.xnzk.flash.meta.Named;

import java.time.LocalDateTime;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Audit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.xnzk.flash.meta.impl.AuditImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.xnzk.flash.meta.impl.AuditImpl#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link com.xnzk.flash.meta.impl.AuditImpl#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link com.xnzk.flash.meta.impl.AuditImpl#getLastModifiedBy <em>Last Modified By</em>}</li>
 *   <li>{@link com.xnzk.flash.meta.impl.AuditImpl#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link com.xnzk.flash.meta.impl.AuditImpl#getDeletedBy <em>Deleted By</em>}</li>
 *   <li>{@link com.xnzk.flash.meta.impl.AuditImpl#getDeletedDate <em>Deleted Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuditImpl extends BaseEntityImpl implements Audit {
    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getCreatedDate() <em>Created Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCreatedDate()
     * @generated
     * @ordered
     */
    protected static final LocalDateTime CREATED_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCreatedDate() <em>Created Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCreatedDate()
     * @generated
     * @ordered
     */
    protected LocalDateTime createdDate = CREATED_DATE_EDEFAULT;

    /**
     * The default value of the '{@link #getCreatedBy() <em>Created By</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCreatedBy()
     * @generated
     * @ordered
     */
    protected static final long CREATED_BY_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getCreatedBy() <em>Created By</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCreatedBy()
     * @generated
     * @ordered
     */
    protected long createdBy = CREATED_BY_EDEFAULT;

    /**
     * The default value of the '{@link #getLastModifiedBy() <em>Last Modified By</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLastModifiedBy()
     * @generated
     * @ordered
     */
    protected static final long LAST_MODIFIED_BY_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getLastModifiedBy() <em>Last Modified By</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLastModifiedBy()
     * @generated
     * @ordered
     */
    protected long lastModifiedBy = LAST_MODIFIED_BY_EDEFAULT;

    /**
     * The default value of the '{@link #getLastModifiedDate() <em>Last Modified Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLastModifiedDate()
     * @generated
     * @ordered
     */
    protected static final LocalDateTime LAST_MODIFIED_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLastModifiedDate() <em>Last Modified Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLastModifiedDate()
     * @generated
     * @ordered
     */
    protected LocalDateTime lastModifiedDate = LAST_MODIFIED_DATE_EDEFAULT;

    /**
     * The default value of the '{@link #getDeletedBy() <em>Deleted By</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeletedBy()
     * @generated
     * @ordered
     */
    protected static final long DELETED_BY_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getDeletedBy() <em>Deleted By</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeletedBy()
     * @generated
     * @ordered
     */
    protected long deletedBy = DELETED_BY_EDEFAULT;

    /**
     * The default value of the '{@link #getDeletedDate() <em>Deleted Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeletedDate()
     * @generated
     * @ordered
     */
    protected static final LocalDateTime DELETED_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDeletedDate() <em>Deleted Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeletedDate()
     * @generated
     * @ordered
     */
    protected LocalDateTime deletedDate = DELETED_DATE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AuditImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MetaPackage.Literals.AUDIT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MetaPackage.AUDIT__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCreatedDate(LocalDateTime newCreatedDate) {
        LocalDateTime oldCreatedDate = createdDate;
        createdDate = newCreatedDate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MetaPackage.AUDIT__CREATED_DATE, oldCreatedDate, createdDate));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public long getCreatedBy() {
        return createdBy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCreatedBy(long newCreatedBy) {
        long oldCreatedBy = createdBy;
        createdBy = newCreatedBy;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MetaPackage.AUDIT__CREATED_BY, oldCreatedBy, createdBy));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public long getLastModifiedBy() {
        return lastModifiedBy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLastModifiedBy(long newLastModifiedBy) {
        long oldLastModifiedBy = lastModifiedBy;
        lastModifiedBy = newLastModifiedBy;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MetaPackage.AUDIT__LAST_MODIFIED_BY, oldLastModifiedBy, lastModifiedBy));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LocalDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLastModifiedDate(LocalDateTime newLastModifiedDate) {
        LocalDateTime oldLastModifiedDate = lastModifiedDate;
        lastModifiedDate = newLastModifiedDate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MetaPackage.AUDIT__LAST_MODIFIED_DATE, oldLastModifiedDate, lastModifiedDate));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public long getDeletedBy() {
        return deletedBy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDeletedBy(long newDeletedBy) {
        long oldDeletedBy = deletedBy;
        deletedBy = newDeletedBy;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MetaPackage.AUDIT__DELETED_BY, oldDeletedBy, deletedBy));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LocalDateTime getDeletedDate() {
        return deletedDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDeletedDate(LocalDateTime newDeletedDate) {
        LocalDateTime oldDeletedDate = deletedDate;
        deletedDate = newDeletedDate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MetaPackage.AUDIT__DELETED_DATE, oldDeletedDate, deletedDate));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case MetaPackage.AUDIT__NAME:
                return getName();
            case MetaPackage.AUDIT__CREATED_DATE:
                return getCreatedDate();
            case MetaPackage.AUDIT__CREATED_BY:
                return getCreatedBy();
            case MetaPackage.AUDIT__LAST_MODIFIED_BY:
                return getLastModifiedBy();
            case MetaPackage.AUDIT__LAST_MODIFIED_DATE:
                return getLastModifiedDate();
            case MetaPackage.AUDIT__DELETED_BY:
                return getDeletedBy();
            case MetaPackage.AUDIT__DELETED_DATE:
                return getDeletedDate();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case MetaPackage.AUDIT__NAME:
                setName((String) newValue);
                return;
            case MetaPackage.AUDIT__CREATED_DATE:
                setCreatedDate((LocalDateTime) newValue);
                return;
            case MetaPackage.AUDIT__CREATED_BY:
                setCreatedBy((Long) newValue);
                return;
            case MetaPackage.AUDIT__LAST_MODIFIED_BY:
                setLastModifiedBy((Long) newValue);
                return;
            case MetaPackage.AUDIT__LAST_MODIFIED_DATE:
                setLastModifiedDate((LocalDateTime) newValue);
                return;
            case MetaPackage.AUDIT__DELETED_BY:
                setDeletedBy((Long) newValue);
                return;
            case MetaPackage.AUDIT__DELETED_DATE:
                setDeletedDate((LocalDateTime) newValue);
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
            case MetaPackage.AUDIT__NAME:
                setName(NAME_EDEFAULT);
                return;
            case MetaPackage.AUDIT__CREATED_DATE:
                setCreatedDate(CREATED_DATE_EDEFAULT);
                return;
            case MetaPackage.AUDIT__CREATED_BY:
                setCreatedBy(CREATED_BY_EDEFAULT);
                return;
            case MetaPackage.AUDIT__LAST_MODIFIED_BY:
                setLastModifiedBy(LAST_MODIFIED_BY_EDEFAULT);
                return;
            case MetaPackage.AUDIT__LAST_MODIFIED_DATE:
                setLastModifiedDate(LAST_MODIFIED_DATE_EDEFAULT);
                return;
            case MetaPackage.AUDIT__DELETED_BY:
                setDeletedBy(DELETED_BY_EDEFAULT);
                return;
            case MetaPackage.AUDIT__DELETED_DATE:
                setDeletedDate(DELETED_DATE_EDEFAULT);
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
            case MetaPackage.AUDIT__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case MetaPackage.AUDIT__CREATED_DATE:
                return CREATED_DATE_EDEFAULT == null ? createdDate != null : !CREATED_DATE_EDEFAULT.equals(createdDate);
            case MetaPackage.AUDIT__CREATED_BY:
                return createdBy != CREATED_BY_EDEFAULT;
            case MetaPackage.AUDIT__LAST_MODIFIED_BY:
                return lastModifiedBy != LAST_MODIFIED_BY_EDEFAULT;
            case MetaPackage.AUDIT__LAST_MODIFIED_DATE:
                return LAST_MODIFIED_DATE_EDEFAULT == null ? lastModifiedDate != null : !LAST_MODIFIED_DATE_EDEFAULT.equals(lastModifiedDate);
            case MetaPackage.AUDIT__DELETED_BY:
                return deletedBy != DELETED_BY_EDEFAULT;
            case MetaPackage.AUDIT__DELETED_DATE:
                return DELETED_DATE_EDEFAULT == null ? deletedDate != null : !DELETED_DATE_EDEFAULT.equals(deletedDate);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == Named.class) {
            switch (derivedFeatureID) {
                case MetaPackage.AUDIT__NAME:
                    return MetaPackage.NAMED__NAME;
                default:
                    return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == Named.class) {
            switch (baseFeatureID) {
                case MetaPackage.NAMED__NAME:
                    return MetaPackage.AUDIT__NAME;
                default:
                    return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (name: ");
        result.append(name);
        result.append(", createdDate: ");
        result.append(createdDate);
        result.append(", createdBy: ");
        result.append(createdBy);
        result.append(", lastModifiedBy: ");
        result.append(lastModifiedBy);
        result.append(", lastModifiedDate: ");
        result.append(lastModifiedDate);
        result.append(", deletedBy: ");
        result.append(deletedBy);
        result.append(", deletedDate: ");
        result.append(deletedDate);
        result.append(')');
        return result.toString();
    }

} //AuditImpl
