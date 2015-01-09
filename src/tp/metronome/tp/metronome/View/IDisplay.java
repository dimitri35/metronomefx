package tp.metronome.View;

public interface IDisplay {
	/**
	 * Permet d'allumer la LED de numéro numLED
	 * @param numLED Le numéro de LED à allumer.
	 */
	public void allumerLED(int numLED) ;
	/**
	 * Permet d'éteindre la LED de numéro numLED
	 * @param numLED Le numéro de LED à éteindre.
	 */
	public void éteindreLED(int numLED) ;
	/**
	 * Permet d'émettre un flash pour pour un nouveau battement.
	 */
	public void flashBeat() ;
	/**
	 * Permet d'émettre un flash pour la nouvelle mesure.
	 */
	public void flashBar() ;
	/**
	 * Permet de changer le texte qui sera affiché sur le métronome.
	 * @param text Le texte à afficher sur le métronome.
	 */
	public void setText(String text); 
	
}
