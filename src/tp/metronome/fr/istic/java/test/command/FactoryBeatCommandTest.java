package fr.istic.java.test.command;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.istic.java.version.command.BarCommand;
import fr.istic.java.version.command.BeatCommand;
import fr.istic.java.version.command.FactoryBeatCommand;
import fr.istic.java.version.model.MetronomeEngine;

public class FactoryBeatCommandTest {

	private static FactoryBeatCommand factory ;
	private static BarCommand bar ;
	private static BeatCommand beat ;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		factory = new FactoryBeatCommand() ;
		bar = new BarCommand() ;
		beat = new BeatCommand() ;
		factory.setBarEvent(bar) ;
		factory.setBeatEvent(beat);
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
	public void testBeat() {
		MetronomeEngine engine = new MetronomeEngine() ;
		engine.start(60,4);
		assertSame(factory.getBeatCommand(engine) ,beat);
		factory.getBeatCommand(engine) ;
		factory.getBeatCommand(engine) ;
		assertSame(factory.getBeatCommand(engine),bar) ;
	}
	
	

}
