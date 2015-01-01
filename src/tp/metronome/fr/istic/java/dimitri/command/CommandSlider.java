package fr.istic.java.dimitri.command;

import fr.istic.java.dimitri.controller.Controller;

public class CommandSlider implements ICommand{

	private Controller controleur ;

	public CommandSlider(Controller controleur) {
		this.controleur = controleur ;
	}
	@Override
	public void execute() {
		controleur.handleSliderChanged();
	}
	
	public void setControleur(Controller controleur) {
		this.controleur = controleur;
	}
	
}
