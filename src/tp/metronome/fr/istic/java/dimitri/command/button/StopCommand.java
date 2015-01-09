package fr.istic.java.dimitri.command.button;

import com.sun.prism.paint.Stop;

import fr.istic.java.dimitri.command.ICommand;



/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class StopCommand implements ICommand
{
	StopListener ecouteur ;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public StopCommand(){
		super();
	}

	/* (non-javadoc)
	 * 
	 * @see fr.istic.java.dimitri.command.ICommand#execute()
	 */
	public void execute() {
		ecouteur.stop(); 
	}
	
	public void setOnStopListener(StopListener ecouteurDemarrer)
	{
		this.ecouteur = ecouteurDemarrer ;
	}

}

