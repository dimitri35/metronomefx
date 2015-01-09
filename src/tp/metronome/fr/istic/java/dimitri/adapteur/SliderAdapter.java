package fr.istic.java.dimitri.adapteur;

import tp.metronome.View.ISlider;
import fr.istic.java.dimitri.command.ICommand;
import fr.istic.java.main.materiel.Materiel;

public class SliderAdapter implements HandlerPoll, ISlider {

	private float positionAvant ;
	private ICommand commandeSlider ;
	
	/*
	 * (non-Javadoc)
	 * @see fr.istic.java.dimitri.adapteur.HandlerPoll#poll()
	 */
	public void poll(){
		float nouvellePosition = Materiel.getMolette().position() ;
		if(positionAvant!=Materiel.getMolette().position())
			lancerChangementSlider();
		
		positionAvant = nouvellePosition ;
	}
	
	
	private void lancerChangementSlider()
	{
		commandeSlider.execute();
	}
	
	public void setChangedSlider(ICommand commandeSlider) {
		
		this.commandeSlider = commandeSlider ;
		PollCommande cmd = new PollCommande() ;
		cmd.setHandler(this);
		Materiel.getHorloge().activerPériodiquement(cmd,1) ;
	}
	
	/*
	 * (non-Javadoc)
	 * @see tp.metronome.View.ISlider#getValue()
	 */
	public double getValue() {
		return positionAvant ;
	}

	/*
	 * (non-Javadoc)
	 * @see tp.metronome.View.ISlider#getSliderCommand()
	 */
	@Override
	public ICommand getSliderCommand() {
		return commandeSlider;
	}
	
}
