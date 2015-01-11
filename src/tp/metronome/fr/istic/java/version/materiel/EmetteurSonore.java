package fr.istic.java.version.materiel;

/**
 * Interface qui permet de gérer l'émetteur sonore.
 * @author dimitri
 *
 */
public interface EmetteurSonore {
	/**
	 * Permet d'émettre un son clic (battement).
	 */
	void emettreClic() ;
	/**
	 * Permet d'émettre un son clic (battement avec nouvelle mesure).
	 */
	void emettreClicBar() ;
}
