package fr.istic.java.dimitri.command;

import fr.istic.java.dimitri.controller.Controller;
import fr.istic.java.dimitri.controller.IController;



/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class BeatCommand implements IBeatCommand
{
	public HandlerBeat controller ;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public BeatCommand(){
		super();
	}

	public BeatCommand(HandlerBeat ctrler)
	{
		this.controller = ctrler ;
	}
	
	/* (non-javadoc)
	 * 
	 * @see fr.istic.java.dimitri.command.ICommand#execute()
	 */
	public void execute() {
		controller.handleBeatEvent();	
	}

	public void setController(HandlerBeat controller) {
		this.controller = controller;
	}
}

