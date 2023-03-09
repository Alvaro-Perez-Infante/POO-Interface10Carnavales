package model;

public abstract class Agrupacion implements Comparable<Agrupacion>{

	private String nombre;
	private String autor;
	private String autorMusica;
	private String autorLetras;
	private String tipo;
	
	public Agrupacion() {
		
	}
	
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

	 public abstract String cantarPresentacion(String nombre);
	
	 public abstract String hacerTipo();
	 
	 @Override
		public int compareTo(Agrupacion a2) {
			return this.getNombre().compareTo(a2.getNombre());
		}

	// public abstract String amoAescucha();

	// public abstract String caminitoDelFalla();
}
