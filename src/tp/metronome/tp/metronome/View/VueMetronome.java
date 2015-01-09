package tp.metronome.View;

import fr.istic.java.dimitri.adapteur.BoutonAdapteur;
import fr.istic.java.dimitri.adapteur.DisplayAdapter;
import fr.istic.java.dimitri.adapteur.SliderAdapter;

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
