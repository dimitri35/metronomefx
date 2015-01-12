package fr.istic.java.version.command;
import java.awt.List;
import java.util.HashMap;

import fr.istic.java.version.controller.*;
import fr.istic.java.version.model.IMetronomeEngine;

/**
 * Classe qui permet d'éxécuter une évènement de type nouvelle mesure ou nouveau battement.
 * 
 *
 */
public class FactoryBeatCommand {

	public  static int nb = 0 ;
	private static ICommand beatEvent ;
	private static ICommand barEvent ;
	
	/**
	 * Permet d'obtenir une nouvelle commande de battement ou de mesure en fonction de la prochaine commande à éxécuté
	 * (battement ou mesure).
	 * @param engine Le moteur de métronome à ajouter.
	 * @return La commande à éxécuter.
	 */
	public static ICommand getBeatCommand( IMetronomeEngine engine){
		//On incrémente le nombre de battements déjà produit
		nb++ ;
		if(engine.getBeatsPerBar()!=0)
		{
			/*Si on veut produire un battement qui est divisible
			  par le nombre de battements par mesure.
			*/
			if(nb%engine.getBeatsPerBar()==0)
			{
				return barEvent ;
			}
			else
			{
				return beatEvent ;
			}
			
		}
		else
		{
			return beatEvent ;
		}
	}

	/**
	 * Permet d'ajouter la commande  à éxécuter à chaque nouveau battement.
	 * @param beatEvent La commande de battement à éxécuter.
	 */
	public static void setBeatEvent(ICommand beatEvent) {
		FactoryBeatCommand.beatEvent = beatEvent;
	}
	
	/**
	 * Permet d'ajouter la commande à éxécuter à chaque nouvelle mesure.
	 * @param barEvent La commande de mesure à éxécuter.
	 */
	public static void setBarEvent(ICommand barEvent) {
		FactoryBeatCommand.barEvent = barEvent;
	}
	
	
}
