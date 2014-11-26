package tp.metronome.model;

import java.util.Timer;
import java.util.TimerTask;

public interface Horloge {

	void activerPériodiquement(Commande cmd, long périodeEnSecondes) ;
	//void activerAprèsDélai(final Commande cmd, long délaiEnSecondes, long périodeEnSecondes) ;
	void désactiver(Commande cmd) ;
	public Timer getTimer();
	public TimerTask getTimerTask();
}
