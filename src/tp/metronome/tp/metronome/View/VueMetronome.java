package tp.metronome.View;

import fr.istic.java.version2.adapteur.BoutonAdapteur;
import fr.istic.java.version2.adapteur.DisplayAdapter;
import fr.istic.java.version2.adapteur.SliderAdapter;

/**
 * Classe qui permet de gérer les vues utilisés par le contrôleur.
 *
 */
public interface VueMetronome {

	/**
	 * @return L'adapteur matériel pour l'affichage 
	 */
	public   IDisplay getiDisplay() ;
	
	/**
	 * @return L'adapteur matériel pour la molette
	 */
	public  ISlider getiSlider() ;
	
	/**
	 * @return L'adapteur matériel pour le bouton
	 */
	public  IButton getBouton() ;

}
