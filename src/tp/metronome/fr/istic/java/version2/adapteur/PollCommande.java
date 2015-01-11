package fr.istic.java.version2.adapteur;

import fr.istic.java.version.command.ICommand;

/**
 * Commande qui permet d'éxécuter le lancement périodique d'une tâche.
 *
 */
public class PollCommande implements ICommand{

	private HandlerPoll handler ;
	
	/*
	 * (non-Javadoc)
	 * @see fr.istic.java.dimitri.command.ICommand#execute()
	 */
	@Override
	public void execute() {
		handler.poll(); 
	}
	
	/**
	 * Permet d'ajouter un HandlerPoll qui sera le récepteur de la commande.
	 */
	public void setHandler(HandlerPoll handler) {
		this.handler = handler ;
	}
	
	
	
}
