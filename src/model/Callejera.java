package model;

/**
 * <h2>Interfaz Callejera que se implementar&aacute; a las clases a las clases
 * necesarias junto con sus m&eacute;todos.</h2>
 * 
 * @version 9.0
 * @author &Aacute;lvaro P&eacute;rez Infante
 */
public interface Callejera {

	/**
	 * M&eacute;todo que heredar&aacute;n las clases hijas de esta.
	 * 
	 * @return Devuelve una cadena de texo que nos indica el tipo de Agrupacion que
	 *         vamos a escuchar.
	 */
	public abstract String amoAescucha();

}
