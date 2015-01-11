package fr.istic.java.version.materiel;

import java.util.Timer;
import java.util.TimerTask;

import fr.istic.java.dounia.model.Commande;
import fr.istic.java.version.command.ICommand;

/**
 * Interface qui permet de gérer l'horloge.
 * @author dounia
 *
 */
public interface Horloge {
	/**
	 * Permet de gérer l'activation périodique d'une commande.
	 * @param cmd Commande qui sera lancé périodiquement.
	 * @param périodeEnSecondes Durée entre deux activations de la commande.
	 */
	void activerPériodiquement(ICommand cmd, long périodeEnSecondes) ;
	//void activerAprèsDélai(final Commande cmd, long délaiEnSecondes, long périodeEnSecondes) ;
	/**
	 * Permet de désactiver l'éxécution périodique d'une commande.
	 * @param cmd La commande à désactiver de manière périodique.
	 */
	void désactiver(ICommand cmd) ;
	/**
	 * Permet de récupérer l'objet de type Timer.
	 * @return L'objet de type Timer.
	 */
	public Timer getTimer();
	/**
	 * Permet de récupérer l'objet de type TimerTask.
	 * @return L'objet de type TimerTask
	 */
	public TimerTask getTimerTask();
}
