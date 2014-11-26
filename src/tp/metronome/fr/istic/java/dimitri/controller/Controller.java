package fr.istic.java.dimitri.controller;

import java.util.Observable;

import javafx.beans.binding.SetBinding;

import org.xml.sax.HandlerBase;

import fr.istic.java.dimitri.command.BarCommand;
import fr.istic.java.dimitri.command.BeatCommand;
import fr.istic.java.dimitri.command.BpmChangedHandler;
import fr.istic.java.dimitri.model.IMetronomeEngine;
import fr.istic.java.dimitri.model.MetronomeEngine;
import fr.istic.java.main.materiel.Afficheur;
import fr.istic.java.main.materiel.Materiel;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Controller implements IControl
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
		engine.setBpmChangedHandler(bpmHandler);
		Observable engineObservable = (Observable) engine ;
		engineObservable.addObserver(this);
		//engineObservable.addObserver(o);
		
		engine.start(60,4) ;
	}
	
	
	public void handleBeatEvent()
	{
		bpm = engine.getBPM() ;
		System.out.println("battement");
		Materiel.getAfficheur().allumerLED(1);
		Materiel.getEmetteurSonore().emettreClic();
	}
	
	public void handleBarEvent()
	{
		beatsPerBar = engine.getBeatsPerBar() ;
		System.out.println("mesure");
		Materiel.getAfficheur().allumerLED(2);
	}

	public void handleBpmChanged() 
	{
		Materiel.getAfficheur().afficherTempo(engine.getBPM());
	}
	
	public void handleSliderChanged()
	{
		engine.setBPM(bpm);
	}
	
	/**
	 * @author dimitri
	 * Pour débuggage seulement
	 */
	public void setBpm(int nombre)
	{
		bpm = 150 ;
	}
	
	public void update(Observable arg0, Object arg1) {
		if(arg0 instanceof MetronomeEngine)
		{
			IMetronomeEngine metronome =(IMetronomeEngine) arg0 ;
			metronome.executeChange(this);
		}
	}
	
}

