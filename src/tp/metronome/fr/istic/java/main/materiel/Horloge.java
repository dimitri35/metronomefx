package fr.istic.java.main.materiel;

import java.util.Timer;
import java.util.TimerTask;

import fr.istic.java.main.model.Commande;

public interface Horloge {

	void activerPériodiquement(Commande cmd, long périodeEnSecondes) ;
	//void activerAprèsDélai(final Commande cmd, long délaiEnSecondes, long périodeEnSecondes) ;
	void désactiver(Commande cmd) ;
	public Timer getTimer();
	public TimerTask getTimerTask();
}
