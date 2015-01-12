package fr.istic.java.test.materiel;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import tp.metronome.View.IButton;
import tp.metronome.View.IDisplay;
import tp.metronome.View.IHM;
import tp.metronome.View.ISlider;
import tp.metronome.View.VueMetronome;
import fr.istic.java.version.materiel.AfficheurImpl;

public class AfficheurImplTest {

	private static AfficheurImpl afficheur ;
	private static String texte ;
	private static boolean led1 = false, led2 = false ;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		afficheur = new AfficheurImpl() ;
		IHM.ihm = new IHM() ;
		IHM.ihm.setiDisplay(new IDisplay() {
			
			@Override
			public void éteindreLED(int numLED) {
				if(numLED==1)
				{
					led1 = false ;
				}
				else if(numLED==2){
					led2 = false ;
				}
			}
			
			@Override
			public void setText(String text) {
				texte = text ;
			}
			
			@Override
			public void flashBeat() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void flashBar() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void allumerLED(int numLED) {
				if(numLED==1)
				{
					led1 = true ;
				}
				else if(numLED==2){
					led2 = true ;
				}
			}
		});
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		led1 = false ;
		led2 = false ;
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAfficheurTempo() {
		afficheur.afficherTempo(130);
		assertEquals(texte, "130");
	}
	
	@Test
	public void testAllume() {
		afficheur.allumerLED(1);
		assertTrue(led1) ;
	}
	
	@Test
	public void testAllume1() {
		afficheur.allumerLED(2);
		assertTrue(led2) ;
	}
	
	@Test
	public void testEteindre() {
		afficheur.allumerLED(0);
		afficheur.éteindreLED(0) ;
		assertFalse(led1) ;
	}

}
