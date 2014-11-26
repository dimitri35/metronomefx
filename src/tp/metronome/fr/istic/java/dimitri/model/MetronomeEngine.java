package fr.istic.java.dimitri.model;

import java.util.Observable;
import java.util.Observer;
import java.util.Timer;
import java.util.TimerTask;

import fr.istic.java.dimitri.command.ICommand;
import fr.istic.java.main.materiel.HorlogeImp;

public class MetronomeEngine extends Observable implements IMetronomeEngine {

	private int bpm ;
	private int beatsPerBar  ;
	
	private boolean running ;
	
	private ICommand beatEv ;
	private ICommand barEv ;
	private ICommand bpmChangedHandler ;
	
	private Timer tmr ;
	
	private int nbBeats = 0 ;
	
	public MetronomeEngine() {
		tmr = new Timer() ;
		
	}
	
	public int getBPM() {
		// TODO Auto-generated method stub
		return bpm ;
	}

	public void setBPM(int bpm) {
		// TODO Auto-generated method stub
		this.bpm = bpm ;
		//tmr.schedule(nouvelleTache(),0,60/bpm*1000);
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
		this.beatEv = commande ;
	}

	public void setBarEventHandler(ICommand commande) {
		// TODO Auto-generated method stub
		this.barEv = commande ;
	}
	
	public void start(int bpm,int beatsPerBar)
	{
		setBPM(bpm);
		setBeatsPerBar(beatsPerBar) ;
		TimerTask tache = nouvelleTache() ;
		tmr.schedule(tache,0,60/bpm*1000);
	}

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
	

	public void setBpmChangedHandler(ICommand commande) {
		this.bpmChangedHandler = commande ;
	}
	
	public ICommand getCommandObserver() {
		return null;
	}
	
	public void executeChange(Observer obs)
	{
		bpmChangedHandler.execute() ;
	}
	
}
