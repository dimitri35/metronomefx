package fr.istic.java.version.command;

import fr.istic.java.version.controller.Controller;
import fr.istic.java.version.controller.IController;



/**
 * Commande qui permet d'éxécuter un battement.
 * 
 */

public class BeatCommand implements IBeatCommand
{
	public HandlerBeat controller ;

	public BeatCommand(){
		super();
	}
	/**
	 * Permet d'ajouter un HandlerBeat qui sera appelé lors de l'éxécution de la commande
	 * et de créer une commande BeatCommande
	 * @param ctrler Le HandlerBeat à ajouter 
	 */
	public BeatCommand(HandlerBeat ctrler)
	{
		this.controller = ctrler ;
	}
	
	/* (non-javadoc)
	 * 
	 * @see fr.istic.java.dimitri.command.ICommand#execute()
	 */
	public void execute() {
		controller.handleBeatEvent();	
	}

	/*
	 * (non-Javadoc)
	 * @see fr.istic.java.dimitri.command.IBeatCommand#setController(fr.istic.java.dimitri.command.HandlerBeat)
	 */
	public void setController(HandlerBeat controller) {
		this.controller = controller;
	}
}

