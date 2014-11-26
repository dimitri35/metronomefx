package fr.istic.java.main.materiel;

//import command.ICommand;
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
	
	public static Horloge getHorloge()
	{
		return lHorloge ;
	}
	public static Clavier getClavier()
	{
		return leClavier ;
	}
	public static Molette getMolette()
	{
		return laMolette ;
	}
	public static EmetteurSonore getEmetteurSonore() 
	{
		return emetteurSonore;
		
	}
	public static Afficheur getAfficheur() 
	{
		return afficheur ;
	}
	
}
