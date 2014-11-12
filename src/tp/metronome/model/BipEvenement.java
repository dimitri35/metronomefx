package tp.metronome.model;



public class BipEvenement implements Commande{
	
	Son monSon;
	
	public BipEvenement(Son bip){
		monSon = bip;
	}
	
	public void Execute() {
		
		monSon.jouer();
		
		//Toolkit.getDefaultToolkit().beep();
	}

}
