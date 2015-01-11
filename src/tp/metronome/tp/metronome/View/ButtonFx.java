package tp.metronome.View;

import fr.istic.java.version.command.ICommand;
/**
 * Classe qui permet gérer un bouton Java FX 
 * @author dimitri
 *
 */
public class ButtonFx implements IButton {
	
	private ICommand commande ;
	
	private int num ;
	/*
	 * (non-Javadoc)
	 * @see tp.metronome.View.IButton#setCommande(fr.istic.java.dimitri.command.ICommand)
	 */
	public void setCommande(ICommand commande){
		this.commande = commande ;
	}
	/*
	 * (non-Javadoc)
	 * @see tp.metronome.View.IButton#setNumPresse(int)
	 */
	@Override
	public void setNumPresse(int numPresse) {
		num = numPresse ;
		if(commande!=null)
			commande.execute();
	}
	
	@Override
	public int getNumPresse() {
			return num ;
	}
	
}
