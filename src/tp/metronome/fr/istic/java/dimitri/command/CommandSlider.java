package fr.istic.java.dimitri.command;

import fr.istic.java.dimitri.controller.IController;

public class CommandSlider implements ICommand{

	private IController controleur ;

	public CommandSlider(IController controleur) {
		this.controleur = controleur ;
	}
	
	/* (non-javadoc)
	 * 
	 * @see fr.istic.java.dimitri.command.ICommand#execute()
	 */
	@Override
	public void execute() {
		controleur.handleSliderChanged();
	}
	
	public void setControleur(IController controleur) {
		this.controleur = controleur;
	}
	
}
