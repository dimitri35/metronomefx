package fr.istic.java.version.command;

/**
 * Interface qui permet de gérer les évènements de type  bouton
 */
public interface HandlerButton {

	/**
	 * Permet de démarrer le moteur métronome
	 */
	public void start() ;
	/**
	 * Permet d'arrêter le moteur métronome
	 */
	public void stop() ;
	/**
	 * Permet diminuer le nombre de battements par mesure
	 */
	public void dec() ;
	/**
	 * Permet d'augmenter le nombre de  battements par mesure
	 */
	public void inc() ;
}
