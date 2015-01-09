package fr.istic.java.dimitri.command;


import fr.istic.java.dimitri.controller.*;

/**
 * @author dimitri
 *
 * @generated
 */

public class BarCommand implements IBeatCommand 
{
	private HandlerBeat controller ;
	

	/**
	 * 
	 * 
	 * @generated
	 */
	public BarCommand(){
		super();
	}
	
	/* (non-javadoc)
	 * 
	 * @see fr.istic.java.dimitri.command.ICommand#execute()
	 */
	public void execute() {
		controller.handleBarEvent();
		controller.handleBeatEvent(); 	
	}


	public void setController(HandlerBeat controller) {
		this.controller = controller;
	}
}

