package fr.istic.java.main.materiel;

public interface Afficheur {

	void allumerLED(int numLED) ;
	void éteindreLED(int numLED) ;
	 // Affiche un entier sur l’afficheur externe du métronome
	void afficherTempo(int valeurTempo) ;
	
}
