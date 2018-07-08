/**
 * generated by Xtext 2.14.0
 */
package ru.spbstu.application.configurator.model.infoProject.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ru.spbstu.application.configurator.model.infoProject.FeatureName;
import ru.spbstu.application.configurator.model.infoProject.InfoProjectPackage;
import ru.spbstu.application.configurator.model.infoProject.Tenant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tenant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ru.spbstu.application.configurator.model.infoProject.impl.TenantImpl#getFeatures1 <em>Features1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TenantImpl extends MinimalEObjectImpl.Container implements Tenant
{
  /**
   * The cached value of the '{@link #getFeatures1() <em>Features1</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatures1()
   * @generated
   * @ordered
   */
  protected EList<FeatureName> features1;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TenantImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return InfoProjectPackage.Literals.TENANT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FeatureName> getFeatures1()
  {
    if (features1 == null)
    {
      features1 = new EObjectContainmentEList<FeatureName>(FeatureName.class, this, InfoProjectPackage.TENANT__FEATURES1);
    }
    return features1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case InfoProjectPackage.TENANT__FEATURES1:
        return ((InternalEList<?>)getFeatures1()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case InfoProjectPackage.TENANT__FEATURES1:
        return getFeatures1();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case InfoProjectPackage.TENANT__FEATURES1:
        getFeatures1().clear();
        getFeatures1().addAll((Collection<? extends FeatureName>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case InfoProjectPackage.TENANT__FEATURES1:
        getFeatures1().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case InfoProjectPackage.TENANT__FEATURES1:
        return features1 != null && !features1.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TenantImpl