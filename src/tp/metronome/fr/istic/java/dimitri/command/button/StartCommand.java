package fr.istic.java.dimitri.command.button;

import fr.istic.java.dimitri.command.ICommand;



/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class StartCommand implements ICommand
{
	StartListener ecouteur ;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public StartCommand(){
		super();
	}
	
	/*(non-javadoc)
	 *
	 * @see fr.istic.java.dimitri.command.ICommand#execute()
	 */
	public void execute() {
		ecouteur.start();
	}
	
	public void setOnStartListener(StartListener ecouteurDemarrer)
	{
		this.ecouteur = ecouteurDemarrer ;
	}

}

