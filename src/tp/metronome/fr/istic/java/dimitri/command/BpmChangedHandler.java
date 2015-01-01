package fr.istic.java.dimitri.command;

import fr.istic.java.dimitri.controller.Controller;
import fr.istic.java.dimitri.model.MetronomeEngine;

public class BpmChangedHandler implements ICommand{
	
	private Controller controller;
	
	public void execute() {
		if(controller != null)
			controller.handleBpmChanged();
	}
	
	public void setController(Controller controller) {
		this.controller = controller;
	}
	
	
}
