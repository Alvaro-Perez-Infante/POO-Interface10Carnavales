package model;

public class Romancero extends Agrupacion implements Callejera {

	private String temCartelon;

	public Romancero() {
		super();
	}

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

	@Override
	public String cantarPresentacion(String nombre) {
		return "Cantando la presentación del Romancero: " + super.getNombre();

	}

	@Override
	public String hacerTipo() {
		return "El Romancero: " + super.getNombre() + " va de " + super.getTipo();
	}

	@Override
	public String amoAescucha() {
		return "Amo a escuchá el Romancero : " + super.getNombre();
	}
}
