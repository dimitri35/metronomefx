package fr.istic.java.version.command;

import fr.istic.java.version.controller.Controller;
import fr.istic.java.version.controller.IController;
import fr.istic.java.version.model.IMetronomeEngine;
/**
 * Interface pour les commandes à propos des battements.
 * @author dimitri
 *
 */
public interface IBeatCommand extends ICommand{

	/**
	 * Permet d'ajouter le HandlerBeat qui sera appelé lors de l'éxécution d'une commande
	 * à propos d'un battement.
	 * @param controller Le handleBeat qui sera appelé lors de l'éxécution d'une commande.
	 */
	public void setController(HandlerBeat controller) ;
}
