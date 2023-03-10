package model;

/**
 * <h2>Clase Comparsa donde creamos y modificamos este tipo de agrupacion. Con
 * todos sus m&eacute;todos respectivos, getters y setters.</h2>
 * 
 * @version 13.0
 * @author &Aacute;lvaro P&eacute;rez Infante
 */
public class Comparsa extends AgrupacionOficial implements Callejera {

	/**
	 * Empresa atrezzo que tiene la comparsa. Una cadena de texto.
	 */
	private String empresaAtrezzo;

	/**
	 * M&eacute;todo constructor de la clase vac&iacute;o solo con las variables de
	 * la clase padre.
	 */
	public Comparsa() {
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
	 * @param empresaAtrezzo   El s&eacute;ptimo y &uacute;ltimo par&aacute;metro de
	 *                         la clase, una cadena de texto.
	 */
	public Comparsa(String empresaAtrezzo, String nombre, String autor, String autorMusica, String autorLetras,
			String tipo, Integer puntosObtenidos) {
		super(nombre, autor, autorMusica, autorLetras, tipo, puntosObtenidos);
		setEmpresaAtrezzo(empresaAtrezzo);
	}

	public String getEmpresaAtrezzo() {
		return empresaAtrezzo;
	}

	public void setEmpresaAtrezzo(String empresaAtrezzo) {
		this.empresaAtrezzo = empresaAtrezzo;
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
		return "Cantando la presentación de la Comparsa: " + super.getNombre();
	}

	/**
	 * M&eacute;todo heredado por la clase padre de esta.
	 * 
	 * @return Devuelve una cadena de texo que nos indica el tipo de
	 *         espect&aacute;culo van a dar en el escenario.
	 */
	@Override
	public String hacerTipo() {
		return "La Comparsa: " + super.getNombre() + " va de " + super.getTipo();
	}

	/**
	 * M&eacute;todo heredado por la clase padre de esta.
	 * 
	 * @return Devuelve una cadena de texo que nos indica el tipo de Agrupacion que
	 *         va caminito del falla.
	 */
	@Override
	public String caminitoDelFalla() {
		return "La Comparsa : " + super.getNombre() + " va caminito del Falla.";
	}

	/**
	 * M&eacute;todo heredado de la interfac Callejera implementada en esta clase.
	 * 
	 * @return Devuelve una cadena de texo que nos indica el tipo de Agrupacion que
	 *         vamos a escuchar.
	 */
	@Override
	public String amoAescucha() {
		return "Amo a escuchá la Comparsa : " + super.getNombre();
	}

	/**
	 * M&eacute;metodo toString que nos permite transformar el c&oacute;digo a un
	 * lenguaje que podemos entender y as&iacute; poder probar el funcionamiento del
	 * programa.
	 */
	@Override
	public String toString() {
		return "Comparsa Empresa Atrezzo = " + getEmpresaAtrezzo() + ", del tipo = " + hacerTipo() + ", "
				+ caminitoDelFalla() + ", " + amoAescucha() + ".";
	}

}
