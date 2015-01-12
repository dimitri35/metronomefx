package fr.istic.java.version.model;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.Timer;
import java.util.TimerTask;

import fr.istic.java.dounia.model.BipEvenementStop;
import fr.istic.java.version.command.BeatFactoryCommand;
import fr.istic.java.version.command.FactoryBeatCommand;
import fr.istic.java.version.command.ICommand;
import fr.istic.java.version.materiel.HorlogeImp;
import fr.istic.java.version.materiel.Materiel;

/**
 * Classe pour le moteur métronome.
 *
 */
public class MetronomeEngine extends Observable implements IMetronomeEngine {

	private int bpm ;
	private int beatsPerBar  ;
	
	private boolean on = false;
	
	private boolean running ;
	
	//Contient les commandes beat et bar
	private BeatFactoryCommand commandes ;
	
	private ICommand bpmChanged ;
	private ICommand beatsChanged ;
	
	//private Timer tmr ;
	
	//private int nbBeats = 0 ;
	
	public MetronomeEngine() {
		super() ;
		//on = true ;
		commandes = new BeatFactoryCommand() ;
		commandes.setEngine(this);
		beatsPerBar = 0 ;
		//tmr = new Timer() ;
		
	}
	
	/* (non-javadoc)
	 * @see fr.istic.java.dimitri.model.IMetronomeEngine#getBPM()
	 */
	public int getBPM() {
		return bpm ;
	}

	/* (non-javadoc) 
	 * @see fr.istic.java.dimitri.model.IMetronomeEngine#setBPM(int)
	 */
	public void setBPM(int bpm) {
		this.bpm = bpm ;
		//tmr.schedule(nouvelleTache(),0,60*1000/bpm);
		/* On active les commandes périodiquement avec le nouveau nombre de battements 
		 * par secondes
		 */
		Materiel.getHorloge().activerPériodiquement(commandes,60*1000/bpm);
		setChanged();
		/*
		 * On notifie tous les observers qu'on a modifié le nombre de battements par secondes.
		 */
		notifyObservers(bpmChanged);
	}

	/* (non-javadoc)
	 * @see fr.istic.java.dimitri.model.IMetronomeEngine#getBeatsPerBar()
	 */
	public int getBeatsPerBar() {
		return beatsPerBar ;
	}
	
	/* (non-javadoc)
	 * @see fr.istic.java.dimitri.model.IMetronomeEngine#setBeatsPerBar(int)
	 */
	public void setBeatsPerBar(int beatsPerBar) {
		this.beatsPerBar = beatsPerBar ;
	}

	/* (non-javadoc)
	 * @see fr.istic.java.dimitri.model.IMetronomeEngine#setRunning(boolean)
	 */
	public void setRunning(boolean running) {
		this.running = running ;
	}

	/* (non-javadoc)
	 * @see fr.istic.java.dimitri.model.IMetronomeEngine#isRunning()
	 */
	public boolean isRunning() {
		return this.running ;
	}

	/* (non-javadoc)
	 * @see fr.istic.java.dimitri.model.IMetronomeEngine#setBeatEventHandler(fr.istic.java.dimitri.command.ICommand)
	 */
	public void setBeatEventHandler(ICommand commande) {
		commandes.setBeatEvent(commande);
	}

	/* (non-javadoc)
	 * @see fr.istic.java.dimitri.model.IMetronomeEngine#setBarEventHandler(fr.istic.java.dimitri.command.ICommand)
	 */
	public void setBarEventHandler(ICommand commande) {
		commandes.setBarEvent(commande);
	}
	
	/* (non-javadoc)
	 * @see fr.istic.java.dimitri.model.IMetronomeEngine#start(int, int)
	 */
	public void start(int bpm,int beatsPerBar)
	{
		on = true ;
		setBPM(bpm);
		setBeatsPerBar(beatsPerBar) ;
		Materiel.getHorloge().désactiver(commandes);
		Materiel.getHorloge().activerPériodiquement(commandes,60*1000/bpm);
		//TimerTask tache = nouvelleTache() ;
		//tmr.schedule(tache,0,60/bpm*1000);
	}

	/*
	private void lancerBeats()
	{
		beatEv.execute();
	}
	
	private void lancerBar()
	{
		barEv.execute();
	}
	

	private void execTache() 
	{
		nbBeats++ ;
		lancerBeats();
		if(nbBeats%beatsPerBar==0)
		{
			lancerBar();
		}
	}
	
	
	private TimerTask nouvelleTache()
	{
		TimerTask tache = new TimerTask() {
			
			@Override
			public void run() {
				execTache();
			}
		};
		return tache ;
	}
	
	*/
	/*(non-javadoc)
	 * @see fr.istic.java.dimitri.model.IMetronomeEngine#setBpmChangedCmd(fr.istic.java.dimitri.command.ICommand)
	 */
	public void setBpmChangedCmd(ICommand commande) {
		bpmChanged = commande ;
	}

	/*
	 * (non-Javadoc)
	 * @see fr.istic.java.dimitri.model.IMetronomeEngine#setBeatsPerBarCmd(fr.istic.java.dimitri.command.ICommand)
	 */
	@Override
	public void setBeatsPerBarCmd(ICommand commande) {
		beatsChanged = commande ;
	}
	
	/*
	 * (non-Javadoc)
	 * @see fr.istic.java.dimitri.model.IMetronomeEngine#stop()
	 */
	public void stop(){
		//Si le moteur est allumé
		if (isOn()){
			on = false ;
			System.out.println("stop") ;
			//désactivation de la commande
			Materiel.getHorloge().désactiver(commandes);
			//horloge.désactiver(bipCommandeDesactive);
			//System.err.println("STOP");
			//System.err.println(isOn());
		}
	}
	/*
	 * (non-Javadoc)
	 * @see fr.istic.java.dimitri.model.IMetronomeEngine#inc()
	 */
	public void inc(){
		System.out.println("incrementation");
		if(this.beatsPerBar < 7)
			this.beatsPerBar++;
	}
	/*
	 * (non-Javadoc)
	 * @see fr.istic.java.dimitri.model.IMetronomeEngine#dec()
	 */
	public void dec(){
		System.out.println("decrementation");
		if(this.beatsPerBar > 2)
			this.beatsPerBar--;
	}

	
	/**
	 * Permet de savoir si le moteur métronome est allumé ou non.
	 * @return booléen qui retourne si le moteur est allumé ou non.
	 */
	public boolean isOn() {
		return on;
	}
	

	/*
	public void setOn(boolean on) {
		this.on = on;
	}
	*/
	
	
}
