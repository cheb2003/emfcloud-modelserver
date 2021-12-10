/**
 *
 */
package com.xnzk.flash.meta.tenant;

import com.xnzk.flash.meta.Audit;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tenant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.xnzk.flash.meta.tenant.Tenant#getApplications <em>Applications</em>}</li>
 * </ul>
 *
 * @see com.xnzk.flash.meta.tenant.TenantPackage#getTenant()
 * @model
 * @generated
 */
public interface Tenant extends Audit {
	/**
	 * Returns the value of the '<em><b>Applications</b></em>' reference list.
	 * The list contents are of type {@link com.xnzk.flash.meta.tenant.Application}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applications</em>' reference list.
	 * @see com.xnzk.flash.meta.tenant.TenantPackage#getTenant_Applications()
	 * @model upper="2"
	 * @generated
	 */
	EList<Application> getApplications();

} // Tenant
