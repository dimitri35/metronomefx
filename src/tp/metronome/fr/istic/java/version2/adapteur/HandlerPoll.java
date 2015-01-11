package fr.istic.java.version2.adapteur;

/**
 * Interface qui permet de gérer la récupération d'une valeur de manière périodique.
 *
 */
public interface HandlerPoll {
	/**
	 * Permet de lancer une tâche qui peut être éxécuté de manière périodique
	 */
	public void poll() ;
}
