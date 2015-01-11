package fr.istic.java.version.command;

import tp.metronome.View.IButton;
import fr.istic.java.version.controller.IController;
import fr.istic.java.version2.adapteur.BoutonAdapteur;

/**
 * Classe qui permet d'éxécuter un évènement de type clic
 * @author dimitri
 *
 */
public class ClickCommand implements ICommand {

	private int numCommande ;
	private IButton  adapteur ;
	private HandlerButton controleur ;
	
	/*
	 * (non-Javadoc)
	 * @see fr.istic.java.dimitri.command.ICommand#execute()
	 */
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
	
	/**
	 * Permet d'ajouter un IButton qui éxécutera la commande.
	 * @param adapteur un IButton qui éxécutera la commande.
	 */
	public void setSource(IButton adapteur)
	{
		this.adapteur = adapteur ;
	}
	
	/**
	 * Permet d'ajouter un HandlerButton qui sera appelé lors de l'éxécution de la commande
	 * @param controleur
	 */
	public void setController(HandlerButton controleur)
	{
		this.controleur = controleur ;
	}
	
}
