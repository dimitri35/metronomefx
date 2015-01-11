package fr.istic.java.version.materiel;

/**
 * Interface qui permet de gérer l'afficheur matériel.
 * @author dimitri
 *
 */
public interface Afficheur {
	/**
	 * Permet d'allumer la LED de numéro numLED
	 * @param numLED  numéro de la LED
	 */
	void allumerLED(int numLED) ;
	/**
	 * Permet d'éteindre la LED de numéro numLED
	 * @param numLED numéro de la LED
	 */
	void éteindreLED(int numLED) ;
	/**
	 * Permet d'afficher le tempo sur le métronome.
	 * @param valeurTempo Valeur du tempo
	 */
	 // Affiche un entier sur l’afficheur externe du métronome
	void afficherTempo(int valeurTempo) ;
	
}
