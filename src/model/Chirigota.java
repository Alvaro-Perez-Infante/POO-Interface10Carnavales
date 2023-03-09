package model;

public class Chirigota extends AgrupacionOficial implements Callejera{

	private Integer numCuples;
	
	public Chirigota() {
		super();
	}

	public Chirigota(Integer numCuples, String nombre, String autor, String autorMusica, String autorLetras, String tipo, Integer puntosObtenidos) {
		super(nombre, autor, autorMusica, autorLetras, tipo, puntosObtenidos);
		setNumCuples(numCuples);
	}

	public Integer getNumCuples() {
		return numCuples;
	}

	public void setNumCuples(Integer numCuples) {
		this.numCuples = numCuples;
	}

	@Override
	public String cantarPresentacion(String nombre) {
		return "Cantando la presentación de la Chirigota: " + super.getNombre();
	}

	@Override
	public String hacerTipo() {
		return "La Chirigota: " + super.getNombre() + " va de " + super.getTipo();
	}

	@Override
	public String caminitoDelFalla() {
		return "La chirigota : "+ super.getNombre() + " va caminito del Falla.";
	}

	@Override
	public String amoAescucha() {
		return "Amo a escuchá la Chirigota : " + super.getNombre();
	}
	
	
	
}
