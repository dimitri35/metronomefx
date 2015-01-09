package fr.istic.java.dimitri.adapteur;

import fr.istic.java.dimitri.command.ICommand;

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
	 *
	 */
	public void setHandler(HandlerPoll handler) {
		this.handler = handler ;
	}
	
	
	
}
