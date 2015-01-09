package tp.metronome.View;


import java.net.URL;
import java.util.ResourceBundle;

import com.sun.media.jfxmedia.logging.Logger;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import fr.istic.java.dimitri.model.MetronomeEngine;
/**
 * Classe qui permet d'initialiser l'IHM et de lancer les commandes.
 * 
 *
 */
public class Controller  implements Initializable{

	fr.istic.java.dimitri.controller.Controller  controller  ;
	
	@FXML private Text tempoBPM;
	@FXML private Slider slider ;
	@FXML private Circle beatCircle ;
	@FXML private Circle barCircle ;
	
	@FXML private Button start ;
	@FXML private Button stop ;
	@FXML private Button inc ;
	@FXML private Button dec ;
    
    @FXML protected void start(ActionEvent event) {
    	
    	//controller = new fr.istic.java.dimitri.controller.Controller(new MetronomeEngine()) ;
    	//controller.start(); 
    	//IHM.setTouchePresse(0);
    	//monMetronome.setTempoBPM(Integer.parseInt(tempoBPM.getText()));
        //monMetronome.Start();
    }
    
    @FXML protected void stop(ActionEvent event) {
        //controller.stop();
    }
    
    @FXML protected void dec(ActionEvent event) {
    	//controller.dec() ;
    }
    
    @FXML protected void inc(ActionEvent event) {
    	//controller.inc() ; 
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//Metronome.ihm = new IHM() ;
		controller = new fr.istic.java.dimitri.controller.Controller(new MetronomeEngine()) ;
		
		DisplayFx disp = new DisplayFx() ;
		IHM.ihm.setiDisplay(disp);
		disp.setDisplay(tempoBPM) ;
		
		SliderFx slid = new SliderFx() ;
		IHM.ihm.setiSlider(slid); 
		slid.setSlider(slider) ;
		slider.valueProperty().addListener((observable, oldValue, newValue) -> {
			System.out.println("changement slider") ;
			IHM.ihm.changementSlider();
		 } ) ;
		
		disp.setBarCircle(barCircle) ;
		disp.setBeatCircle(beatCircle) ;
		Button[] tableauButton = {start,stop,inc,dec} ;
		for(int i=0;i<4;i++)
		{

			final int j = i ;
			tableauButton[i].setOnMousePressed(new EventHandler<Event>() {
				@Override
				public void handle(Event arg0) {
					IHM.ihm.setTouchePresse(j);
				}
			});
			
			tableauButton[i].setOnMouseReleased(new EventHandler<Event>() {
				@Override
				public void handle(Event arg0) {
					IHM.setToucheRelache(j);
				}
			});
		}
		
	}
	
}
