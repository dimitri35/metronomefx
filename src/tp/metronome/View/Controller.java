package tp.metronome.View;


import tp.metronome.Metronome;
import tp.metronome.model.IMetronomeEngine;
import tp.metronome.model.MetronomeEngine;
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
