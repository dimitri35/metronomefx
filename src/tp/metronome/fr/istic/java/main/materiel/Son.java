package fr.istic.java.main.materiel;

import java.applet.*;
import java.io.File;
import java.net.URL;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

public class Son {
	
	private URL u1;
	private AudioClip clip1; 
	
	private URL u2;
	private AudioClip clip2; 
	
	private int k = 0;
	
	private int tempsParMesure;

    public Son(String fichierAudio1, String fichierAudio2, int tempsParMesure) {
    	
    	
    	u1 = Son.class.getResource(fichierAudio1);
    	clip1 = Applet.newAudioClip(u1);
    	
    	u2 = Son.class.getResource(fichierAudio2);
    	clip2 = Applet.newAudioClip(u2);
    	
    	this.tempsParMesure = tempsParMesure;
   	 }
 
	public void jouer()
	{   
		k = ( k+1 )% 4 ;
		if (k == 1){
			
		//	System.err.println(this.tempsParMesure);
		try { System.err.println("bip1");
			clip1.play();
			//clip1.stop(); 
			//clip1.setFramePosition(0);
			} 
		catch (Exception e) {System.err.println("catch1");}
		}else
			{try { 
				System.err.println("bip2");
				clip2.play();
				//clip2.stop(); 
				//clip2.setFramePosition(0);
				} 
			catch (Exception e) {System.err.println("catch2");}
			}
			
	}
	
}
