package fr.istic.java.main.materiel;

import java.util.Observable;
import java.util.Observer;

import tp.metronome.View.IHM;
import tp.metronome.View.* ;
import fr.istic.java.dimitri.command.button.EtatBoutonListener;
import fr.istic.java.dimitri.command.button.StartListener;
import fr.istic.java.dimitri.command.button.StopListener;

public class ClavierImpl implements Clavier{

	private boolean[] touchePresseTab ;
	
	public boolean touchePresse(int i) {
		//System.out.println(IHM.getTouchePresse()[i]) ;
		return IHM.ihm.getTouchePresse()[i-1] ;
	}
	
	/*
	@Override
	public void boutonEnfonce(int num) {
		touchePresseTab[num] = true ;
	}
	@Override
	public void boutonRelache(int num) {
		touchePresseTab[num] = false ;
	}
	*/
	
	
}
