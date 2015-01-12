package fr.istic.java.version.controller;

import java.util.Observer;

import fr.istic.java.version.command.HandlerBeat;
import fr.istic.java.version.command.HandlerButton;



/**
 * Interface permettant d'avoir un contrôleur pour le métronome.
 */
public  interface IController extends Observer, HandlerBeat, HandlerButton
{
	
	/*
	 * Permet d'arrêter le métronome engine
	 */
	//public void stop() ;
	/*
	 * Permet diminuer le nombre de battements par mesure
	 */
	//public void dec() ;
	/*
	 * Permet d'augmenter le nombre de  battements par mesure
	 */
	//public void inc() ;
	/*
	 * Permet d'éxécuter un battement
	 */
	//public void handleBeatEvent() ;
	/*
	 * Permet d'éxécuter une mesure
	 */
	//public void handleBarEvent() ;
	/*
	 * Permet de notifier la mise à jour du battement à la vue
	 */
	//public void handleBpmChanged() ;
	/*
	 * Permet de notifier le métronome engine que le slider a été modifié
	 */
	public void handleSliderChanged() ;
	
}

