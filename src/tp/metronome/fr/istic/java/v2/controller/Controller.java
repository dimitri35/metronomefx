package fr.istic.java.v2.controller;

import java.util.Observable;
import java.util.Observer;

import javafx.beans.binding.SetBinding;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

import org.xml.sax.HandlerBase;

import tp.metronome.View.IHM;
import fr.istic.java.dimitri.adapteur.VueMetronome;
import fr.istic.java.dimitri.adapteur.VueMetronome;
import fr.istic.java.dimitri.command.BarCommand;
import fr.istic.java.dimitri.command.BeatCommand;
import fr.istic.java.dimitri.command.BpmChangedHandler;
import fr.istic.java.dimitri.command.CommandSlider;
import fr.istic.java.dimitri.command.HandlerBeat;
import fr.istic.java.dimitri.command.ICommand;
import fr.istic.java.dimitri.command.button.ClickCommand;
import fr.istic.java.dimitri.command.button.HandlerButton;
import fr.istic.java.dimitri.controller.IController;
import fr.istic.java.dimitri.model.IMetronomeEngine;
import fr.istic.java.dimitri.model.MetronomeEngine;
import fr.istic.java.main.materiel.Afficheur;
import fr.istic.java.main.materiel.Materiel;

/**
 * @author dimitri
 * 
 */
public class Controller  implements IController, Observer
{

	private int bpm ;
	private int beatsPerBar ;	
	private IMetronomeEngine engine ;
	public Afficheur iLED;
	
	/**
	 * 
	 *
	 * @generated
	 */
	public Controller(IMetronomeEngine engine){
		
		this.engine = engine ;
				
		BeatCommand beatCommand = new BeatCommand() ;
		beatCommand.setController(this);
		engine.setBeatEventHandler(beatCommand);
		
		BarCommand barCommand = new BarCommand() ;
		barCommand.setController(this);
		engine.setBarEventHandler(barCommand);
		
		BpmChangedHandler bpmHandler = new BpmChangedHandler() ;
		engine.setBpmChangedCmd(new BpmChangedHandler());
		Observable engineObservable = (Observable) engine ;
		engineObservable.addObserver(this);
		//engineObservable.addObserver(o);
		//IHM.setChangedSlider(new CommandSlider(this)) ;
		VueMetronome.getiSlider().setChangedSlider(new ICommand() {
			@Override
			public void execute() {
				handleSliderChanged();
			}
		});
		ClickCommand  commandeClick = new ClickCommand() ;
		commandeClick.setSource(VueMetronome.getBouton());
		commandeClick.setController(this);
		VueMetronome.getBouton().setCommande(commandeClick) ;
		
		engine.start(60,4) ;
	}
	
	/*
	 * (non-Javadoc)
	 * @see fr.istic.java.dimitri.command.button.HandlerButton#start()
	 */
	@Override
	public void start() {
		engine.start(60,4) ;
	}
	
	/*
	 * (non-Javadoc)
	 * @see fr.istic.java.dimitri.controller.IController#stop()
	 */
	public void stop(){
		engine.stop() ;
	}
	
	/*
	 * (non-Javadoc)
	 * @see fr.istic.java.dimitri.controller.IController#dec()
	 */
	public void dec(){
		engine.dec();
	}
	
	/*
	 * (non-Javadoc)
	 * @see fr.istic.java.dimitri.controller.IController#inc()
	 */
	public void inc(){
		engine.inc();
	}
	
	/*
	 * (non-Javadoc)
	 * @see fr.istic.java.dimitri.controller.IController#handleBeatEvent()
	 */
	public void handleBeatEvent()
	{
		bpm = engine.getBPM() ;
		System.out.println("battement");
		Materiel.getEmetteurSonore().emettreClic();
		//IHM.flashBeat();
		//Materiel.getAfficheur().allumerLED(1);
		VueMetronome.getiDisplay().flashBeat();
		//IHM.barCircle.setFill(Color.ANTIQUEWHITE);
		//IHM.barCircle.fillProperty().set(Color.GREEN);
	}
	
	/* (non-Javadoc)
	 * @see fr.istic.java.dimitri.controller.IController#handleBarEvent()
	 */
	public void handleBarEvent()
	{
		beatsPerBar = engine.getBeatsPerBar() ;
		System.out.println("mesure");
		Materiel.getEmetteurSonore().emettreClic();
		//IHM.flashBar();
		//Materiel.getAfficheur().allumerLED(2);
		//Materiel.getAfficheur().allumerLED(2);
		//IHM.barCircle.setFill(Color.ALICEBLUE);
		VueMetronome.getiDisplay().flashBar();
	}

	/*
	 * (non-Javadoc)
	 * @see fr.istic.java.dimitri.controller.IController#handleBpmChanged()
	 */
	public void handleBpmChanged() 
	{
		//Materiel.getAfficheur().afficherTempo(engine.getBPM());
		//System.out.println("handleBpmChnaged"+engine.getBPM()+"") ;
		//IHM.display.setText(engine.getBPM()+"");
		//Materiel.getAfficheur().afficherTempo(engine.getBPM());
		VueMetronome.getiDisplay().setText(engine.getBPM()+"");
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see fr.istic.java.dimitri.controller.IController#handleSliderChanged()
	 */
	public void handleSliderChanged()
	{	
		System.out.println(220*IHM.getiSlider().getValue()/100);
		engine.setBPM((int) (20+(220*IHM.getiSlider().getValue()/100) ) );
	}
	
	/**
	 * @author dimitri
	 * Pour débuggage seulement
	 */
	private void setBpm(int nombre)
	{
		bpm = nombre ;
		//IHM.displayImpl.setText(nombre+"");
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	public void update(Observable arg0, Object arg1) {		
		if(arg0 instanceof MetronomeEngine)
		{	
			if(arg1 instanceof BpmChangedHandler)
			{		
				((BpmChangedHandler) arg1).setController(this);
				((BpmChangedHandler) arg1).execute(); 
			}
		
		}
	}
	
}

