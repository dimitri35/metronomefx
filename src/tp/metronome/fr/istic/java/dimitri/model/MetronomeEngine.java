package fr.istic.java.dimitri.model;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.Timer;
import java.util.TimerTask;

import fr.istic.java.dimitri.command.BeatFactoryCommand;
import fr.istic.java.dimitri.command.FactoryBeatCommand;
import fr.istic.java.dimitri.command.ICommand;
import fr.istic.java.main.materiel.HorlogeImp;
import fr.istic.java.main.materiel.Materiel;
import fr.istic.java.main.model.BipEvenementStop;

public class MetronomeEngine extends Observable implements IMetronomeEngine {

	private int bpm ;
	private int beatsPerBar  ;
	
	private boolean on = false;
	
	private boolean running ;
	
	//Contient les commandes beat et bar
	private BeatFactoryCommand commandes ;
	
	private ICommand bpmChanged ;
	private ICommand beatsChanged ;
	
	private Timer tmr ;
	
	private int nbBeats = 0 ;
	
	public MetronomeEngine() {
		super() ;
		commandes = new BeatFactoryCommand() ;
		commandes.setEngine(this);
		beatsPerBar = 0 ;
		tmr = new Timer() ;
		
	}
	
	public int getBPM() {
		return bpm ;
	}

	public void setBPM(int bpm) {
		this.bpm = bpm ;
		System.out.println(60*1000/bpm) ;
		//tmr.schedule(nouvelleTache(),0,60*1000/bpm);
		Materiel.getHorloge().activerPériodiquement(commandes,60*1000/bpm);
		setChanged();
		notifyObservers(bpmChanged);
	}

	public int getBeatsPerBar() {
		// TODO Auto-generated method stub
		return beatsPerBar ;
	}
	
	public void setBeatsPerBar(int beatsPerBar) {
		this.beatsPerBar = beatsPerBar ;
	}

	public void setRunning(boolean running) {
		// TODO Auto-generated method stub	
		this.running = running ;
	}

	public boolean isRunning() {
		// TODO Auto-generated method stub
		return this.running ;
	}

	public void setBeatEventHandler(ICommand commande) {
		// TODO Auto-generated method stub
		commandes.setBeatEvent(commande);
	}

	public void setBarEventHandler(ICommand commande) {
		// TODO Auto-generated method stub
		commandes.setBarEvent(commande);
	}
	
	public void start(int bpm,int beatsPerBar)
	{
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
				// TODO Auto-generated method stub
				execTache();
			}
		};
		return tache ;
	}
	
	*/
	
	public void setBpmChangedCmd(ICommand commande) {
		bpmChanged = commande ;
	}

	@Override
	public void setBeatsPerBarCmd(ICommand commande) {
		beatsChanged = commande ;
	}
	
	public void stop(){
		if (isOn()){
			setOn(false);
			//horloge.désactiver(bipCommandeDesactive);
			System.err.println("STOP");
			System.err.println(isOn());
		}
	}
	
	public void inc(){
		System.out.println("incrementation");
		if(this.beatsPerBar < 7)
			this.beatsPerBar++;
	}
	
	public void dec(){
		System.out.println("decrementation");
		if(this.beatsPerBar > 2)
			this.beatsPerBar--;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}
}
