package fr.istic.java.version.materiel;

/**
 * Classe qui permet de gérer l'émetteur sonore.
 * @author dounia 
 *
 */
public class EmetteurSonoreImpl implements EmetteurSonore {
	
	private Son monSon = new Son("/ressources/beep-08b.wav", "/ressources/cell-phone-1-nr2.wav", 4);

	/*
	 * (non-Javadoc)
	 * @see fr.istic.java.version.materiel.EmetteurSonore#emettreClic()
	 */
	public void emettreClic() {
		monSon.jouerBeat() ;
	}
	
	/*
	 * (non-Javadoc)
	 * @see fr.istic.java.version.materiel.EmetteurSonore#emettreClicBar()
	 */
	public void emettreClicBar() {
		monSon.jouerBar();
	}
	
}
