package fr.istic.java.testDimitri.controller;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import tp.metronome.View.IButton;
import tp.metronome.View.IDisplay;
import tp.metronome.View.ISlider;
import tp.metronome.View.VueMetronome;
import fr.istic.java.version.command.ICommand;
import fr.istic.java.version.controller.Controller;
import fr.istic.java.version.materiel.Materiel;
import fr.istic.java.version.model.MetronomeEngine;

public class ControllerTest {

	private static Controller control, control2 ;
	private static MetronomeEngine moteur, moteur2 ;
	private static VueMetronome vue ;
	private static String texte ;
	
	private static boolean beat = true ;
	private static boolean bar  = false ;
	
	private static double valeurMolette = 50 ;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		moteur = new MetronomeEngine() ;
		moteur2 = new MetronomeEngine() ;
		vue = new VueMetronome() {
			
			@Override
			public ISlider getiSlider() {
				// TODO Auto-generated method stub
				return new ISlider() {
					
					@Override
					public void setChangedSlider(ICommand commande) {
						// TODO Auto-generated method stub	
					}
					
					@Override
					public double getValue() {
						return valeurMolette;
					}
					
					@Override
					public ICommand getSliderCommand() {
						// TODO Auto-generated method stub
						return null;
					}
				};
			}
			
			@Override
			public IDisplay getiDisplay() {
				// TODO Auto-generated method stub
				return new IDisplay() {
					
					@Override
					public void éteindreLED(int numLED) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void setText(String text) {
						texte = text ;
					}
					
					@Override
					public void flashBeat() {
						beat = true ;
					}
					
					@Override
					public void flashBar() {
						beat = true ;
						bar = true ;
					}
					
					@Override
					public void allumerLED(int numLED) {
						// TODO Auto-generated method stub
						
					}
				};
			}
			
			@Override
			public IButton getBouton() {
				// TODO Auto-generated method stub
				return new IButton() {
					
					@Override
					public void setNumPresse(int numPresse) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void setCommande(ICommand commande) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public int getNumPresse() {
						// TODO Auto-generated method stub
						return 0;
					}
				};
			}
		} ;
		control = new Controller(moteur, vue ) ;
		control2 = new Controller(moteur2, vue) ;
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		control.start();
		bar = false ;
		beat = false ;
	}

	@After
	public void tearDown() throws Exception {
	}

	/*
	@Test
	public void start0() {
		int nombre = 150 ;
		MetronomeEngine metronome = new MetronomeEngine() ;
		Controller controller = new Controller(metronome);
		controller.start() ;
		assertEquals(metronome.getBeatsPerBar(),nombre) ;
	}
	*/
	
	@Test
	public void start() {
		control2.start(); 
		assertTrue(moteur.isOn());
	}
	
	/*
	@Test
	public void stop() {
		control.stop();
		assertFalse(moteur.isOn());
	}
	*/
	
	@Test
	public void inc0() {		
		control.inc();
		assertEquals(moteur.getBeatsPerBar(),5);
	}
	
	@Test
	public void dec0() {
		control.dec();
		assertEquals(moteur.getBeatsPerBar(), 3);
	}
	
	@Test
	public void handleSliderChanged(){
		control.handleSliderChanged();
		assertEquals(moteur.getBPM(), 130);
	}
	
	@Test
	public void testBpmChanged(){
		moteur.setBPM(130);
		assertEquals(texte,"130");
	}
	
	@Test
	public void testHandleBar(){
		control.handleBarEvent();
		assertTrue(bar);
		assertTrue(beat) ;
	}
	
	@Test
	public void testHandleBeat(){
		control.handleBeatEvent();
		assertTrue(beat);
	}



}
