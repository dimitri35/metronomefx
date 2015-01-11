package tp.metronome.View;

import fr.istic.java.version.command.ICommand;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.util.Duration;

/**
 * Classe qui permet de gérer l'affichage Java FX du métronome
 * @author dimitri
 *
 */
public class DisplayFx implements IDisplay{

	

	private  Text display ;
	private  Circle beatCircle ;
	private  Circle barCircle ;
	
	/*
	 * (non-Javadoc)
	 * @see tp.metronome.View.IDisplay#allumerLED(int)
	 */
	public  void allumerLED(int numLED){
		System.out.println("allumer LED "+numLED) ;
		if(numLED==1)
			beatCircle.setFill(Color.PURPLE);
		else if(numLED==2)
			barCircle.setFill(Color.PURPLE);
	}
	
	/*
	 * (non-Javadoc)
	 * @see tp.metronome.View.IDisplay#éteindreLED(int)
	 */
	public  void éteindreLED(int numLED){
		System.out.println("éteindre LED "+numLED) ;
		if(numLED==1)
			beatCircle.setFill(Color.DODGERBLUE);
		else if(numLED==2)
			barCircle.setFill(Color.DODGERBLUE);
	}
	
	/*
	 * (non-Javadoc)
	 * @see tp.metronome.View.IDisplay#flashBeat()
	 */
	@Override
	public  void flashBeat(){
		flash(beatCircle);
	}
	
	/*
	 * (non-Javadoc)
	 * @see tp.metronome.View.IDisplay#flashBar()
	 */
	@Override
	public  void flashBar(){
		flash(barCircle);
	}
	
	/**
	 * 
	 * @param beatCircle
	 */
	private void flash(Circle beatCircle){
		Timeline timeline = new Timeline(new KeyFrame(Duration.millis(200), ev -> {
			beatCircle.setFill(Color.PURPLE);
		})) ;
		timeline.getKeyFrames().add(new KeyFrame(Duration.millis(50), ev -> {
			beatCircle.setFill(Color.DODGERBLUE);
		}));
		timeline.setCycleCount(1);
		timeline.play();
		
	}

	/**
	 * @return Le iDisplay
	 */
	public Text getDisplay() {
		return display;
	}

	/**
	 * @param Le iDisplay à mettre
	 */
	public void setDisplay(Text display) {
		this.display = display;
	}

	/**
	 * @return Le beatCircle
	 */
	public Circle getBeatCircle() {
		return beatCircle;
	}

	/**
	 * @param Le beatCircle à mettre 
	 */
	public void setBeatCircle(Circle beatCircle) {
		this.beatCircle = beatCircle;
	}

	/**
	 * @return Le barCircle
	 */
	public Circle getBarCircle() {
		return barCircle;
	}

	/**
	 * @param barCircle le barCircle à mettre
	 */
	public void setBarCircle(Circle barCircle) {
		this.barCircle = barCircle;
	}

	@Override
	public void setText(String text) {
		display.setText(text);
		
	}

	
}

	
