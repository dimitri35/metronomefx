package fr.istic.java.dimitri.model;

import java.util.Observer;

import fr.istic.java.dimitri.command.ICommand;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public  interface IMetronomeEngine 
{
	public int getBPM() ;
	public void setBPM(int bpm) ;
	public int getBeatsPerBar() ;
	public void setRunning(boolean running) ;
	public boolean isRunning() ;
	
	public void setBeatEventHandler(ICommand commande) ;
	public void setBarEventHandler(ICommand commande) ;
	public void setBpmChangedCmd(ICommand commande ) ;
	public void setBeatsPerBarCmd(ICommand commande) ;
	
	public void start(int beat,int bar) ;
	public void stop() ;
	
	public void setBeatsPerBar(int beatsPerBar) ;
	
	public void inc() ;
	public void dec() ;
	
}

