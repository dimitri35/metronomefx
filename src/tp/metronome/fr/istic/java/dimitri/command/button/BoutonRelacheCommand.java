package fr.istic.java.dimitri.command.button;

import fr.istic.java.dimitri.command.ICommand;

public class BoutonRelacheCommand implements ICommand{

	private int numCommande ;
	@Override
	public void execute() {
		
	}

	public void setNumeroCommand(int numCommande){
		this.numCommande = numCommande ;
	}
	
	
	
}
