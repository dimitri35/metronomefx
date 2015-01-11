package fr.istic.java.version.command;

import fr.istic.java.version.controller.IController;

/**
 * Commande qui permet d'éxécuter un évènement de changement de molette
 * @author dimitri
 *
 */
public class BpmChangedHandler implements ICommand{
	
	private HandlerBeat controller;
	
	/* (non-javadoc)
	 * 
	 * @see fr.istic.java.dimitri.command.ICommand#execute()
	 */
	public void execute() {
		if(controller != null)
			controller.handleBpmChanged();
	}
	
	/**
	 * Permet d'ajouter un controleur qui sera appelé lorsque le nombre de battements par secondes changera 
	 * @param controller Le controller à ajouter.
	 */
	public void setController(HandlerBeat controller) {
		this.controller = controller;
	}
	
	
}
