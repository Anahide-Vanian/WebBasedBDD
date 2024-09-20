/**
 * generated by Xtext 2.32.0
 */
package dk.sdu.bdd.xtext.bddDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imperative Scenario Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.ImperativeScenarioAction#getActions <em>Actions</em>}</li>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.ImperativeScenarioAction#getAndActions <em>And Actions</em>}</li>
 * </ul>
 *
 * @see dk.sdu.bdd.xtext.bddDsl.BddDslPackage#getImperativeScenarioAction()
 * @model
 * @generated
 */
public interface ImperativeScenarioAction extends EObject
{
  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see dk.sdu.bdd.xtext.bddDsl.BddDslPackage#getImperativeScenarioAction_Actions()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getActions();

  /**
   * Returns the value of the '<em><b>And Actions</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.bdd.xtext.bddDsl.ImperativeScenarioActionAnd}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>And Actions</em>' containment reference list.
   * @see dk.sdu.bdd.xtext.bddDsl.BddDslPackage#getImperativeScenarioAction_AndActions()
   * @model containment="true"
   * @generated
   */
  EList<ImperativeScenarioActionAnd> getAndActions();

} // ImperativeScenarioAction