package fr.istic.java.dimitri.controller;

import java.util.Observable;
import java.util.Observer;

import javafx.beans.binding.SetBinding;
import javafx.scene.paint.Color;

import org.xml.sax.HandlerBase;

import sun.swing.plaf.synth.Paint9Painter;
import tp.metronome.View.IHM;
import fr.istic.java.dimitri.command.BarCommand;
import fr.istic.java.dimitri.command.BeatCommand;
import fr.istic.java.dimitri.command.BpmChangedHandler;
import fr.istic.java.dimitri.command.CommandSlider;
import fr.istic.java.dimitri.command.ICommand;
import fr.istic.java.dimitri.model.IMetronomeEngine;
import fr.istic.java.dimitri.model.MetronomeEngine;
import fr.istic.java.main.materiel.Afficheur;
import fr.istic.java.main.materiel.Materiel;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Controller  implements IControl, Observer
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private int bpm ;
	private int beatsPerBar ;
	
	private IMetronomeEngine engine ;
	

	
	public Afficheur iLED;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Controller(){
		
		engine = new MetronomeEngine() ;
				
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
		IHM.setChangedSlider(new CommandSlider(this)) ;
		engine.start(60,4) ;
	}
	
	public void stop(){
		engine.stop() ;
	}
	
	public void dec(){
		engine.dec();
	}
	
	public void inc(){
		engine.inc();
	}
	
	public void handleBeatEvent()
	{
		bpm = engine.getBPM() ;
		System.out.println("battement");
		Materiel.getEmetteurSonore().emettreClic();
		IHM.barCircle.fillProperty().set(Color.GREEN);
	}
	
	public void handleBarEvent()
	{
		beatsPerBar = engine.getBeatsPerBar() ;
		System.out.println("mesure");
		Materiel.getAfficheur().allumerLED(2);
		IHM.barCircle.fillProperty().set(Color.RED);
	}

	public void handleBpmChanged() 
	{
		//Materiel.getAfficheur().afficherTempo(engine.getBPM());
		System.out.println("handleBpmChnaged"+engine.getBPM()+"") ;
		IHM.display.setText(engine.getBPM()+"");
		
	}
	
	public void handleSliderChanged()
	{	
		System.out.println(220*IHM.slider.getValue()/100);
		engine.setBPM((int) (20+(220*IHM.slider.getValue()/100) ) );
	}
	
	/**
	 * @author dimitri
	 * Pour débuggage seulement
	 */
	public void setBpm(int nombre)
	{
		bpm = nombre ;
		//IHM.displayImpl.setText(nombre+"");
	}
	
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

