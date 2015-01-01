package fr.istic.java.main.materiel;

import java.util.Timer;
import java.util.TimerTask;

import fr.istic.java.dimitri.command.ICommand;
import fr.istic.java.main.model.Commande;

public interface Horloge {

	void activerPériodiquement(ICommand cmd, long périodeEnSecondes) ;
	//void activerAprèsDélai(final Commande cmd, long délaiEnSecondes, long périodeEnSecondes) ;
	void désactiver(ICommand cmd) ;
	public Timer getTimer();
	public TimerTask getTimerTask();
}
