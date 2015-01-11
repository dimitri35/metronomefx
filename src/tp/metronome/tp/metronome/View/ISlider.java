package tp.metronome.View;

import fr.istic.java.version.command.ICommand;
/**
 * Classe qui permet de gérer les  molettes.
 * @author dimitri
 *
 */
public interface ISlider {

	/**
	 * Permet d'ajouter une commande qui sera éxécuté lors du changement de la molette.
	 * @param commande La commande qui sera éxécuté lors du changement de la molette.
	 */
	public  void setChangedSlider(ICommand commande)  ;
	/**
	 * 
	 * @return La commande qui sera éxécuté lors du changement de la molette.
	 */
	public  ICommand getSliderCommand() ;
	/**
	 * Permet de récupérer la position de la molette.
	 * @return La position de la molette.
	 */
	public  double getValue() ;

}
