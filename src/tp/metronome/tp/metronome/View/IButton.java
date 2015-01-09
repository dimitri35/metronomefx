package tp.metronome.View;

import fr.istic.java.dimitri.command.ICommand;

public interface IButton {
	/**
	 * Permet d'ajouter une commande qui sera éxécuté lors d'un évènement clic.
	 * @param commande La commande à éxécuter lors d'un évènement de type clic.
	 */
	public void setCommande(ICommand commande) ;
	/**
	 * Permet de récupérer le numéro de la dernière touche qui a été enfoncé.
	 * @param numPresse Le numéro de la dernière touche qui a été enfoncé.
	 */
	public void setNumPresse(int numPresse) ;
	
	public int getNumPresse() ;
}
