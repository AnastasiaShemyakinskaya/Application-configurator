/**
 * generated by Xtext 2.14.0
 */
package ru.spbstu.application.configurator.model.infoProject;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.spbstu.application.configurator.model.infoProject.Type#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see ru.spbstu.application.configurator.model.infoProject.InfoProjectPackage#getType()
 * @model
 * @generated
 */
public interface Type extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * The literals are from the enumeration {@link ru.spbstu.application.configurator.model.infoProject.enumOfTypes}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see ru.spbstu.application.configurator.model.infoProject.enumOfTypes
   * @see #setValue(enumOfTypes)
   * @see ru.spbstu.application.configurator.model.infoProject.InfoProjectPackage#getType_Value()
   * @model
   * @generated
   */
  enumOfTypes getValue();

  /**
   * Sets the value of the '{@link ru.spbstu.application.configurator.model.infoProject.Type#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see ru.spbstu.application.configurator.model.infoProject.enumOfTypes
   * @see #getValue()
   * @generated
   */
  void setValue(enumOfTypes value);

} // Type
