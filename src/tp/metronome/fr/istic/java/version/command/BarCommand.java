package fr.istic.java.version.command;


import fr.istic.java.version.controller.*;

/**
 * Classe qui permet d'éxécuter un évènement de  nouvelle mesure
 * @author dimitri
 *
 */

public class BarCommand implements IBeatCommand 
{
	private HandlerBeat controller ;
	
	public BarCommand(){
		super();
	}
	
	/* (non-javadoc)
	 * 
	 * @see fr.istic.java.dimitri.command.ICommand#execute()
	 */
	public void execute() {
		controller.handleBarEvent();
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

