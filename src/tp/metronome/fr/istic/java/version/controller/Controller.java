package fr.istic.java.version.controller;

import java.util.Observable;
import java.util.Observer;

import javafx.beans.binding.SetBinding;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

import org.xml.sax.HandlerBase;

import tp.metronome.View.IHM;
import tp.metronome.View.Metronome;
import tp.metronome.View.VueMetronome;
import fr.istic.java.version.command.BarCommand;
import fr.istic.java.version.command.BeatCommand;
import fr.istic.java.version.command.BpmChangedHandler;
import fr.istic.java.version.command.ClickCommand;
import fr.istic.java.version.command.CommandSlider;
import fr.istic.java.version.command.HandlerBeat;
import fr.istic.java.version.command.HandlerButton;
import fr.istic.java.version.command.ICommand;
import fr.istic.java.version.materiel.Afficheur;
import fr.istic.java.version.materiel.Materiel;
import fr.istic.java.version.model.IMetronomeEngine;
import fr.istic.java.version.model.MetronomeEngine;
import fr.istic.java.version2.adapteur.AdapteurMateriel;

/**
 * Classe de contrôleur pour le métronome.
 */
public class Controller  implements IController, Observer
{

	private int bpm ;
	private int beatsPerBar ;	
	private IMetronomeEngine engine ;
	public Afficheur iLED;
	
	private VueMetronome vue ;
	
	public Controller(IMetronomeEngine engine, VueMetronome vue){
		
		this.vue = vue ;
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
		//IHM.getiSlider().setChangedSlider(new CommandSlider(this)) ;
		
		vue.getiSlider().setChangedSlider(new CommandSlider(this));
		
		
		ClickCommand  commandeClick = new ClickCommand() ;
		commandeClick.setSource(vue.getBouton());
		commandeClick.setController(this);
		vue.getBouton().setCommande(commandeClick) ;
		
		//engine.start(60,4) ;
	}
	
	/*
	 * (non-Javadoc)
	 * @see fr.istic.java.dimitri.command.button.HandlerButton#start()
	 */
	@Override
	public void start() {
		System.out.println("start") ;
		engine.start(60,4) ;
	}
	
	/*
	 * (non-Javadoc)
	 * @see fr.istic.java.dimitri.controller.IController#stop()
	 */
	public void stop(){
		System.out.println("stop") ;
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
		//IHM.getiDisplay().flashBeat();
		//Materiel.getAfficheur().allumerLED(1);
		vue.getiDisplay().flashBeat();
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
		Materiel.getEmetteurSonore().emettreClicBar();
		//IHM.getiDisplay().flashBar();
		//Materiel.getAfficheur().allumerLED(2);
		//Materiel.getAfficheur().allumerLED(2);
		//IHM.barCircle.setFill(Color.ALICEBLUE);
		vue.getiDisplay().flashBar();
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
		vue.getiDisplay().setText(engine.getBPM()+"");
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see fr.istic.java.dimitri.controller.IController#handleSliderChanged()
	 */
	public void handleSliderChanged()
	{	
		System.out.println(220*vue.getiSlider().getValue()/100);
		engine.setBPM((int) (20+(220*vue.getiSlider().getValue()/100) ) );
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

