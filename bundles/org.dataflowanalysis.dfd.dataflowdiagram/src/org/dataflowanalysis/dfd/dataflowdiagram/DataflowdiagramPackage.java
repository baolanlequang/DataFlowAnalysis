/**
 */
package org.dataflowanalysis.dfd.dataflowdiagram;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import tools.mdsd.modelingfoundations.identifier.IdentifierPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.dataflowanalysis.dfd.dataflowdiagram.DataflowdiagramFactory
 * @model kind="package"
 * @generated
 */
public interface DataflowdiagramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dataflowdiagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://dataflowanalysis.org/dfd/dataflowdiagram";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dataflowdiagram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataflowdiagramPackage eINSTANCE = org.dataflowanalysis.dfd.dataflowdiagram.impl.DataflowdiagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.dataflowanalysis.dfd.dataflowdiagram.impl.DataFlowDiagramImpl <em>Data Flow Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dataflowanalysis.dfd.dataflowdiagram.impl.DataFlowDiagramImpl
	 * @see org.dataflowanalysis.dfd.dataflowdiagram.impl.DataflowdiagramPackageImpl#getDataFlowDiagram()
	 * @generated
	 */
	int DATA_FLOW_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_DIAGRAM__ID = IdentifierPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_DIAGRAM__ENTITY_NAME = IdentifierPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_DIAGRAM__FLOWS = IdentifierPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_DIAGRAM__NODES = IdentifierPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Flow Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_DIAGRAM_FEATURE_COUNT = IdentifierPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data Flow Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_DIAGRAM_OPERATION_COUNT = IdentifierPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dataflowanalysis.dfd.dataflowdiagram.impl.FlowImpl <em>Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dataflowanalysis.dfd.dataflowdiagram.impl.FlowImpl
	 * @see org.dataflowanalysis.dfd.dataflowdiagram.impl.DataflowdiagramPackageImpl#getFlow()
	 * @generated
	 */
	int FLOW = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__ID = IdentifierPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__ENTITY_NAME = IdentifierPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Source Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__SOURCE_NODE = IdentifierPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Destination Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__DESTINATION_NODE = IdentifierPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Destination Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__DESTINATION_PIN = IdentifierPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__SOURCE_PIN = IdentifierPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FEATURE_COUNT = IdentifierPackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_OPERATION_COUNT = IdentifierPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dataflowanalysis.dfd.dataflowdiagram.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dataflowanalysis.dfd.dataflowdiagram.impl.NodeImpl
	 * @see org.dataflowanalysis.dfd.dataflowdiagram.impl.DataflowdiagramPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ID = IdentifierPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ENTITY_NAME = IdentifierPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__BEHAVIOR = IdentifierPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PROPERTIES = IdentifierPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = IdentifierPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = IdentifierPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dataflowanalysis.dfd.dataflowdiagram.impl.ExternalImpl <em>External</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dataflowanalysis.dfd.dataflowdiagram.impl.ExternalImpl
	 * @see org.dataflowanalysis.dfd.dataflowdiagram.impl.DataflowdiagramPackageImpl#getExternal()
	 * @generated
	 */
	int EXTERNAL = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL__ENTITY_NAME = NODE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL__BEHAVIOR = NODE__BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL__PROPERTIES = NODE__PROPERTIES;

	/**
	 * The number of structural features of the '<em>External</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>External</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dataflowanalysis.dfd.dataflowdiagram.impl.StoreImpl <em>Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dataflowanalysis.dfd.dataflowdiagram.impl.StoreImpl
	 * @see org.dataflowanalysis.dfd.dataflowdiagram.impl.DataflowdiagramPackageImpl#getStore()
	 * @generated
	 */
	int STORE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__ENTITY_NAME = NODE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__BEHAVIOR = NODE__BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__PROPERTIES = NODE__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.dataflowanalysis.dfd.dataflowdiagram.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.dataflowanalysis.dfd.dataflowdiagram.impl.ProcessImpl
	 * @see org.dataflowanalysis.dfd.dataflowdiagram.impl.DataflowdiagramPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ENTITY_NAME = NODE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__BEHAVIOR = NODE__BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PROPERTIES = NODE__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.dataflowanalysis.dfd.dataflowdiagram.DataFlowDiagram <em>Data Flow Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Flow Diagram</em>'.
	 * @see org.dataflowanalysis.dfd.dataflowdiagram.DataFlowDiagram
	 * @generated
	 */
	EClass getDataFlowDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link org.dataflowanalysis.dfd.dataflowdiagram.DataFlowDiagram#getFlows <em>Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flows</em>'.
	 * @see org.dataflowanalysis.dfd.dataflowdiagram.DataFlowDiagram#getFlows()
	 * @see #getDataFlowDiagram()
	 * @generated
	 */
	EReference getDataFlowDiagram_Flows();

	/**
	 * Returns the meta object for the containment reference list '{@link org.dataflowanalysis.dfd.dataflowdiagram.DataFlowDiagram#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see org.dataflowanalysis.dfd.dataflowdiagram.DataFlowDiagram#getNodes()
	 * @see #getDataFlowDiagram()
	 * @generated
	 */
	EReference getDataFlowDiagram_Nodes();

	/**
	 * Returns the meta object for class '{@link org.dataflowanalysis.dfd.dataflowdiagram.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow</em>'.
	 * @see org.dataflowanalysis.dfd.dataflowdiagram.Flow
	 * @generated
	 */
	EClass getFlow();

	/**
	 * Returns the meta object for the reference '{@link org.dataflowanalysis.dfd.dataflowdiagram.Flow#getSourceNode <em>Source Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Node</em>'.
	 * @see org.dataflowanalysis.dfd.dataflowdiagram.Flow#getSourceNode()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_SourceNode();

	/**
	 * Returns the meta object for the reference '{@link org.dataflowanalysis.dfd.dataflowdiagram.Flow#getDestinationNode <em>Destination Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination Node</em>'.
	 * @see org.dataflowanalysis.dfd.dataflowdiagram.Flow#getDestinationNode()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_DestinationNode();

	/**
	 * Returns the meta object for the reference '{@link org.dataflowanalysis.dfd.dataflowdiagram.Flow#getDestinationPin <em>Destination Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination Pin</em>'.
	 * @see org.dataflowanalysis.dfd.dataflowdiagram.Flow#getDestinationPin()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_DestinationPin();

	/**
	 * Returns the meta object for the reference '{@link org.dataflowanalysis.dfd.dataflowdiagram.Flow#getSourcePin <em>Source Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Pin</em>'.
	 * @see org.dataflowanalysis.dfd.dataflowdiagram.Flow#getSourcePin()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_SourcePin();

	/**
	 * Returns the meta object for class '{@link org.dataflowanalysis.dfd.dataflowdiagram.External <em>External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External</em>'.
	 * @see org.dataflowanalysis.dfd.dataflowdiagram.External
	 * @generated
	 */
	EClass getExternal();

	/**
	 * Returns the meta object for class '{@link org.dataflowanalysis.dfd.dataflowdiagram.Store <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Store</em>'.
	 * @see org.dataflowanalysis.dfd.dataflowdiagram.Store
	 * @generated
	 */
	EClass getStore();

	/**
	 * Returns the meta object for class '{@link org.dataflowanalysis.dfd.dataflowdiagram.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see org.dataflowanalysis.dfd.dataflowdiagram.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for class '{@link org.dataflowanalysis.dfd.dataflowdiagram.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.dataflowanalysis.dfd.dataflowdiagram.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the reference '{@link org.dataflowanalysis.dfd.dataflowdiagram.Node#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Behavior</em>'.
	 * @see org.dataflowanalysis.dfd.dataflowdiagram.Node#getBehavior()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Behavior();

	/**
	 * Returns the meta object for the reference list '{@link org.dataflowanalysis.dfd.dataflowdiagram.Node#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Properties</em>'.
	 * @see org.dataflowanalysis.dfd.dataflowdiagram.Node#getProperties()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Properties();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataflowdiagramFactory getDataflowdiagramFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.dataflowanalysis.dfd.dataflowdiagram.impl.DataFlowDiagramImpl <em>Data Flow Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dataflowanalysis.dfd.dataflowdiagram.impl.DataFlowDiagramImpl
		 * @see org.dataflowanalysis.dfd.dataflowdiagram.impl.DataflowdiagramPackageImpl#getDataFlowDiagram()
		 * @generated
		 */
		EClass DATA_FLOW_DIAGRAM = eINSTANCE.getDataFlowDiagram();

		/**
		 * The meta object literal for the '<em><b>Flows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW_DIAGRAM__FLOWS = eINSTANCE.getDataFlowDiagram_Flows();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW_DIAGRAM__NODES = eINSTANCE.getDataFlowDiagram_Nodes();

		/**
		 * The meta object literal for the '{@link org.dataflowanalysis.dfd.dataflowdiagram.impl.FlowImpl <em>Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dataflowanalysis.dfd.dataflowdiagram.impl.FlowImpl
		 * @see org.dataflowanalysis.dfd.dataflowdiagram.impl.DataflowdiagramPackageImpl#getFlow()
		 * @generated
		 */
		EClass FLOW = eINSTANCE.getFlow();

		/**
		 * The meta object literal for the '<em><b>Source Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__SOURCE_NODE = eINSTANCE.getFlow_SourceNode();

		/**
		 * The meta object literal for the '<em><b>Destination Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__DESTINATION_NODE = eINSTANCE.getFlow_DestinationNode();

		/**
		 * The meta object literal for the '<em><b>Destination Pin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__DESTINATION_PIN = eINSTANCE.getFlow_DestinationPin();

		/**
		 * The meta object literal for the '<em><b>Source Pin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__SOURCE_PIN = eINSTANCE.getFlow_SourcePin();

		/**
		 * The meta object literal for the '{@link org.dataflowanalysis.dfd.dataflowdiagram.impl.ExternalImpl <em>External</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dataflowanalysis.dfd.dataflowdiagram.impl.ExternalImpl
		 * @see org.dataflowanalysis.dfd.dataflowdiagram.impl.DataflowdiagramPackageImpl#getExternal()
		 * @generated
		 */
		EClass EXTERNAL = eINSTANCE.getExternal();

		/**
		 * The meta object literal for the '{@link org.dataflowanalysis.dfd.dataflowdiagram.impl.StoreImpl <em>Store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dataflowanalysis.dfd.dataflowdiagram.impl.StoreImpl
		 * @see org.dataflowanalysis.dfd.dataflowdiagram.impl.DataflowdiagramPackageImpl#getStore()
		 * @generated
		 */
		EClass STORE = eINSTANCE.getStore();

		/**
		 * The meta object literal for the '{@link org.dataflowanalysis.dfd.dataflowdiagram.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dataflowanalysis.dfd.dataflowdiagram.impl.ProcessImpl
		 * @see org.dataflowanalysis.dfd.dataflowdiagram.impl.DataflowdiagramPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '{@link org.dataflowanalysis.dfd.dataflowdiagram.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.dataflowanalysis.dfd.dataflowdiagram.impl.NodeImpl
		 * @see org.dataflowanalysis.dfd.dataflowdiagram.impl.DataflowdiagramPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__BEHAVIOR = eINSTANCE.getNode_Behavior();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__PROPERTIES = eINSTANCE.getNode_Properties();

	}

} //DataflowdiagramPackage
