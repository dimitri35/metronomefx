package fr.istic.java.dimitri.command;

import fr.istic.java.dimitri.controller.Controller;
import fr.istic.java.dimitri.model.IMetronomeEngine;

public interface IBeatCommand extends ICommand{

	public Controller getController() ; 
	public void setController(Controller controller) ;
}
