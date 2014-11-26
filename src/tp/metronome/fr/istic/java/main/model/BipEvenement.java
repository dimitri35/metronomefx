package fr.istic.java.main.model;

import fr.istic.java.main.materiel.Son;



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
