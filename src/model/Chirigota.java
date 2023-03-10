package model;

/**
 * <h2>Clase Chirigota donde creamos y modificamos este tipo de agrupacion. Con
 * todos sus m&eacute;todos respectivos, getters y setters.</h2>
 * 
 * @version 13.0
 * @author &Aacute;lvaro P&eacute;rez Infante
 */
public class Chirigota extends AgrupacionOficial implements Callejera {

	/**
	 * N&uacute;mero de cuples que tiene la Chirigota. Un n&uacute;mero entero.
	 */
	private Integer numCuples;

	/**
	 * M&eacute;todo constructor de la clase vac&iacute;o solo con las variables de
	 * la clase padre.
	 */
	public Chirigota() {
		super();
	}

	/**
	 * M&eacute;todo construtor con todas las variables de la clase
	 * Chirigota.
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
	 * @param numCuples        El s&eacute;ptimo y &uacute;ltimo par&aacute;metro de
	 *                         la clase, un n&uacute;mero entero.
	 */
	public Chirigota(Integer numCuples, String nombre, String autor, String autorMusica, String autorLetras,
			String tipo, Integer puntosObtenidos) {
		super(nombre, autor, autorMusica, autorLetras, tipo, puntosObtenidos);
		setNumCuples(numCuples);
	}

	public Integer getNumCuples() {
		return numCuples;
	}

	public void setNumCuples(Integer numCuples) {
		this.numCuples = numCuples;
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
		return "Cantando la presentación de la Chirigota: " + super.getNombre();
	}

	/**
	 * M&eacute;todo heredado por la clase padre de esta.
	 * 
	 * @return Devuelve una cadena de texo que nos indica el tipo de
	 *         espect&aacute;culo van a dar en el escenario.
	 */
	@Override
	public String hacerTipo() {
		return "La Chirigota: " + super.getNombre() + " va de " + super.getTipo();
	}

	/**
	 * M&eacute;todo heredado por la clase padre de esta.
	 * 
	 * @return Devuelve una cadena de texo que nos indica el tipo de Agrupacion que
	 *         va caminito del falla.
	 */
	@Override
	public String caminitoDelFalla() {
		return "La chirigota : " + super.getNombre() + " va caminito del Falla.";
	}

	/**
	 * M&eacute;todo heredado de la interfac Callejera implementada en esta clase.
	 * 
	 * @return Devuelve una cadena de texo que nos indica el tipo de Agrupacion que
	 *         vamos a escuchar.
	 */
	@Override
	public String amoAescucha() {
		return "Amo a escuchá la Chirigota : " + super.getNombre();
	}

	/**
	 * M&eacute;metodo toString que nos permite transformar el c&oacute;digo a un
	 * lenguaje que podemos entender y as&iacute; poder probar el funcionamiento del
	 * programa.
	 */
	@Override
	public String toString() {
		return "Chirigota numero de cuples = " + getNumCuples() + ", del tipo = " + hacerTipo() + ", "
				+ caminitoDelFalla() + ", " + amoAescucha() + ".";
	}

}
