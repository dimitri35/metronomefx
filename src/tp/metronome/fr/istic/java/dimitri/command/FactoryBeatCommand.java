package fr.istic.java.dimitri.command;
import java.awt.List;
import java.util.HashMap;

import fr.istic.java.dimitri.controller.*;
import fr.istic.java.dimitri.model.IMetronomeEngine;


public class FactoryBeatCommand {

	public  static int nb = 0 ;
	private static ICommand beatEvent ;
	private static ICommand barEvent ;
	
	public static ICommand getBeatCommand( IMetronomeEngine engine){
		nb++ ;
		if(engine.getBeatsPerBar()!=0)
		{
			if(nb%engine.getBeatsPerBar()==0)
			{
				return barEvent ;
			}
			else
			{
				return beatEvent ;
			}
			
		}
		else
		{
			return beatEvent ;
		}
	}

	public static void setBeatEvent(ICommand beatEvent) {
		FactoryBeatCommand.beatEvent = beatEvent;
	}

	public static void setBarEvent(ICommand barEvent) {
		FactoryBeatCommand.barEvent = barEvent;
	}
	
	
}
