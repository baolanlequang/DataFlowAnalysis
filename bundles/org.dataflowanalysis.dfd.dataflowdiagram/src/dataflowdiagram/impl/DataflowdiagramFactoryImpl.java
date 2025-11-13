/**
 */
package dataflowdiagram.impl;

import dataflowdiagram.DataFlowDiagram;
import dataflowdiagram.DataflowdiagramFactory;
import dataflowdiagram.DataflowdiagramPackage;
import dataflowdiagram.External;
import dataflowdiagram.Flow;
import dataflowdiagram.Store;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataflowdiagramFactoryImpl extends EFactoryImpl implements DataflowdiagramFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataflowdiagramFactory init() {
		try {
			DataflowdiagramFactory theDataflowdiagramFactory = (DataflowdiagramFactory)EPackage.Registry.INSTANCE.getEFactory(DataflowdiagramPackage.eNS_URI);
			if (theDataflowdiagramFactory != null) {
				return theDataflowdiagramFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DataflowdiagramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataflowdiagramFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DataflowdiagramPackage.DATA_FLOW_DIAGRAM: return createDataFlowDiagram();
			case DataflowdiagramPackage.FLOW: return createFlow();
			case DataflowdiagramPackage.EXTERNAL: return createExternal();
			case DataflowdiagramPackage.STORE: return createStore();
			case DataflowdiagramPackage.PROCESS: return createProcess();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataFlowDiagram createDataFlowDiagram() {
		DataFlowDiagramImpl dataFlowDiagram = new DataFlowDiagramImpl();
		return dataFlowDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Flow createFlow() {
		FlowImpl flow = new FlowImpl();
		return flow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public External createExternal() {
		ExternalImpl external = new ExternalImpl();
		return external;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Store createStore() {
		StoreImpl store = new StoreImpl();
		return store;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public dataflowdiagram.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataflowdiagramPackage getDataflowdiagramPackage() {
		return (DataflowdiagramPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DataflowdiagramPackage getPackage() {
		return DataflowdiagramPackage.eINSTANCE;
	}

} //DataflowdiagramFactoryImpl
