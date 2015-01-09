package fr.istic.java.dimitri.adapteur;

import tp.metronome.View.IDisplay;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.paint.Color;
import javafx.util.Duration;
import fr.istic.java.main.materiel.Materiel;

public class DisplayAdapter implements IDisplay{

	/*
	 * (non-Javadoc)
	 * @see tp.metronome.View.IDisplay#setText(java.lang.String)
	 */
	public void setText(String texte) {
		Materiel.getAfficheur().afficherTempo(Integer.parseInt(texte));
	}
	
	private void flash(int numLed) {
		Timeline timeline = new Timeline(new KeyFrame(Duration.millis(10), ev -> {
				allumerLED(numLed);
		})) ;
		timeline.getKeyFrames().add(new KeyFrame(Duration.millis(200), ev -> {
				éteindreLED(numLed);
		}));
		timeline.setCycleCount(1);
		timeline.play();
	}
	
	/*
	 * (non-Javadoc)
	 * @see tp.metronome.View.IDisplay#flashBeat()
	 */
	public void flashBeat(){
		flash(1) ;	
	}
	
	/*
	 * (non-Javadoc)
	 * @see tp.metronome.View.IDisplay#flashBar()
	 */
	public void flashBar() {
		flash(2) ;
	}

	/*
	 * (non-Javadoc)
	 * @see tp.metronome.View.IDisplay#allumerLED(int)
	 */
	@Override
	public void allumerLED(int numLED) {
		Materiel.getAfficheur().allumerLED(numLED);
	}

	/*
	 * (non-Javadoc)
	 * @see tp.metronome.View.IDisplay#éteindreLED(int)
	 */
	@Override
	public void éteindreLED(int numLED) {
		Materiel.getAfficheur().éteindreLED(numLED);
	}
	
}
