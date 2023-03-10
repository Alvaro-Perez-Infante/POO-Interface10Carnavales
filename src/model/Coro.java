package model;

/**
 * <h2>Clase Coro donde creamos y modificamos este tipo de agrupacion. Con todos
 * sus m&eacute;todos respectivos, getters y setters.</h2>
 * 
 * @version 12.0
 * @author &Aacute;lvaro P&eacute;rez Infante
 */
public class Coro extends AgrupacionOficial {

	/**
	 * N&uacute;mero de bandurrias que tiene la Comparsa. Un n&uacute;mero entero.
	 */
	private Integer numBandurrias;

	/**
	 * N&uacute;mero de guitarras que tiene la Comparsa. Un n&uacute;mero entero.
	 */
	private Integer numGuitarras;

	/**
	 * M&eacute;todo constructor de la clase vac&iacute;o solo con las variables de
	 * la clase padre.
	 */
	public Coro() {
		super();
	}

	/**
	 * M&eacute;todo construtor con todas las variables de la clase Comparsa.
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
	 * @param puntosObtenidos2 El sexto par&aacute;metro de la clase, un
	 *                         n&uacute;mero entero.
	 * @param numBandurrias    El s&eacute;ptimo par&aacute;metro de la clase, un
	 *                         n&uacute;mero entero.
	 * @param numGuitarras     El octavo y &uacute;ltimo par&aacute;metro de la
	 *                         clase, un n&uacute;mero entero.
	 */
	public Coro(Integer numBandurrias, Integer numGuitarras, String nombre, String autor, String autorMusica,
			String autorLetras, String tipo, Integer puntosObtenidos) {
		super(nombre, autor, autorMusica, autorLetras, tipo, puntosObtenidos);
		setNumBandurrias(numBandurrias);
		setNumGuitarras(numGuitarras);
	}

	public Integer getNumBandurrias() {
		return numBandurrias;
	}

	public void setNumBandurrias(Integer numBandurrias) {
		this.numBandurrias = numBandurrias;
	}

	public Integer getNumGuitarras() {
		return numGuitarras;
	}

	public void setNumGuitarras(Integer numGuitarras) {
		this.numGuitarras = numGuitarras;
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
		return "Cantando la presentación del Coro: " + super.getNombre();
	}

	/**
	 * M&eacute;todo heredado por la clase padre de esta.
	 * 
	 * @return Devuelve una cadena de texo que nos indica el tipo de
	 *         espect&aacute;culo van a dar en el escenario.
	 */
	@Override
	public String hacerTipo() {
		return "El Coro: " + super.getNombre() + " va de " + super.getTipo();

	}

	/**
	 * M&eacute;todo heredado por la clase padre de esta.
	 * 
	 * @return Devuelve una cadena de texo que nos indica el tipo de Agrupacion que
	 *         va caminito del falla.
	 */
	@Override
	public String caminitoDelFalla() {
		return "El coro " + super.getNombre() + " va caminito del Falla";
	}

	/**
	 * M&eacute;metodo toString que nos permite transformar el c&oacute;digo a un
	 * lenguaje que podemos entender y as&iacute; poder probar el funcionamiento del
	 * programa.
	 */
	@Override
	public String toString() {
		return "Coro " + super.toString() + ", Numero de bandurrias = " + numBandurrias + ", Numero de guitarras "
				+ numGuitarras;
	}

}
