package fr.istic.java.dimitri.command;

import com.sun.xml.internal.ws.api.pipe.Engine;

import fr.istic.java.dimitri.controller.Controller;
import fr.istic.java.dimitri.model.IMetronomeEngine;

public class BeatFactoryCommand implements ICommand {

	private IMetronomeEngine engine ;
	
	/*(non-javadoc)
	 *  
	 * @see fr.istic.java.dimitri.command.ICommand#execute()
	 */
	@Override
	public void execute() {
		FactoryBeatCommand.getBeatCommand(engine).execute();
	}
	
	public void setEngine(IMetronomeEngine engine) {
		this.engine = engine ;
	}
	
	public void setBeatEvent(ICommand commande){
		FactoryBeatCommand.setBeatEvent(commande) ;
	}
	
	public void setBarEvent(ICommand commande){
		FactoryBeatCommand.setBarEvent(commande);
	}
}
