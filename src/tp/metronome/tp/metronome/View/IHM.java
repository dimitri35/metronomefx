package tp.metronome.View;

import fr.istic.java.dimitri.command.ICommand;
import javafx.scene.control.Slider;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

public class IHM {

	public static Text display ;
	public static Slider slider ;	
	public static Circle beatCircle ;
	public static Circle barCircle ;
	
	private static ICommand commandeSlider ;
	
	public static void setChangedSlider(ICommand commande) 
	{
		commandeSlider = commande ;
	}
	
	public static void changementSlider() 
	{
		commandeSlider.execute();
	}
	
}
