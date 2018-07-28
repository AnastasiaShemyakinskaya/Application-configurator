/**
 * generated by Xtext 2.14.0
 */
package ru.spbstu.application.configurator.model.infoProject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crypto Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.spbstu.application.configurator.model.infoProject.CryptoObject#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see ru.spbstu.application.configurator.model.infoProject.InfoProjectPackage#getCryptoObject()
 * @model
 * @generated
 */
public interface CryptoObject extends EObject
{
  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see ru.spbstu.application.configurator.model.infoProject.InfoProjectPackage#getCryptoObject_Features()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getFeatures();

} // CryptoObject
