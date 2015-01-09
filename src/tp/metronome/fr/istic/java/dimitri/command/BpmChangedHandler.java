package fr.istic.java.dimitri.command;

import fr.istic.java.dimitri.controller.IController;

public class BpmChangedHandler implements ICommand{
	
	private IController controller;
	
	/* (non-javadoc)
	 * 
	 * @see fr.istic.java.dimitri.command.ICommand#execute()
	 */
	public void execute() {
		if(controller != null)
			controller.handleBpmChanged();
	}
	
	public void setController(IController controller) {
		this.controller = controller;
	}
	
	
}
