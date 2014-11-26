package View;


import fr.istic.java.main.model.IMetronomeEngine;
import fr.istic.java.main.model.MetronomeEngine;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {

	IMetronomeEngine monMetronome = new MetronomeEngine();
	
	@FXML private Text tempoBPM;
    
    @FXML protected void start(ActionEvent event) {
        monMetronome.setTempoBPM(Integer.parseInt(tempoBPM.getText()));
        monMetronome.Start();
        }
    
    @FXML protected void stop(ActionEvent event) {
        monMetronome.Stop();
        }
}
