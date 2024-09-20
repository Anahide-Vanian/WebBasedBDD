/**
 * generated by Xtext 2.32.0
 */
package dk.sdu.bdd.xtext.bddDsl.impl;

import dk.sdu.bdd.xtext.bddDsl.BddDslPackage;
import dk.sdu.bdd.xtext.bddDsl.DeclarativeEntityDef;
import dk.sdu.bdd.xtext.bddDsl.ImperativeEntityDef;
import dk.sdu.bdd.xtext.bddDsl.Model;
import dk.sdu.bdd.xtext.bddDsl.ModelRef;
import dk.sdu.bdd.xtext.bddDsl.Scenario;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.impl.ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.impl.ModelImpl#getModelRefs <em>Model Refs</em>}</li>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.impl.ModelImpl#getDeclarativeEntityDef <em>Declarative Entity Def</em>}</li>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.impl.ModelImpl#getImperativeEntityDef <em>Imperative Entity Def</em>}</li>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.impl.ModelImpl#getScenarios <em>Scenarios</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
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
   * The cached value of the '{@link #getModelRefs() <em>Model Refs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelRefs()
   * @generated
   * @ordered
   */
  protected EList<ModelRef> modelRefs;

  /**
   * The cached value of the '{@link #getDeclarativeEntityDef() <em>Declarative Entity Def</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclarativeEntityDef()
   * @generated
   * @ordered
   */
  protected EList<DeclarativeEntityDef> declarativeEntityDef;

  /**
   * The cached value of the '{@link #getImperativeEntityDef() <em>Imperative Entity Def</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImperativeEntityDef()
   * @generated
   * @ordered
   */
  protected EList<ImperativeEntityDef> imperativeEntityDef;

  /**
   * The cached value of the '{@link #getScenarios() <em>Scenarios</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScenarios()
   * @generated
   * @ordered
   */
  protected EList<Scenario> scenarios;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return BddDslPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BddDslPackage.MODEL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ModelRef> getModelRefs()
  {
    if (modelRefs == null)
    {
      modelRefs = new EObjectContainmentEList<ModelRef>(ModelRef.class, this, BddDslPackage.MODEL__MODEL_REFS);
    }
    return modelRefs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<DeclarativeEntityDef> getDeclarativeEntityDef()
  {
    if (declarativeEntityDef == null)
    {
      declarativeEntityDef = new EObjectContainmentEList<DeclarativeEntityDef>(DeclarativeEntityDef.class, this, BddDslPackage.MODEL__DECLARATIVE_ENTITY_DEF);
    }
    return declarativeEntityDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ImperativeEntityDef> getImperativeEntityDef()
  {
    if (imperativeEntityDef == null)
    {
      imperativeEntityDef = new EObjectContainmentEList<ImperativeEntityDef>(ImperativeEntityDef.class, this, BddDslPackage.MODEL__IMPERATIVE_ENTITY_DEF);
    }
    return imperativeEntityDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Scenario> getScenarios()
  {
    if (scenarios == null)
    {
      scenarios = new EObjectContainmentEList<Scenario>(Scenario.class, this, BddDslPackage.MODEL__SCENARIOS);
    }
    return scenarios;
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
      case BddDslPackage.MODEL__MODEL_REFS:
        return ((InternalEList<?>)getModelRefs()).basicRemove(otherEnd, msgs);
      case BddDslPackage.MODEL__DECLARATIVE_ENTITY_DEF:
        return ((InternalEList<?>)getDeclarativeEntityDef()).basicRemove(otherEnd, msgs);
      case BddDslPackage.MODEL__IMPERATIVE_ENTITY_DEF:
        return ((InternalEList<?>)getImperativeEntityDef()).basicRemove(otherEnd, msgs);
      case BddDslPackage.MODEL__SCENARIOS:
        return ((InternalEList<?>)getScenarios()).basicRemove(otherEnd, msgs);
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
      case BddDslPackage.MODEL__NAME:
        return getName();
      case BddDslPackage.MODEL__MODEL_REFS:
        return getModelRefs();
      case BddDslPackage.MODEL__DECLARATIVE_ENTITY_DEF:
        return getDeclarativeEntityDef();
      case BddDslPackage.MODEL__IMPERATIVE_ENTITY_DEF:
        return getImperativeEntityDef();
      case BddDslPackage.MODEL__SCENARIOS:
        return getScenarios();
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
      case BddDslPackage.MODEL__NAME:
        setName((String)newValue);
        return;
      case BddDslPackage.MODEL__MODEL_REFS:
        getModelRefs().clear();
        getModelRefs().addAll((Collection<? extends ModelRef>)newValue);
        return;
      case BddDslPackage.MODEL__DECLARATIVE_ENTITY_DEF:
        getDeclarativeEntityDef().clear();
        getDeclarativeEntityDef().addAll((Collection<? extends DeclarativeEntityDef>)newValue);
        return;
      case BddDslPackage.MODEL__IMPERATIVE_ENTITY_DEF:
        getImperativeEntityDef().clear();
        getImperativeEntityDef().addAll((Collection<? extends ImperativeEntityDef>)newValue);
        return;
      case BddDslPackage.MODEL__SCENARIOS:
        getScenarios().clear();
        getScenarios().addAll((Collection<? extends Scenario>)newValue);
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
      case BddDslPackage.MODEL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case BddDslPackage.MODEL__MODEL_REFS:
        getModelRefs().clear();
        return;
      case BddDslPackage.MODEL__DECLARATIVE_ENTITY_DEF:
        getDeclarativeEntityDef().clear();
        return;
      case BddDslPackage.MODEL__IMPERATIVE_ENTITY_DEF:
        getImperativeEntityDef().clear();
        return;
      case BddDslPackage.MODEL__SCENARIOS:
        getScenarios().clear();
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
      case BddDslPackage.MODEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case BddDslPackage.MODEL__MODEL_REFS:
        return modelRefs != null && !modelRefs.isEmpty();
      case BddDslPackage.MODEL__DECLARATIVE_ENTITY_DEF:
        return declarativeEntityDef != null && !declarativeEntityDef.isEmpty();
      case BddDslPackage.MODEL__IMPERATIVE_ENTITY_DEF:
        return imperativeEntityDef != null && !imperativeEntityDef.isEmpty();
      case BddDslPackage.MODEL__SCENARIOS:
        return scenarios != null && !scenarios.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ModelImpl