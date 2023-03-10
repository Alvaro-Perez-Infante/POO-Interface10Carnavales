package model;

public class Coro extends AgrupacionOficial{

	private Integer numBandurrias;
	private Integer numGuitarras;

	public Coro() {
		super();
	}	

	public Coro(String nombre, String autor, String autorMusica, String autorLetras, String tipo, Integer puntosObtenidos) {
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


	@Override
	public String cantarPresentacion(String nombre) {
		return "Cantando la presentación del Coro: " + super.getNombre();
	}

	@Override
	public String hacerTipo() {
		return "El Coro: " + super.getNombre() + " va de " + super.getTipo();

	}

	@Override
	public String caminitoDelFalla() {
		return "El coro " + super.getNombre() + " va caminito del Falla";
	}
	
	@Override
	public String toString() {
		return "Coro " + super.toString() + ", Numero de bandurrias = " + numBandurrias + ", Numero de guitarras " + numGuitarras;
	}
	
	
	
}
