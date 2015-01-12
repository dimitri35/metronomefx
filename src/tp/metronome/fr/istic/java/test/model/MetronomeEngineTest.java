package fr.istic.java.test.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



import fr.istic.java.version.model.MetronomeEngine;

public class MetronomeEngineTest {

	private static MetronomeEngine moteur, moteur2;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		moteur = new MetronomeEngine() ;
		moteur.start(60, 4);
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
	public void testDec() {
		moteur.setBeatsPerBar(4);
		moteur.dec(); 
		assertEquals(moteur.getBeatsPerBar(), 3);
	}
	
	@Test
	public void testDec2()
	{
		moteur.setBeatsPerBar(5);
		moteur.dec();
		moteur.dec();
		assertEquals(moteur.getBeatsPerBar(), 3);
	}
	
	@Test
	public void testInc()
	{
		moteur.setBeatsPerBar(4);
		moteur.inc();
		assertEquals(moteur.getBeatsPerBar(), 5);
	}
	
	@Test
	public void testStop()
	{
		moteur.setBeatsPerBar(4);
		moteur.stop();
		assertFalse(moteur.isOn());
	}
	
	@Test
	public void testStart()
	{
		moteur.start(60, 4);
		assertTrue(moteur.isOn() ) ;
	}
	
	@Test
	public void testDecMin()
	{
		moteur.setBeatsPerBar(2);
		moteur.dec();
		assertEquals(moteur.getBeatsPerBar(), 2);
	}
	
	@Test
	public void testIncMax()
	{
		moteur.setBeatsPerBar(7) ;
		moteur.inc();
		assertEquals(moteur.getBeatsPerBar(),7);
	}
	
	//@Test
	//public void testStop()
	//{
		//control.
		//moteur.stop();
		//assertEquals();
	//}
	

}
