package fr.istic.java.dimitri.adapteur;

import tp.metronome.View.VueMetronome;


public class AdapteurMateriel implements VueMetronome {

	private  DisplayAdapter display = new DisplayAdapter() ;
	private  SliderAdapter  slider = new SliderAdapter() ;
	private  BoutonAdapteur bouton = new BoutonAdapteur() ;
	
	/**
	 * @return L'adapteur matériel pour l'affichage 
	 */
	public   DisplayAdapter getiDisplay() {
		return display;
	}
	
	/**
	 * @return L'adapteur matériel pour la molette
	 */
	public  SliderAdapter getiSlider() {
		return slider;
	}
	
	/**
	 * @return L'adapteur matériel pour le bouton
	 */
	public  BoutonAdapteur getBouton() {
		return bouton;
	}
	
	
	
	
}
