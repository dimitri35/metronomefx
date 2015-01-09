package fr.istic.java.main.materiel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

import javafx.application.Platform;
import fr.istic.java.dimitri.command.ICommand;
import fr.istic.java.main.model.Commande;
/**
 * 
 * @author dounia dimitri
 *
 */

public class HorlogeImp implements Horloge{
	
	
	Timer timer = new Timer();
	TimerTask task;
	private HashMap<ICommand,TimerTask> tasks ;
	
	public HorlogeImp() {
		tasks = new HashMap<ICommand, TimerTask>() ;
	}

	public void activerPériodiquement(final ICommand cmd, long périodeEnSecondes){
		if(tasks.containsKey(cmd))
		{
			désactiver(cmd);
		}
		task = new TimerTask()
		{
			@Override
			public void run() 
			{
				Platform.runLater(() -> {
					cmd.execute();
				}) ;
			}	
		};
		tasks.put(cmd, task) ;
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
		TimerTask task = tasks.get(cmd) ;
		task.cancel() ;
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
