package model;

/**
 * <h2>Clase Agrupacion, donde realizamos las agrupaciones de los distintos
 * tipos de carnavales existentes y clasificados en este programa como
 * agrupaciones que oficialmente est&aacute;n en la competici&oacute;n.</h2>
 * 
 * @version 15.0
 * @author &Aacute;lvaro P&eacute;rez Infante
 */
public abstract class AgrupacionOficial extends Agrupacion {

	/**
	 * Puntos obtenidos por la agrupacion en la competici&oacute;n oficial. Un
	 * n&uacute;mero entero.
	 */
	private Integer puntosObtenidos;

	/**
	 * M&eacute;todo constructor de la clase vac&iacute;o solo con las variables de
	 * la clase padre.
	 */
	public AgrupacionOficial() {
		super();
	}

	/**
	 * M&eacute;todo construtor con todas las variables de la clase
	 * AgrupacionOficial.
	 * 
	 * @param nombre           El primer par&aacute;metro del m&eacute;todo, una
	 *                         cadena de texto.
	 * @param autor            El segundo par&aacute;metro del m&eacute;todo, una
	 *                         cadena de texto.
	 * @param autorMusica      El tercer par&aacute;metro del m&eacute;todo, una
	 *                         cadena de texto.
	 * @param autorLetras      El cuarto par&aacute;metro del m&eacute;todo, una
	 *                         cadena de texto.
	 * @param tipo             El quinto par&aacute;metro del m&eacute;todo, una
	 *                         cadena de texto.
	 * @param puntosObtenidos2 El sexto y &uacute;ltimo par&aacute;metro de la
	 *                         clase, un n&uacute;mero entero.
	 */
	public AgrupacionOficial(String nombre, String autor, String autorMusica, String autorLetras, String tipo,
			Integer puntosObtenidos2) {
		super(nombre, autor, autorMusica, autorLetras, tipo);
		setPuntosObtenidos(puntosObtenidos);
	}

	public Integer getPuntosObtenidos() {
		return puntosObtenidos;
	}

	public void setPuntosObtenidos(Integer puntosObtenidos) {
		this.puntosObtenidos = puntosObtenidos;
	}

	/**
	 * M&eacute;todo que heredar&aacute;n las clases hijas de esta.
	 * 
	 * @return Devuelve una cadena de texo que nos indica el tipo de Agrupacion que
	 *         va caminito del falla.
	 */
	public abstract String caminitoDelFalla();
}
