package fr.istic.java.main.materiel;

import tp.metronome.View.Controller;
import tp.metronome.View.IHM;
import tp.metronome.View.Metronome;

public class MoletteImpl implements Molette {

	private float positionVal ;
	
	public float position() {
		return (float) IHM.ihm.getiSlider().getValue() ;
	}

}
