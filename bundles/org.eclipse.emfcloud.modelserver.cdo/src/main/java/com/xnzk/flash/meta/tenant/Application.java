/**
 *
 */
package com.xnzk.flash.meta.tenant;

import com.xnzk.flash.meta.Audit;
import com.xnzk.flash.meta.Named;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.xnzk.flash.meta.tenant.Application#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see com.xnzk.flash.meta.tenant.TenantPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends Audit, Named {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(int)
	 * @see com.xnzk.flash.meta.tenant.TenantPackage#getApplication_Version()
	 * @model
	 * @generated
	 */
	int getVersion();

	/**
	 * Sets the value of the '{@link com.xnzk.flash.meta.tenant.Application#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(int value);

} // Application
