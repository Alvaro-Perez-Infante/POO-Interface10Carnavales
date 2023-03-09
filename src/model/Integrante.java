package model;

public class Integrante{

	private Integer numParticipante;
	private String nombre;
	private Integer edad;
	private String localidad;
	private Integer contador = 1;
	
	public Integrante() {
		setNumParticipante(contador++);
	}
	
	public Integrante(Integer numParticipante, Integer numero, String nombre, Integer edad, String localidad) {
		setNumParticipante(contador++);
		setNombre(nombre);
		setEdad(edad);
		setLocalidad(localidad);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		if (edad >= 18) {
		this.edad = edad;
		}else {
			System.out.println("No puede inscribirse un menor de edad");
		}
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public Integer getNumParticipante() {
		return numParticipante;
	}

	private void setNumParticipante(Integer numParticipante) {
		this.numParticipante = numParticipante;
	}

	@Override
	public String toString() {
		return "Nombre del participante : " + getNombre() + ", de edad : " + getEdad() + ", reside en : "
				+ getLocalidad() + ", numero de integrante : " + getNumParticipante();
	}

	
	
}
