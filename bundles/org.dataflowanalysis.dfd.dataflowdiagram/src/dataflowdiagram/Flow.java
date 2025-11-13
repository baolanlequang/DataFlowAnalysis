/**
 */
package dataflowdiagram;

import org.dataflowanalysis.dfd.datadictionary.Pin;

import tools.mdsd.modelingfoundations.identifier.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataflowdiagram.Flow#getSourceNode <em>Source Node</em>}</li>
 *   <li>{@link dataflowdiagram.Flow#getDestinationNode <em>Destination Node</em>}</li>
 *   <li>{@link dataflowdiagram.Flow#getDestinationPin <em>Destination Pin</em>}</li>
 *   <li>{@link dataflowdiagram.Flow#getSourcePin <em>Source Pin</em>}</li>
 * </ul>
 *
 * @see dataflowdiagram.DataflowdiagramPackage#getFlow()
 * @model
 * @generated
 */
public interface Flow extends Entity {
	/**
	 * Returns the value of the '<em><b>Source Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Node</em>' reference.
	 * @see #setSourceNode(Node)
	 * @see dataflowdiagram.DataflowdiagramPackage#getFlow_SourceNode()
	 * @model required="true"
	 * @generated
	 */
	Node getSourceNode();

	/**
	 * Sets the value of the '{@link dataflowdiagram.Flow#getSourceNode <em>Source Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Node</em>' reference.
	 * @see #getSourceNode()
	 * @generated
	 */
	void setSourceNode(Node value);

	/**
	 * Returns the value of the '<em><b>Destination Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Node</em>' reference.
	 * @see #setDestinationNode(Node)
	 * @see dataflowdiagram.DataflowdiagramPackage#getFlow_DestinationNode()
	 * @model required="true"
	 * @generated
	 */
	Node getDestinationNode();

	/**
	 * Sets the value of the '{@link dataflowdiagram.Flow#getDestinationNode <em>Destination Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Node</em>' reference.
	 * @see #getDestinationNode()
	 * @generated
	 */
	void setDestinationNode(Node value);

	/**
	 * Returns the value of the '<em><b>Destination Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Pin</em>' reference.
	 * @see #setDestinationPin(Pin)
	 * @see dataflowdiagram.DataflowdiagramPackage#getFlow_DestinationPin()
	 * @model
	 * @generated
	 */
	Pin getDestinationPin();

	/**
	 * Sets the value of the '{@link dataflowdiagram.Flow#getDestinationPin <em>Destination Pin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Pin</em>' reference.
	 * @see #getDestinationPin()
	 * @generated
	 */
	void setDestinationPin(Pin value);

	/**
	 * Returns the value of the '<em><b>Source Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Pin</em>' reference.
	 * @see #setSourcePin(Pin)
	 * @see dataflowdiagram.DataflowdiagramPackage#getFlow_SourcePin()
	 * @model
	 * @generated
	 */
	Pin getSourcePin();

	/**
	 * Sets the value of the '{@link dataflowdiagram.Flow#getSourcePin <em>Source Pin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Pin</em>' reference.
	 * @see #getSourcePin()
	 * @generated
	 */
	void setSourcePin(Pin value);

} // Flow
