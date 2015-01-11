package fr.istic.java.version.materiel;

import tp.metronome.View.Controller;
import tp.metronome.View.IHM;
import tp.metronome.View.Metronome;

/**
 * Classe qui permet de gérer la molette matériel.
 * @author dimitri
 *
 */
public class MoletteImpl implements Molette {

	private float positionVal ;
	
	/*
	 * (non-Javadoc)
	 * @see fr.istic.java.version.materiel.Molette#position()
	 */
	public float position() {
		return (float) IHM.ihm.getiSlider().getValue() ;
	}
}
