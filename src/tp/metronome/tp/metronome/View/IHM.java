package tp.metronome.View;

import java.util.Observable;

import fr.istic.java.dimitri.command.ICommand;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.control.Slider;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.util.Duration;

public  class IHM  {

	//public static Text display ;
	//public static Slider slider ;	
	//public static Circle beatCircle ;
	//public static Circle barCircle ;
	
	public   ISlider iSlider  ;
	
	public   IDisplay iDisplay  ;
	
	public   IButton boutons  ;
	
	public  static IHM ihm = new IHM() ;
	
	
	//private static ICommand commandeSlider ;
	
	private static boolean touchePresseTab[] = new boolean[4];
	
	/*
	public static void setChangedSlider(ICommand commande) 
	{
		commandeSlider = commande ;
	}
	*/
	
	public  void changementSlider() 
	{
		if(iSlider.getSliderCommand() != null)
			iSlider.getSliderCommand().execute(); //commandeSlider.execute();
	}
	
	/*
	public static void flashBeat(){
		flash(beatCircle);
	}
	
	public static void flashBar(){
		flash(barCircle);
	}
	
	private static void flash(Circle beatCircle){
		Timeline timeline = new Timeline(new KeyFrame(Duration.millis(200), ev -> {
			beatCircle.setFill(Color.PURPLE);
		})) ;
		timeline.getKeyFrames().add(new KeyFrame(Duration.millis(50), ev -> {
			beatCircle.setFill(Color.DODGERBLUE);
		}));
		timeline.setCycleCount(1);
		timeline.play();
		
	}
	
	public static void allumerLED(int numLED){
		System.out.println("allumer LED "+numLED) ;
		if(numLED==1)
			beatCircle.setFill(Color.PURPLE);
		else if(numLED==2)
			barCircle.setFill(Color.PURPLE);
	}
	
	public static void éteindreLED(int numLED){
		System.out.println("éteindre LED "+numLED) ;
		if(numLED==1)
			beatCircle.setFill(Color.DODGERBLUE);
		else if(numLED==2)
			barCircle.setFill(Color.DODGERBLUE);
	}
	*/
	public boolean[] getTouchePresse()
	{
		return touchePresseTab ;
	}
	
	public void  setTouchePresse(int num) {
		touchePresseTab[num] = true ;
		getBouton().setNumPresse(num);
	}
	
	public static void setToucheRelache(int num) {
		touchePresseTab[num] = false ;
	}

	/**
	 * @return le iSlider
	 */
	public  ISlider getiSlider() {
		return iSlider;
	}
	
	/**
	 * @param iSlider le iSlider à mettre 
	 */
	public  void setiSlider(ISlider iSlider) {
		this.iSlider = iSlider;
	}

	/**
	 * @param iDisplay le iDisplay à mettre 
	 */
	public   void setiDisplay(IDisplay iDisplay) {
		this.iDisplay = iDisplay;
	}

	/**
	 * @return le iDisplay
	 */
	public  IDisplay getiDisplay() {
		return iDisplay;
	}

	/**
	 * @return le bouton
	 */
	public  IButton getBouton() {
		return boutons;
	}

	/**
	 * @param boutons le bouton à mettre
	 */
	public  void setBouton(IButton boutons) {
		this.boutons = boutons;
	}
	
}
