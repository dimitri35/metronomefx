package fr.istic.java.main.model;

import fr.istic.java.main.materiel.Horloge;
import fr.istic.java.main.materiel.HorlogeImp;
import fr.istic.java.main.materiel.Son;

public class MetronomeEngine implements IMetronomeEngine{
	
	private int tempoBPM = 1000;
	private int tempsParMesure = 4;
	private boolean on = false;
	
	private Commande bipCommande;
	private Commande bipCommandeDesactive;
	
	private Horloge horloge;
	
	private Son bip;
	
	public MetronomeEngine() {
		bip = new Son("/ressources/beep-08b.wav", "/ressources/cell-phone-1-nr2.wav", 4);
		
	}
	
	public int getTempoBPM() {
		return tempoBPM;
	}
	
	public void setTempoBPM(int tempoBPM) {
		this.tempoBPM = tempoBPM;
	}
	
	public int getTempsParMesure() {
		return tempsParMesure;
	}
	
	public void setTempsParMesure(int tempsParMesure) {
		this.tempsParMesure = tempsParMesure;
	}
	
	public void Start(){
		if (!isOn()){
			setOn(true);
			horloge = new HorlogeImp();
			bipCommande = new BipEvenement(bip);
			horloge.activerPériodiquement(bipCommande, tempoBPM);
		}
		
	}
	
	public void Stop(){
		if (isOn()){
			setOn(false);
			bipCommandeDesactive = new BipEvenementStop(horloge);
			horloge.désactiver(bipCommandeDesactive);
			System.err.println("STOP");
			System.err.println(isOn());
		}
	}
	
	public void inc(){
		if(this.tempsParMesure < 7)
		this.tempsParMesure++;
	}
	
	public void dec(){
		if(this.tempsParMesure > 2)
		this.tempsParMesure--;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	
}
