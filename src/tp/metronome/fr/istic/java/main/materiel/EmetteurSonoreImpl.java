package fr.istic.java.main.materiel;

public class EmetteurSonoreImpl implements EmetteurSonore {

	private Son monSon = new Son("/ressources/beep-08b.wav", "/ressources/cell-phone-1-nr2.wav", 4);

	public void emettreClic() {
		monSon.jouer() ;
	}

}
