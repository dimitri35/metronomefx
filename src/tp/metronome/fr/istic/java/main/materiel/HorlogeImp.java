package fr.istic.java.main.materiel;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import fr.istic.java.dimitri.command.ICommand;
import fr.istic.java.main.model.Commande;

public class HorlogeImp implements Horloge{
	
	
	Timer timer = new Timer();
	TimerTask task;

	public void activerPériodiquement(final ICommand cmd, long périodeEnSecondes){
		task = new TimerTask()
		{
			@Override
			public void run() 
			{
				cmd.execute();
			}	
		};
		
		timer.schedule(task, 0, périodeEnSecondes);
		//timer.scheduleAtFixedRate(task, 0, périodeEnSecondes);
	}
	/*public void activerAprèsDélai(final Commande cmd, long délaiEnSecondes, long périodeEnSecondes){
		TimerTask task = new TimerTask()
		{
			@Override
			public void run() 
			{
				cmd.Execute();
			}	
		};
		
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(task, délaiEnSecondes, périodeEnSecondes);
	}*/
	public void désactiver(ICommand cmd){
		//timer.cancel() ;
		//timer.purge() ;
	}
	
	public Timer getTimer(){
		return timer;
	}
	
	public TimerTask getTimerTask(){
		return task;
	}
	
}
