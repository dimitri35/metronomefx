package fr.istic.java.dimitri.model;

import java.util.Observer;

import fr.istic.java.dimitri.command.ICommand;

/**
 * @author dimitri
 * 
 * 
 */
public  interface IMetronomeEngine 
{
	/**
	 * Permet de récupérer le nombre de battements par minutes
	 * @return retourne le nombre de battements par minutes
	 */
	public int getBPM() ;
	/**
	 * Permet de retourner le nombre de battements par minutes
	 * @param bpm
	 */
	public void setBPM(int bpm) ;
	/**
	 * Permet d'obtenir le nombre de battements par mesure
	 * @return retourne le nombre de battements par mesure
	 */
	public int getBeatsPerBar() ;
	/**
	 *Permet de mettre le Métronome Engine sur pause pour l'éxécution de commande (Aucune éxécution de commande mais
	 * @param running 
	 */
	public void setRunning(boolean running) ;
	/**
	 * Permet de savoir si le MétronomeEngine est démarré ou non
	 * @return retourne un booléen qui représente si le MetronomeEngine est démarré  ou pas (True = démarré, False = non démarré)
	 */
	public boolean isRunning() ;
	/**
	 * Permet d'ajouter la commande qui sera éxécuté lors de l'éxécution d'un nouveau battement.
	 * @param commande La commande à éxécuter lors d'un nouveau battement
	 */
	public void setBeatEventHandler(ICommand commande) ;
	/**
	 * Permet d'ajouter une commande au MétronomeEngine qui sera éxécuté lors d'une nouvelle mesure
	 * @param commande La commande à éxécuter lors d'une nouvelle mesure
	 */
	public void setBarEventHandler(ICommand commande) ;
	/**
	 * Permet d'ajouter la commande au moteur du métronome qui sera éxécuté lors du changement du nombre de battements par minutes
	 * @param commande La commande qui sera éxécuté lors du changement du nombre de battements par minutes
	 */
	public void setBpmChangedCmd(ICommand commande ) ;
	/**
	 * Permet d'ajouter une commande qui sera lancée lors de l'éxécution d'une nouvelle mesure
	 * @param commande la commande a lancer lors de l'éxécution d'une nouvelle mesure
	 */
	public void setBeatsPerBarCmd(ICommand commande) ;
	/**
	 * permet de lancer le moteur du métronome
	 * @param beat nombres de battements par minutes
	 * @param bar nombres de battements par mesure
	 */
	public void start(int beat,int bar) ;
	/**
	 * permettre d'arrêter le MétronomeEngine
	 */
	public void stop() ;
	
	/**
	 * Incrémente le nombre de battements par mesure
	 */
	public void inc() ;
	/**
	 * Décremente le nombre de battements par mesure
	 */
	public void dec() ;
	/**
	 * Permettre de mettre un nombre de battements par mesure au MetronomeEngine
	 * @param beatsPerBar nombre de battements par mesure
	 */
	public void setBeatsPerBar(int beatsPerBar) ;
	
}

