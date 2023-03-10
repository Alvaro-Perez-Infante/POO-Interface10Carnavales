package model;

/**
 * <h2>Clase Romancero donde creamos y modificamos este tipo de agrupacion. Con
 * todos sus m&eacute;todos respectivos, getters y setters.</h2>
 * 
 * @version 15.0
 * @author &Aacute;lvaro P&eacute;rez Infante
 */
public class Romancero extends Agrupacion implements Callejera {

	/**
	 * Tema de cartelon que tiene el Romancero. Una cadena de texto.
	 */
	private String temCartelon;

	/**
	 * M&eacute;todo constructor de la clase vac&iacute;o solo con las variables de
	 * la clase padre.
	 */
	public Romancero() {
		super();
	}

	/**
	 * M&eacute;todo construtor con todas las variables de la clase Romancero.
	 * 
	 * @param nombre      El primer par&aacute;metro del m&eacute;todo, una cadena
	 *                    de texto.
	 * @param autor       El segundo par&aacute;metro del m&eacute;todo, una cadena
	 *                    de texto.
	 * @param autorMusica El tercer par&aacute;metro del m&eacute;todo, una cadena
	 *                    de texto.
	 * @param autorLetras El cuarto par&aacute;metro del m&eacute;todo, una cadena
	 *                    de texto.
	 * @param tipo        El quinto par&aacute;metro del m&eacute;todo, una cadena
	 *                    de texto.
	 * @param numCuples   El sexto y &uacute;ltimo par&aacute;metro de la clase, una
	 *                    cadena de texto.
	 */
	public Romancero(String temCartelon, String nombre, String autor, String autorMusica, String autorLetras,
			String tipo) {
		super(nombre, autor, autorMusica, autorLetras, tipo);
		setTemCartelon(temCartelon);
	}

	public String getTemCartelon() {
		return temCartelon;
	}

	public void setTemCartelon(String temCartelon) {
		this.temCartelon = temCartelon;
	}

	/**
	 * M&eacute;todo heredado por la clase padre de esta.
	 * 
	 * @param nombre El primer y &uacute;nico par&aacute;metro del m&eacute;todo,
	 *               una cadena de texto.
	 * @return Devuelve una cadena de texo que nos indica el tipo de
	 *         agrupaci&oacute;n que canta.
	 */
	@Override
	public String cantarPresentacion(String nombre) {
		return "Cantando la presentación del Romancero: " + super.getNombre();

	}

	/**
	 * M&eacute;todo heredado por la clase padre de esta.
	 * 
	 * @return Devuelve una cadena de texo que nos indica el tipo de
	 *         espect&aacute;culo van a dar en el escenario.
	 */
	@Override
	public String hacerTipo() {
		return "El Romancero: " + super.getNombre() + " va de " + super.getTipo();
	}

	/**
	 * M&eacute;todo heredado de la interfac Callejera implementada en esta clase.
	 * 
	 * @return Devuelve una cadena de texo que nos indica el tipo de Agrupacion que
	 *         vamos a escuchar.
	 */
	@Override
	public String amoAescucha() {
		return "Amo a escuchá el Romancero : " + super.getNombre();
	}

	/**
	 * M&eacute;metodo toString que nos permite transformar el c&oacute;digo a un
	 * lenguaje que podemos entender y as&iacute; poder probar el funcionamiento del
	 * programa.
	 */
	@Override
	public String toString() {
		return "Romancero Tema Cartelon =" + getTemCartelon() + ", del tipo = " + hacerTipo() + ", " + amoAescucha()
				+ ".";
	}

}
