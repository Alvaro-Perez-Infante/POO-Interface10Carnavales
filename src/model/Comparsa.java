package model;

public class Comparsa extends AgrupacionOficial implements Callejera{

	private String empresaAtrezzo;

	public Comparsa() {
		super();
	}

	public Comparsa(String empresaAtrezzo,String nombre, String autor, String autorMusica, String autorLetras, String tipo, Integer puntosObtenidos) {
		super(nombre, autor, autorMusica, autorLetras, tipo, puntosObtenidos);
		setEmpresaAtrezzo(empresaAtrezzo);
	}

	public String getEmpresaAtrezzo() {
		return empresaAtrezzo;
	}

	public void setEmpresaAtrezzo(String empresaAtrezzo) {
		this.empresaAtrezzo = empresaAtrezzo;
	}

	@Override
	public String cantarPresentacion(String nombre) {
		return "Cantando la presentación de la Comparsa: " + super.getNombre();
	}

	@Override
	public String hacerTipo() {
		return "La Comparsa: " + super.getNombre() + " va de " + super.getTipo();
	}

	@Override
	public String caminitoDelFalla() {
		return "La Comparsa : " + super.getNombre() + " va caminito del Falla." ;
	}

	@Override
	public String amoAescucha() {
		return "Amo a escuchá la Comparsa : " + super.getNombre();
	}
	
	
	
}
