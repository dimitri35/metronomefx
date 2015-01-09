package tp.metronome.View;

import javafx.scene.control.Slider;
import fr.istic.java.dimitri.command.ICommand;

public class SliderFx implements ISlider {

	private Slider slider ;
	private static ICommand commandeSlider ;
	
	@Override
	public void setChangedSlider(ICommand commande) {
		commandeSlider = commande ;
	}
	
	public Slider getSlider() {
		return slider;
	}
	public void setSlider(Slider slider) {
		this.slider = slider;
	}

	@Override
	public ICommand getSliderCommand() {
		return commandeSlider ;
		
	}
	
	public double getValue(){
		return slider.getValue() ;
	}
	
	
	
}
