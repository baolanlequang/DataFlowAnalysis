/**
 */
package org.dataflowanalysis.dfd.dataflowdiagram;

import org.dataflowanalysis.dfd.datadictionary.Behavior;
import org.dataflowanalysis.dfd.datadictionary.Label;

import org.eclipse.emf.common.util.EList;

import tools.mdsd.modelingfoundations.identifier.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dataflowanalysis.dfd.dataflowdiagram.Node#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.dataflowanalysis.dfd.dataflowdiagram.Node#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see org.dataflowanalysis.dfd.dataflowdiagram.DataflowdiagramPackage#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends Entity {
	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior</em>' reference.
	 * @see #setBehavior(Behavior)
	 * @see org.dataflowanalysis.dfd.dataflowdiagram.DataflowdiagramPackage#getNode_Behavior()
	 * @model
	 * @generated
	 */
	Behavior getBehavior();

	/**
	 * Sets the value of the '{@link org.dataflowanalysis.dfd.dataflowdiagram.Node#getBehavior <em>Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior</em>' reference.
	 * @see #getBehavior()
	 * @generated
	 */
	void setBehavior(Behavior value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' reference list.
	 * The list contents are of type {@link org.dataflowanalysis.dfd.datadictionary.Label}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' reference list.
	 * @see org.dataflowanalysis.dfd.dataflowdiagram.DataflowdiagramPackage#getNode_Properties()
	 * @model
	 * @generated
	 */
	EList<Label> getProperties();

} // Node
