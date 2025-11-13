/**
 */
package dataflowdiagram.impl;

import dataflowdiagram.DataflowdiagramPackage;
import dataflowdiagram.Flow;
import dataflowdiagram.Node;

import org.dataflowanalysis.dfd.datadictionary.Pin;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tools.mdsd.modelingfoundations.identifier.impl.EntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataflowdiagram.impl.FlowImpl#getSourceNode <em>Source Node</em>}</li>
 *   <li>{@link dataflowdiagram.impl.FlowImpl#getDestinationNode <em>Destination Node</em>}</li>
 *   <li>{@link dataflowdiagram.impl.FlowImpl#getDestinationPin <em>Destination Pin</em>}</li>
 *   <li>{@link dataflowdiagram.impl.FlowImpl#getSourcePin <em>Source Pin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlowImpl extends EntityImpl implements Flow {
	/**
	 * The cached value of the '{@link #getSourceNode() <em>Source Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceNode()
	 * @generated
	 * @ordered
	 */
	protected Node sourceNode;

	/**
	 * The cached value of the '{@link #getDestinationNode() <em>Destination Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationNode()
	 * @generated
	 * @ordered
	 */
	protected Node destinationNode;

	/**
	 * The cached value of the '{@link #getDestinationPin() <em>Destination Pin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationPin()
	 * @generated
	 * @ordered
	 */
	protected Pin destinationPin;

	/**
	 * The cached value of the '{@link #getSourcePin() <em>Source Pin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePin()
	 * @generated
	 * @ordered
	 */
	protected Pin sourcePin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataflowdiagramPackage.Literals.FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node getSourceNode() {
		if (sourceNode != null && sourceNode.eIsProxy()) {
			InternalEObject oldSourceNode = (InternalEObject)sourceNode;
			sourceNode = (Node)eResolveProxy(oldSourceNode);
			if (sourceNode != oldSourceNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataflowdiagramPackage.FLOW__SOURCE_NODE, oldSourceNode, sourceNode));
			}
		}
		return sourceNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetSourceNode() {
		return sourceNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceNode(Node newSourceNode) {
		Node oldSourceNode = sourceNode;
		sourceNode = newSourceNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataflowdiagramPackage.FLOW__SOURCE_NODE, oldSourceNode, sourceNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node getDestinationNode() {
		if (destinationNode != null && destinationNode.eIsProxy()) {
			InternalEObject oldDestinationNode = (InternalEObject)destinationNode;
			destinationNode = (Node)eResolveProxy(oldDestinationNode);
			if (destinationNode != oldDestinationNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataflowdiagramPackage.FLOW__DESTINATION_NODE, oldDestinationNode, destinationNode));
			}
		}
		return destinationNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetDestinationNode() {
		return destinationNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestinationNode(Node newDestinationNode) {
		Node oldDestinationNode = destinationNode;
		destinationNode = newDestinationNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataflowdiagramPackage.FLOW__DESTINATION_NODE, oldDestinationNode, destinationNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pin getDestinationPin() {
		if (destinationPin != null && destinationPin.eIsProxy()) {
			InternalEObject oldDestinationPin = (InternalEObject)destinationPin;
			destinationPin = (Pin)eResolveProxy(oldDestinationPin);
			if (destinationPin != oldDestinationPin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataflowdiagramPackage.FLOW__DESTINATION_PIN, oldDestinationPin, destinationPin));
			}
		}
		return destinationPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin basicGetDestinationPin() {
		return destinationPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestinationPin(Pin newDestinationPin) {
		Pin oldDestinationPin = destinationPin;
		destinationPin = newDestinationPin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataflowdiagramPackage.FLOW__DESTINATION_PIN, oldDestinationPin, destinationPin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pin getSourcePin() {
		if (sourcePin != null && sourcePin.eIsProxy()) {
			InternalEObject oldSourcePin = (InternalEObject)sourcePin;
			sourcePin = (Pin)eResolveProxy(oldSourcePin);
			if (sourcePin != oldSourcePin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataflowdiagramPackage.FLOW__SOURCE_PIN, oldSourcePin, sourcePin));
			}
		}
		return sourcePin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin basicGetSourcePin() {
		return sourcePin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourcePin(Pin newSourcePin) {
		Pin oldSourcePin = sourcePin;
		sourcePin = newSourcePin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataflowdiagramPackage.FLOW__SOURCE_PIN, oldSourcePin, sourcePin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataflowdiagramPackage.FLOW__SOURCE_NODE:
				if (resolve) return getSourceNode();
				return basicGetSourceNode();
			case DataflowdiagramPackage.FLOW__DESTINATION_NODE:
				if (resolve) return getDestinationNode();
				return basicGetDestinationNode();
			case DataflowdiagramPackage.FLOW__DESTINATION_PIN:
				if (resolve) return getDestinationPin();
				return basicGetDestinationPin();
			case DataflowdiagramPackage.FLOW__SOURCE_PIN:
				if (resolve) return getSourcePin();
				return basicGetSourcePin();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DataflowdiagramPackage.FLOW__SOURCE_NODE:
				setSourceNode((Node)newValue);
				return;
			case DataflowdiagramPackage.FLOW__DESTINATION_NODE:
				setDestinationNode((Node)newValue);
				return;
			case DataflowdiagramPackage.FLOW__DESTINATION_PIN:
				setDestinationPin((Pin)newValue);
				return;
			case DataflowdiagramPackage.FLOW__SOURCE_PIN:
				setSourcePin((Pin)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case DataflowdiagramPackage.FLOW__SOURCE_NODE:
				setSourceNode((Node)null);
				return;
			case DataflowdiagramPackage.FLOW__DESTINATION_NODE:
				setDestinationNode((Node)null);
				return;
			case DataflowdiagramPackage.FLOW__DESTINATION_PIN:
				setDestinationPin((Pin)null);
				return;
			case DataflowdiagramPackage.FLOW__SOURCE_PIN:
				setSourcePin((Pin)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DataflowdiagramPackage.FLOW__SOURCE_NODE:
				return sourceNode != null;
			case DataflowdiagramPackage.FLOW__DESTINATION_NODE:
				return destinationNode != null;
			case DataflowdiagramPackage.FLOW__DESTINATION_PIN:
				return destinationPin != null;
			case DataflowdiagramPackage.FLOW__SOURCE_PIN:
				return sourcePin != null;
		}
		return super.eIsSet(featureID);
	}

} //FlowImpl
