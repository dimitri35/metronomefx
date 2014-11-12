package tp.metronome.model;

import java.util.Timer;
import java.util.TimerTask;

public class HorlogeImp implements Horloge{
	
	
	Timer timer = new Timer();
	TimerTask task;
	public void activerPériodiquement(final Commande cmd, long périodeEnSecondes){
		task = new TimerTask()
		{
			@Override
			public void run() 
			{
				cmd.Execute();
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
	public void désactiver(Commande cmd){
		cmd.Execute();
	}
	
	public Timer getTimer(){
		return timer;
	}
	
	public TimerTask getTimerTask(){
		return task;
	}
	
}
