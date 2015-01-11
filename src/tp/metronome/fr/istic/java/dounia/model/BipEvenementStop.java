package fr.istic.java.dounia.model;

import fr.istic.java.version.materiel.Horloge;

public class BipEvenementStop implements Commande{

	Horloge monHorloge;
	
	public BipEvenementStop(Horloge horloge) {
		
		monHorloge = horloge;
	}
	
	@Override
	public void Execute() {
		
		monHorloge.getTimerTask().cancel();
		monHorloge.getTimer().cancel();
	}

}
