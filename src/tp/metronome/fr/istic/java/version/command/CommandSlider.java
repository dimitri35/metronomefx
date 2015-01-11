package fr.istic.java.version.command;

import fr.istic.java.version.controller.IController;

/**
 * Classe qui permet d'éxécuter un évènement de type changement de position de la molette.
 * @author dimitri
 *
 */
public class CommandSlider implements ICommand{

	private IController controleur ;
	
	/**
	 * Ajoute un contrôleur et crée un nouvelle commande.
	 * @param controleur Le controleur à ajouter
	 */
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
	
	/**
	 * Permet d'ajouter un controleur qui sera appelé lorsque la valeur de la molette changera.
	 * @param controleur Le controleur à ajouter.
	 */
	public void setControleur(IController controleur) {
		this.controleur = controleur;
	}
	
}
