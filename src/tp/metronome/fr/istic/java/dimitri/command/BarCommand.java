package fr.istic.java.dimitri.command;

import fr.istic.java.dimitri.controller.Controller;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class BarCommand implements ICommand 
{
	private Controller controller ;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public BarCommand(){
		super();
	}

	public void execute() {
		controller.handleBarEvent(); 		
	}

	public Controller getController() {
		return controller;
	}

	public void setController(Controller controller) {
		this.controller = controller;
	}
}

