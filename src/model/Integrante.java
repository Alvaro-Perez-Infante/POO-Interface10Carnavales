package model;

/**
 * <h2>Clase Integrante donde creamos y modificamos el listado de estos con
 * todos sus datos y con todos sus m&eacute;todos respectivos, getters y
 * setters.</h2>
 * 
 * @version 14.0
 * @author &Aacute;lvaro P&eacute;rez Infante
 */
public class Integrante {

	/**
	 * N&uacute;mero de participante que tiene el Integrante. Un n&uacute;mero
	 * entero.
	 */
	private Integer numParticipante;

	/**
	 * Nombre que tiene el Integrante. Una cadena de texto.
	 */
	private String nombre;

	/**
	 * Edad que tiene el Integrante. Un n&uacute;mero entero.
	 */
	private Integer edad;

	/**
	 * Nombre de la localidad que tiene el Integrante. Una cadena de texto.
	 */
	private String localidad;

	/**
	 * Contador de todos los integrantes que se van creante. Cada vez que se crea un
	 * nuevo integrante el contador sube 1. Un n&uacute;mero entero.
	 */
	private static Integer contador = 1;

	/**
	 * Constructor de la clase vac&iacute;o solo con el contador de integrantes que
	 * se van creando.
	 */
	public Integrante() {
		setNumParticipante(contador++);
	}

	/**
	 * 
	 * @param numParticipante El primer par&aacute;metro de la clase, un
	 *                        n&uacute;mero entero.
	 * @param nombre          El primer par&aacute;metro de la clase, un
	 *                        n&uacute;mero entero.
	 * @param edad            El tercer par&aacute;metro de la clase, un
	 *                        n&uacute;mero entero.
	 * @param localidad       El cuarto par&aacute;metro de la clase, una cadena de
	 *                        texto.
	 */
	public Integrante(Integer numParticipante, String nombre, Integer edad, String localidad) {
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

	/**
	 * M&eacute;todo setter de la Edad de cada integrante. Si el integrante es menor
	 * de edad el programa le indicar&aacute; que no es posible para el instribirse.
	 * 
	 * @param edad El primer y &uacute;nico par&aacute;metro de la clase, un
	 *             n&uacute;mero entero.
	 */
	public void setEdad(Integer edad) {
		if (edad >= 18) {
			this.edad = edad;
		} else {
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
	
	/**
	 * M&eacute;metodo toString que nos permite transformar el c&oacute;digo a un
	 * lenguaje que podemos entender y as&iacute; poder probar el funcionamiento del
	 * programa.
	 */
	@Override
	public String toString() {
		return "Nombre del participante : " + getNombre() + ", de edad : " + getEdad() + ", reside en : "
				+ getLocalidad() + ", numero de integrante : " + getNumParticipante();
	}

}
