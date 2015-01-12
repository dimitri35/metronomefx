package fr.istic.java.test.command;

import static org.junit.Assert.*;

import java.util.Observable;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.istic.java.version.command.ClickCommand;
import fr.istic.java.version.command.HandlerButton;
import fr.istic.java.version.command.ICommand;
import fr.istic.java.version.controller.Controller;
import fr.istic.java.version.controller.IController;
import tp.metronome.View.IButton;

public class ClickCommandTest {

	private static IButton bouton ;
	private static HandlerButton controleur ;
	private static boolean stop = false ;
	private static boolean start = false ;
	private static boolean inc = false ;
	private static boolean dec = false ;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		controleur = new HandlerButton() {
			
			@Override
			public void stop() {
				stop = true ;
			}
			
			@Override
			public void start() {
				start = true ;
			}
			
			@Override
			public void inc() {
				inc = true ;
			}
			
			@Override
			public void dec() {
				dec = true ;
			}
		};
		
		bouton = new IButton() {
			
			int numPresse ;
			@Override
			public void setNumPresse(int numPresse) {
				this.numPresse = numPresse ;
			}
			
			@Override
			public void setCommande(ICommand commande) {
				
			}
			
			@Override
			public int getNumPresse() {
				return numPresse;
			}
		};
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		stop = false ;
		start = false ;
		inc = false ;
		dec = false ;
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testStart() {
		ClickCommand commande = new ClickCommand() ;
		bouton.setNumPresse(1);
		commande.setSource(bouton);
		commande.setController(controleur);
		commande.execute();
		assertTrue(start);
	}
	
	@Test
	public void testStop() {
		ClickCommand commande = new ClickCommand() ;
		bouton.setNumPresse(2);
		commande.setSource(bouton);
		commande.setController(controleur);
		commande.execute();
		assertTrue(stop);
	}
	
	@Test
	public void testInc() {
		ClickCommand commande = new ClickCommand() ;
		bouton.setNumPresse(3);
		commande.setSource(bouton);
		commande.setController(controleur);
		commande.execute();
		assertTrue(inc);
	}
	
	@Test
	public void testDec() {
		ClickCommand commande = new ClickCommand() ;
		bouton.setNumPresse(4);
		commande.setSource(bouton);
		commande.setController(controleur);
		commande.execute();
		assertTrue(dec);
	}
	
	@Test
	public void testNonStart() {
		ClickCommand commande = new ClickCommand() ;
		bouton.setNumPresse(4);
		commande.setSource(bouton);
		commande.setController(controleur);
		commande.execute();
		assertFalse(start);
	}
	
	

}
