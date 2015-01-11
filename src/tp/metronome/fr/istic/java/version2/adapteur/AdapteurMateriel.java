package fr.istic.java.version2.adapteur;

import tp.metronome.View.VueMetronome;

/**
 * Adapteur qui permet de transformer le matériel en IHM Java Fx.
 *
 */
public class AdapteurMateriel implements VueMetronome {

	private  DisplayAdapter display = new DisplayAdapter() ;
	private  SliderAdapter  slider = new SliderAdapter() ;
	private  BoutonAdapteur bouton = new BoutonAdapteur() ;
	
	/*
	 * (non-Javadoc)
	 * @see tp.metronome.View.VueMetronome#getiDisplay()
	 */
	public   DisplayAdapter getiDisplay() {
		return display;
	}
	
	/*
	 * (non-Javadoc)
	 * @see tp.metronome.View.VueMetronome#getiSlider()
	 */
	public  SliderAdapter getiSlider() {
		return slider;
	}
	
	/*
	 * (non-Javadoc)
	 * @see tp.metronome.View.VueMetronome#getBouton()
	 */
	public  BoutonAdapteur getBouton() {
		return bouton;
	}
	
	
}
