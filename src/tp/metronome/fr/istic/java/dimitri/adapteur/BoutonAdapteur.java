package fr.istic.java.dimitri.adapteur;

import tp.metronome.View.IButton;
import fr.istic.java.dimitri.command.ICommand;
import fr.istic.java.main.materiel.Materiel;

public class BoutonAdapteur implements HandlerPoll, IButton {

	private boolean[] touchePresseAvant = new boolean[4];
	private ICommand commande ;
	private int numPresse ;

	/*
	 * (non-Javadoc)
	 * @see fr.istic.java.dimitri.adapteur.HandlerPoll#poll()
	 */
	public void poll() {
		for(int i=1;i<5;i++)
		{
			
			boolean nouvelleValeur = Materiel.getClavier().touchePresse(i) ;
			if(touchePresseAvant[i-1] != nouvelleValeur && touchePresseAvant[i-1] )
			{
				click(i);
			}
			touchePresseAvant[i-1] = nouvelleValeur ;
		}
	}
	

	private void click(int num)
	{
		System.out.println("click"+num) ;
		numPresse = num ;
		commande.execute();
	}
	
	public int getNumPresse() {
		return numPresse;
	}

	public void setNumPresse(int numPresse) {
		this.numPresse = numPresse;
	}

	public ICommand getCommande() {
		return commande;
	}

	/**
	 * 
	 */
	private void demarrerPoll(){
		PollCommande commandePoll = new PollCommande() ;
		commandePoll.setHandler(this);
		Materiel.getHorloge().activerPériodiquement(commandePoll, 1);
	}
	
	public void setCommande(ICommand commande) {
		demarrerPoll();
		this.commande = commande;
	}
	
}
