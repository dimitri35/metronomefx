package fr.istic.java.version.command;
/**
 * Interface qui permet  de gérer les évènements concernant les battements et les mesures.
 */
public interface HandlerBeat {
	
	/**
	 * Permet d'éxécuter un battement
	 */
	public void handleBeatEvent() ;
	/**
	 * Permet d'éxécuter une mesure
	 */
	public void handleBarEvent() ;
	/**
	 * Permet de notifier la mise à jour du battement à la vue
	 */
	public void handleBpmChanged() ;
}
