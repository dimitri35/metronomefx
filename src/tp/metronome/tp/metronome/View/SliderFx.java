package tp.metronome.View;

import javafx.scene.control.Slider;
import fr.istic.java.version.command.ICommand;

/**
 * Classe qui permet de gérer la molette Java FX.
 *
 */
public class SliderFx implements ISlider {

	private Slider slider ;
	private static ICommand commandeSlider ;
	
	/*
	 * (non-Javadoc)
	 * @see tp.metronome.View.ISlider#setChangedSlider(fr.istic.java.version.command.ICommand)
	 */
	@Override
	public void setChangedSlider(ICommand commande) {
		commandeSlider = commande ;
	}
	
	/**
	 * Permet de retourner un slider Java FX
	 * @return Un Slider Java FX
	 */
	public Slider getSlider() {
		return slider;
	}
	
	/**
	 * Permet d'ajouter un Slider Java FX
	 * @param slider Un Slider Java FX
	 */
	public void setSlider(Slider slider) {
		this.slider = slider;
	}

	/**
	 * Permet de retourner une commande qui sera éxécuté lors de changement de position du Slider Java FX.
	 * @return une commande qui sera éxécuté lors de changement de position du Slider Java FX.
	 */
	@Override
	public ICommand getSliderCommand() {
		return commandeSlider ;
		
	}
	
	/**
	 * Permet d'obtenir la valeur du Slider Java FX.
	 */
	public double getValue(){
		return slider.getValue() ;
	}
	
	
	
}
