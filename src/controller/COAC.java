package controller;

import java.util.Arrays;

import model.Agrupacion;
import model.AgrupacionOficial;
import model.CompAgrupacionAutor;
import model.CompAgrupacionMusLet;
import model.CompAgrupacionNombre;
import model.CompAgrupacionOfiPnts;
import model.Integrante;

/**
 * <h2>Clase COAC (Controller), donde realizamos de la creaci&oacute;n y
 * modificaci&oacute;n de los conjuntos: Integrante y Agrupacion.</h2>
 * 
 * @version 10.0
 * @author &Aacute;lvaro P&eacute;rez Infante
 */
public class COAC {

	/**
	 * Declaraci&oacute;n del conjunto Integrante.
	 */
	private Integrante[] integrantes;

	/*
	 * Declaraci&oacute;n del conjunto Agrupacion.
	 */
	private Agrupacion[] agrupaciones;

	/**
	 * M&eacute;todo constructor de la clase que crea nuevos integrantes y
	 * agrupaciones.
	 * 
	 * @param i Le pas&aacute;mos dos par&aacute;metros para saber la cantidad de
	 *          nuevos objetos queremos crear.
	 * @param a Le pas&aacute;mos dos par&aacute;metros para saber la cantidad de
	 *          nuevos objetos queremos crear.
	 */
	public COAC(Integer i, Integer a) {
		integrantes = new Integrante[i];
		agrupaciones = new Agrupacion[a];

	}

	public Integrante[] getIntegrantes() {
		return integrantes;
	}

	public void setIntegrantes(Integrante[] integrantes) {
		this.integrantes = integrantes;
	}

	public Agrupacion[] getAgrupaciones() {
		return agrupaciones;
	}

	public void setAgrupaciones(Agrupacion[] agrupaciones) {
		this.agrupaciones = agrupaciones;
	}

	/**
	 * Este m&eacute;todo nos agrega un integrante m&acute;s a el conjunto de
	 * integrantes que ya tenemos.
	 * 
	 * @param i Le entregamos a el metodo el integrante que queremos introducir.
	 * @return Devuelve un booleano si es true se ha podido insertar sin problemas
	 *         el integrante, si es false no se ha podido introducir.
	 */
	public boolean insertarIntegrante(Integrante i) {
		boolean var = true;
		boolean ret = false;

		if (i != null) {
			for (int n = 0; n < integrantes.length; n++) {
				if (i == integrantes[n]) {
					var = false;
					break;
				}
			}
		}
		if (ret) {
			for (int n = 0; n < integrantes.length; n++) {
				if (integrantes[n] == null) {
					integrantes[n] = i;
					ret = true;
				}
			}
		}
		return ret;
	}

	/**
	 * Este m&eacute;todo nos elimina un integrante a el conjunto de integrantes que
	 * ya tenemos.
	 * 
	 * @param i Le entregamos a el metodo el integrante que queremos eliminar.
	 * @return Devuelve un booleano si es true se ha podido eliminar sin problemas
	 *         el integrante, si es false no se ha podido eliminar.
	 */
	public boolean eliminarIntegrante(Integrante i) {
		boolean ret = false;

		for (int n = 0; n < integrantes.length; n++) {
			if (i == integrantes[n]) {
				integrantes[n] = null;
				ret = true;
				break;
			}
		}
		return ret;
	}

	/**
	 * Este m&eacute;todo nos agrega una agrupaci&oacute;n m&acute;s a el conjunto
	 * de agrupaciones que ya tenemos.
	 * 
	 * @param a Le entregamos a el metodo la agrupaci&oacute;n que queremos
	 *          introducir.
	 * @return Devuelve un booleano si es true se ha podido insertar sin problemas
	 *         la agrupaci&oacute;n, si es false no se ha podido introducir.
	 */
	public boolean inscribir_agrupacion(Agrupacion a) {
		boolean var = true;
		boolean ret = false;

		if (a != null) {
			for (int n = 0; n < agrupaciones.length; n++) {
				if (a == agrupaciones[n]) {
					var = false;
					break;
				}
			}
		}
		if (ret) {
			for (int n = 0; n < agrupaciones.length; n++) {
				if (agrupaciones[n] == null) {
					agrupaciones[n] = a;
					ret = true;
				}
			}
		}
		return ret;
	}

	/**
	 * Este m&eacute;todo nos elimina una agrupaci&oacute;n a el conjunto de
	 * agrupaciones que ya tenemos.
	 * 
	 * @param a Le entregamos a el metodo la agrupaci&oacute;n que queremos
	 *          eliminar.
	 * @return Devuelve un booleano si es true se ha podido eliminar sin problemas
	 *         la agrupaci&oacute;n, si es false no se ha podido eliminar.
	 */
	public boolean eliminar_agrupacion(Agrupacion a) {
		boolean ret = false;

		for (int n = 0; n < agrupaciones.length; n++) {
			if (a == agrupaciones[n]) {
				agrupaciones[n] = null;
				ret = true;
				break;
			}
		}
		return ret;
	}

	/**
	 * M&eacute;todo que nos ordena la AgrupacionOficial por puntos.
	 * 
	 * @param orden Le pasamos como par&aacute;metro la agrupaci&oacute;n en
	 *              espec&iacute;fico que queremos ordenar.
	 */
	public void ordenar_por_puntos(AgrupacionOficial[] orden) {
		Arrays.sort(orden, new CompAgrupacionOfiPnts());
	}

	/**
	 * M&eacute;todo que nos ordena la AgrupacionOficial por nombre.
	 */
	public void ordenar_por_nombre() {
		Arrays.sort(agrupaciones, new CompAgrupacionNombre());
	}

	/**
	 * M&eacute;todo que nos ordena la AgrupacionOficial por autor.
	 */
	public void ordenar_por_autor() {
		Arrays.sort(agrupaciones, new CompAgrupacionAutor());
	}

	/**
	 * M&eacute;todo que nos ordena la AgrupacionOficial por nombre.
	 */
	public void ordenar_por_autor_musica_letra() {
		Arrays.sort(agrupaciones, new CompAgrupacionMusLet());
	}

	/**
	 * M&eacute;todo que nos ordena la AgrupacionOficial por nombre.
	 */
	public void asignarPuntos(AgrupacionOficial a, Integer pnt) {
		a.setPuntosObtenidos(pnt);
	}

}
