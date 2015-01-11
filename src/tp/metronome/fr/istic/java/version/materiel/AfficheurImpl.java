package fr.istic.java.version.materiel;

import tp.metronome.View.*;
import javafx.fxml.FXML;

/*
import model.Controller;
import model.JavaFX;
*/

/**
 * Classe qui permet de gérer les afficheur matériel.
 * @generated
 */

public class AfficheurImpl implements Afficheur 
{
	public String affichage ;
	
	public AfficheurImpl(){
		super();
	}

	/*
	 * (non-Javadoc)
	 * @see fr.istic.java.version.materiel.Afficheur#allumerLED(int)
	 */
	public void allumerLED(int numLED) {
			IHM.ihm.getiDisplay().allumerLED(numLED);	
	}

	/*
	 * (non-Javadoc)
	 * @see fr.istic.java.version.materiel.Afficheur#afficherTempo(int)
	 */
	public void afficherTempo(int valeurTempo) {
			IHM.ihm.getiDisplay().setText(valeurTempo+"");
	}

	/*
	 * (non-Javadoc)
	 * @see fr.istic.java.version.materiel.Afficheur#éteindreLED(int)
	 */
	@Override
	public void éteindreLED(int numLED) {
			IHM.ihm.getiDisplay().éteindreLED(numLED);
	}


}

