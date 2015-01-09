package fr.istic.java.main.materiel;

import tp.metronome.View.*;
import javafx.fxml.FXML;

/*
import model.Controller;
import model.JavaFX;
*/

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class AfficheurImpl implements Afficheur 
{
	public String affichage ;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	//public JavaFX javaFX;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	//public Controller controller;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public AfficheurImpl(){
		super();
	}

	public void allumerLED(int numLED) {
			IHM.ihm.getiDisplay().allumerLED(numLED);	
	}

	public void afficherTempo(int valeurTempo) {
			IHM.ihm.getiDisplay().setText(valeurTempo+"");
	}

	@Override
	public void éteindreLED(int numLED) {
			IHM.ihm.getiDisplay().éteindreLED(numLED);
	}


}

