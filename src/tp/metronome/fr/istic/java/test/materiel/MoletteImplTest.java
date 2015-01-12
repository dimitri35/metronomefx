package fr.istic.java.test.materiel;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import tp.metronome.View.IHM;
import tp.metronome.View.ISlider;
import fr.istic.java.version.command.ICommand;
import fr.istic.java.version.materiel.MoletteImpl;

public class MoletteImplTest {

	private static MoletteImpl molette = new MoletteImpl() ;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		molette = new MoletteImpl() ;
		IHM.ihm = new IHM() ;
		IHM.ihm.setiSlider(new ISlider() {
			
			@Override
			public void setChangedSlider(ICommand commande) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public double getValue() {
				return 20;
			}
			
			@Override
			public ICommand getSliderCommand() {
				// TODO Auto-generated method stub
				return null;
			}
		});
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
	public void test0() {
		System.out.println(molette.position()) ;
		assertTrue(molette.position()==20.0f);
	}

}
