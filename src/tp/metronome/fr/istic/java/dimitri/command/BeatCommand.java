package fr.istic.java.dimitri.command;

import fr.istic.java.dimitri.controller.Controller;



/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class BeatCommand implements ICommand
{
	public Controller controller ;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public BeatCommand(){
		super();
	}

	public BeatCommand(Controller ctrler)
	{
		
	}
	public void execute() {
		controller.handleBeatEvent();
		
	}

	public Controller getController() {
		return controller;
	}

	public void setController(Controller controller) {
		this.controller = controller;
	}
}

