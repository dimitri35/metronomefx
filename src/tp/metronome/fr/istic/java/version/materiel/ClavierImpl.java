package fr.istic.java.version.materiel;

import java.util.Observable;
import java.util.Observer;

import tp.metronome.View.*;

/**
 * Classe qui permet de gérer le clavier matériel.
 * @author dimitri
 *
 */
public class ClavierImpl implements Clavier{

	private boolean[] touchePresseTab ;
	
	/*
	 * (non-Javadoc)
	 * @see fr.istic.java.version.materiel.Clavier#touchePresse(int)
	 */
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
