package fr.istic.java.dimitri.main;

import fr.istic.java.dimitri.controller.Controller;
import fr.istic.java.dimitri.model.MetronomeEngine;

/**
 * @author dimitri
 *
 */
public class Main {

	public static void main(String[] args) {
		Controller controller = new Controller(new MetronomeEngine()) ;
	}
	
}
