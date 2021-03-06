/**
 * generated by Xtext 2.14.0
 */
package ru.spbstu.application.configurator.model.infoProject;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.spbstu.application.configurator.model.infoProject.SecurityProvider#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ru.spbstu.application.configurator.model.infoProject.InfoProjectPackage#getSecurityProvider()
 * @model
 * @generated
 */
public interface SecurityProvider extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see ru.spbstu.application.configurator.model.infoProject.InfoProjectPackage#getSecurityProvider_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ru.spbstu.application.configurator.model.infoProject.SecurityProvider#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // SecurityProvider
