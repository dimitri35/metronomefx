package fr.istic.java.dimitri.command.button;

import tp.metronome.View.IButton;
import fr.istic.java.dimitri.adapteur.BoutonAdapteur;
import fr.istic.java.dimitri.command.ICommand;
import fr.istic.java.dimitri.controller.IController;

public class ClickCommand implements ICommand {

	private int numCommande ;
	private IButton  adapteur ;
	private HandlerButton controleur ;
	
	@Override
	public void execute() {
		
		switch(adapteur.getNumPresse())
		{
			case 1 :
				controleur.start(); 
				break ;
			case 2 :
				controleur.stop() ;
				break ;
			case 3 :
				controleur.inc();
				break ;
			case 4:
				controleur.dec() ;
				break ;
		}
		
	}
	
	public void setSource(IButton adapteur)
	{
		this.adapteur = adapteur ;
	}
	
	public void setController(HandlerButton controleur)
	{
		this.controleur = controleur ;
	}
	
}
