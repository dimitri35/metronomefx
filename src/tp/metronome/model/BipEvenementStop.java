package tp.metronome.model;

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
