package fr.istic.java.version.materiel;

/**
 * Interface qui permet de gérer la molette matériel.
 * @author dimitri
 *
 */
public interface Molette {
	/**
	 * Permet de récupérer la position de la molette.
	 * @return La position de la molette (0 = minimum, 1 = maximum)
	 */
	float position() ;
}
