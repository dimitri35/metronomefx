//package tp.metronome;
//
//import tp.metronome.model.BipEvenement;
//import tp.metronome.model.Commande;
//import tp.metronome.model.Horloge;
//import tp.metronome.model.HorlogeImp;
//import tp.metronome.model.IMetronomeEngine;
//import tp.metronome.model.MetronomeEngine;
//import tp.metronome.model.son;
//
//
//public class testHorloge {
//
//	public static void main(String[] args) {
//		
//		
//		
//		
//		final son bip1 = new son("/home/sdr/Documents/AOC/TPs/MetronomeFX/src/ressources/beep-08b.wav", "/home/sdr/Documents/AOC/TPs/MetronomeFX/src/ressources/cell-phone-1-nr2.wav", 4);
//	
//		//bip1.jouer();
//		
//		Horloge horloge = new HorlogeImp();
//		Commande bip1Commande = new BipEvenement(bip1);
//		
//		//horloge.activerPériodiquement(bip1Commande, 1000);
//		
//		
//		
//		IMetronomeEngine monMetronome = new MetronomeEngine();
//		monMetronome.Start();
//		
//		monMetronome.Stop();
//		
//		
//	}
//
//}
