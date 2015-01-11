package fr.istic.java.version.materiel;

//import command.ICommand;
/**
 * Classe qui permet de gérer le matériel
 * @author dimitri
 *
 */
public  class Materiel {

	private static Horloge lHorloge  ;
	private static Clavier leClavier ;
	private static  Molette laMolette ;
	private static EmetteurSonore emetteurSonore ;
	private static Afficheur afficheur ;
	
	static{
		lHorloge = new HorlogeImp() ;
		leClavier = new ClavierImpl() ;
		laMolette = new MoletteImpl() ;
		emetteurSonore = new EmetteurSonoreImpl() ;
		afficheur = new AfficheurImpl()  ;
	}
	
	/**
	 * Permet de récupérer l'horloge matériel.
	 * @return L'horloge matériel.
	 */
	public static Horloge getHorloge()
	{
		return lHorloge ;
	}
	/**
	 * Permet de récupérer le clavier matériel.
	 * @return Le clavier matériel.
	 */
	public static Clavier getClavier()
	{
		return leClavier ;
	}
	/**
	 * Permet de récupérer la molette matériel.
	 * @return La molette matériel.
	 */
	public static Molette getMolette()
	{
		return laMolette ;
	}
	/**
	 * Permet de récupérer l'émetteur sonore matériel.
	 * @return L'émetteur sonore matériel.
	 */
	public static EmetteurSonore getEmetteurSonore() 
	{
		return emetteurSonore;
		
	}
	/**
	 * Permet de récupérer l'afficheur matériel.
	 * @return L'afficheur matériel.
	 */
	public static Afficheur getAfficheur() 
	{
		return afficheur ;
	}
	
}
