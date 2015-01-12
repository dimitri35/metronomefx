package fr.istic.java.test.materiel;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import tp.metronome.View.IButton;
import tp.metronome.View.IHM;
import fr.istic.java.version.command.ICommand;
import fr.istic.java.version.materiel.ClavierImpl;

public class ClavierImplTest {

	private static ClavierImpl clavier ;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		clavier = new ClavierImpl() ;
		IHM.ihm = new IHM() ;
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		IHM.ihm.setTouchePresse(1);
		assertTrue(clavier.touchePresse(1) ); 
	}
	
	@Test
	public void test2() {
		IHM.ihm.setTouchePresse(2);
		assertTrue(clavier.touchePresse(2) ); 
	}
	
	@Test
	public void test3() {
		IHM.ihm.setTouchePresse(3);
		assertTrue(clavier.touchePresse(3) ); 
	}

}
