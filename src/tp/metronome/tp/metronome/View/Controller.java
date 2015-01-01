package tp.metronome.View;


import java.net.URL;
import java.util.ResourceBundle;

import fr.istic.java.dimitri.fxadaptater.DisplayImpl;
import fr.istic.java.main.model.IMetronomeEngine;
import fr.istic.java.main.model.MetronomeEngine;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

public class Controller implements Initializable {

	IMetronomeEngine monMetronome = new MetronomeEngine();
	fr.istic.java.dimitri.controller.Controller  controller ;
	
	@FXML private Text tempoBPM;
	@FXML private Slider slider ;
	@FXML private Circle beatCircle ;
	@FXML private Circle barCircle ;
    
    @FXML protected void start(ActionEvent event) {

    	controller = new fr.istic.java.dimitri.controller.Controller() ;
    	//monMetronome.setTempoBPM(Integer.parseInt(tempoBPM.getText()));
        //monMetronome.Start();
    }
    
    @FXML protected void stop(ActionEvent event) {
        controller.stop();
    }
    
    @FXML protected void dec(ActionEvent event) {
    	controller.dec() ;
    }
    
    @FXML protected void inc(ActionEvent event) {
    	controller.inc() ; 
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		IHM.display = tempoBPM ;
		IHM.slider =  slider ;
		slider.valueProperty().addListener((observable, oldValue, newValue) -> {
			IHM.changementSlider();
		 } ) ;
		IHM.barCircle = barCircle ;
		IHM.beatCircle = beatCircle ;
		
	}
	
}
