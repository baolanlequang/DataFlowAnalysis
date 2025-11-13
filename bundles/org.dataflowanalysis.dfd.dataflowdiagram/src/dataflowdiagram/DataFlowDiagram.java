/**
 */
package dataflowdiagram;

import org.eclipse.emf.common.util.EList;

import tools.mdsd.modelingfoundations.identifier.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Flow Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataflowdiagram.DataFlowDiagram#getFlows <em>Flows</em>}</li>
 *   <li>{@link dataflowdiagram.DataFlowDiagram#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @see dataflowdiagram.DataflowdiagramPackage#getDataFlowDiagram()
 * @model
 * @generated
 */
public interface DataFlowDiagram extends Entity {
	/**
	 * Returns the value of the '<em><b>Flows</b></em>' containment reference list.
	 * The list contents are of type {@link dataflowdiagram.Flow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flows</em>' containment reference list.
	 * @see dataflowdiagram.DataflowdiagramPackage#getDataFlowDiagram_Flows()
	 * @model containment="true"
	 * @generated
	 */
	EList<Flow> getFlows();

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link dataflowdiagram.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see dataflowdiagram.DataflowdiagramPackage#getDataFlowDiagram_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

} // DataFlowDiagram
