package fr.istic.java.version.command;

import com.sun.xml.internal.ws.api.pipe.Engine;

import fr.istic.java.version.controller.Controller;
import fr.istic.java.version.model.IMetronomeEngine;
/**
 * Commande qui permet d'éxécuter une commande BeatCommand ou BarCommand en fonction
 * de la commande à effectuer.
 * @author dimitri
 *
 */
public class BeatFactoryCommand implements ICommand {

	private IMetronomeEngine engine ;
	
	/*(non-javadoc)
	 *  
	 * @see fr.istic.java.dimitri.command.ICommand#execute()
	 */
	@Override
	public void execute() {
		FactoryBeatCommand.getBeatCommand(engine).execute();
	}
	
	/**
	 * Permet d'ajouter le moteur métronome
	 * @param engine Le moteur métronome
	 */
	public void setEngine(IMetronomeEngine engine) {
		this.engine = engine ;
	}
	
	/**
	 *  Permet d'ajouter la commande pour les évènements de type battement
	 * @param commande La commande pour les évènements de type battement
	 */
	public void setBeatEvent(ICommand commande){
		FactoryBeatCommand.setBeatEvent(commande) ;
	}
	
	/**
	 * Permet d'ajouter la commande pour les évènements de type mesure
	 * @param commande La commande pour les évènements de type mesure.
	 */
	public void setBarEvent(ICommand commande){
		FactoryBeatCommand.setBarEvent(commande);
	}
}
