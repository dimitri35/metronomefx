package fr.istic.java.main.materiel;

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
		// TODO Auto-generated method stub
		
	}

	public void eteindreLED(int numLED) {
		// TODO Auto-generated method stub
		
	}

	public void afficherTempo(int valeurTempo) {
		System.out.println() ;
		affichage = valeurTempo+"" ;
		
	}

	@Override
	public void éteindreLED(int numLED) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String getTexte() {
		return affichage ;	
	}

}

