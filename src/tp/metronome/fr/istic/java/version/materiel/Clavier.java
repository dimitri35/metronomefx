package fr.istic.java.version.materiel;

/**
 * Interface qui permet de gérer le clavier matériel.
 * @author dimitri
 */
public interface Clavier {

	/**
	 * Permet de savoir si une touche a été pressé.
	 * @param i Le numéro de la touche.
	 * @return Un booléen représentant si la touche a été pressé ou non.
	 */
	boolean touchePresse(int i) ;
}
