package model;

/**
 * <h2>Clase Agrupacion, donde realizamos las agrupaciones de los distintos
 * tipos de carnavales existentes y clasificados en este programa.</h2>
 * 
 * @version 12.0
 * @author &Aacute;lvaro P&eacute;rez Infante
 */
public abstract class Agrupacion implements Comparable<Agrupacion> {

	/**
	 * Nombre del tipo de agrupacion que estamos definiendo. Una cadena de texto.
	 */
	private String nombre;

	/**
	 * Autor de la creaci&oacute;n de la agrupacion en cuesti&oacute;n. Una cadena
	 * de texto.
	 */
	private String autor;

	/**
	 * Autor de la m&uacute;sica reproducida en la agrupacion. Una cadena de texto.
	 */
	private String autorMusica;

	/**
	 * Autor de las letras expuestas en las agrupaciones varias. Una cadena de
	 * texto.
	 */
	private String autorLetras;

	/**
	 * Tipo de agrupacion que estamos hablando, ya que hay muchos tipos de esta hay
	 * que clasificarlas en una variable. Una cadena de texto.
	 */
	private String tipo;

	/**
	 * M&eacute;todo constructor vac&iacute;o.
	 */
	public Agrupacion() {
	}

	/**
	 * M&eacute;todo construtor con todas las variables de la clase Agrupacion.
	 * 
	 * @param nombre      El primer par&aacute;metro del m&eacute;todo, una cadena
	 *                    de texto.
	 * @param autor       El segundo par&aacute;metro del m&eacute;todo, una cadena
	 *                    de texto.
	 * @param autorMusica El tercer par&aacute;metro del m&eacute;todo, una cadena
	 *                    de texto.
	 * @param autorLetras El cuarto par&aacute;metro del m&eacute;todo, una cadena
	 *                    de texto.
	 * @param tipo        El quinto y &uacute;ltimo par&aacute;metro del
	 *                    m&eacute;todo, una cadena de texto.
	 */
	public Agrupacion(String nombre, String autor, String autorMusica, String autorLetras, String tipo) {
		super();
		setNombre(nombre);
		setAutor(autor);
		setAutorMusica(autorMusica);
		setAutorLetras(autorLetras);
		setTipo(tipo);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAutorMusica() {
		return autorMusica;
	}

	public void setAutorMusica(String autorMusica) {
		this.autorMusica = autorMusica;
	}

	public String getAutorLetras() {
		return autorLetras;
	}

	public void setAutorLetras(String autorLetras) {
		this.autorLetras = autorLetras;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * M&eacute;todo que heredar&aacute;n las clases hijas de esta.
	 * 
	 * @param nombre El primer y &uacute;nico par&aacute;metro del m&eacute;todo,
	 *               una cadena de texto.
	 * @return Devuelve una cadena de texo que nos indica el tipo de
	 *         agrupaci&oacute;n que canta.
	 */
	public abstract String cantarPresentacion(String nombre);

	/**
	 * M&eacute;todo que heredar&aacute;n las clases hijas de esta.
	 * 
	 * @return Devuelve una cadena de texo que nos indica el tipo de
	 *         espect&aacute;culo van a dar en el escenario.
	 */
	public abstract String hacerTipo();

	/**
	 * M&eacute;todo comparador de la clase teniendo encuenta el nombre de la
	 * Agrupacion.
	 */
	@Override
	public int compareTo(Agrupacion a2) {
		return this.getNombre().compareTo(a2.getNombre());
	}
}
