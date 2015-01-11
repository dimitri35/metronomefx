package fr.istic.java.version.materiel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

import javafx.application.Platform;
import fr.istic.java.dounia.model.Commande;
import fr.istic.java.version.command.ICommand;
/**
 * Classe qui permet de gérer l'horloge.
 * @author dounia 
 *
 */

public class HorlogeImp implements Horloge{
	
	
	Timer timer = new Timer();
	TimerTask task;
	private HashMap<ICommand,TimerTask> tasks ;
	
	public HorlogeImp() {
		tasks = new HashMap<ICommand, TimerTask>() ;
	}
	
	/*
	 * (non-Javadoc)
	 * @see fr.istic.java.version.materiel.Horloge#activerPériodiquement(fr.istic.java.version.command.ICommand, long)
	 */
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
	
	/*
	 * (non-Javadoc)
	 * @see fr.istic.java.version.materiel.Horloge#désactiver(fr.istic.java.version.command.ICommand)
	 */
	public void désactiver(ICommand cmd){
		TimerTask task = tasks.get(cmd) ;
		task.cancel() ;
		//timer.cancel() ;
		//timer.purge() ;
	}
	
	/*
	 * (non-Javadoc)
	 * @see fr.istic.java.version.materiel.Horloge#getTimer()
	 */
	public Timer getTimer(){
		return timer;
	}
	
	/*
	 * (non-Javadoc)
	 * @see fr.istic.java.version.materiel.Horloge#getTimerTask()
	 */
	public TimerTask getTimerTask(){
		return task;
	}
	
}
