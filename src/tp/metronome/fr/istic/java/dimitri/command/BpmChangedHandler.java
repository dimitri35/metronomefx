package fr.istic.java.dimitri.command;

import fr.istic.java.dimitri.controller.Controller;

public class BpmChangedHandler implements ICommand{
	private Controller  controleur ;
	
	public void execute() {
		
	}

	public Controller getControleur() {
		return controleur;
	}

	public void setControleur(Controller controleur) {
		this.controleur = controleur;
	}
}
