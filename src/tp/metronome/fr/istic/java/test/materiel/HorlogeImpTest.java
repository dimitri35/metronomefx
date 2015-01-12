package fr.istic.java.test.materiel;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import tp.metronome.View.Metronome;

import com.sun.media.jfxmediaimpl.platform.Platform;

import fr.istic.java.version.command.ICommand;
import fr.istic.java.version.materiel.HorlogeImp;

public class HorlogeImpTest {

	private static HorlogeImp  horloge ;
	private static boolean execute = false ;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		horloge = new HorlogeImp() ;
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
	public void testActivationPeriodique() {
		horloge.activerPériodiquement(new ICommand() {
			@Override
			public void execute() {
				execute = true ;
			}
		},1);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertTrue(execute);
	}

}
