package model;

public class Cuarteto extends AgrupacionOficial implements Callejera{

	private Integer numMiembros;

	public Cuarteto() {
		super();
	}
	
	public Cuarteto(Integer numMiembros, String nombre, String autor, String autorMusica, String autorLetras, String tipo, Integer puntosObtenidos) {
		super(nombre, autor, autorMusica, autorLetras, tipo, puntosObtenidos);
		setNumMiembros(numMiembros);
	}

	public Integer getNumMiembros() {
		return numMiembros;
	}

	public void setNumMiembros(Integer numMiembros) {
		this.numMiembros = numMiembros;
	}

	@Override
	public String cantarPresentacion(String nombre) {
		return "Cantando la presentación del Cuarteto:  " + super.getNombre();

	}
	
	@Override
	public String hacerTipo() {
		return "El Cuarteto: " + super.getNombre() + " va de " + super.getTipo();
	}

	@Override
	public String caminitoDelFalla() {
		return "El cuarteto : " + super.getNombre() + " va caminito del Falla." ;
	}

	@Override
	public String amoAescucha() {
		return "Amo a escuchá el Cuarteto : " + super.getNombre();
	}
	
}
