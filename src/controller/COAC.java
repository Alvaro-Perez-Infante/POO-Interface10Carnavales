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
 * 
 * @author daw1
 *
 */
public class COAC {

	private Integrante[] integrantes;
	private Agrupacion[] agrupaciones;

	
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

	public boolean insertarIntegrante(Integrante i) {
		boolean var = true;
		boolean ret = false;

		
		if (i != null) {
			for(int n=0; n < integrantes.length; n++) {
				if (i == integrantes[n]) {
					var=false;
					break;
			}
		}
	}
		if(ret) {
			for(int n=0; n < integrantes.length; n++) {
				if(integrantes[n] == null) {
					integrantes[n] = i;
					ret = true;
				}
			}
		}
		return ret;
	}
	
	public boolean eliminarIntegrante(Integrante i){
		boolean ret = false;
		
		for(int n = 0; n < integrantes.length; n++) {
			if(i == integrantes[n]) {
				integrantes[n] = null;
				ret = true;
				break;
			}
		}
		return ret;
	}
	
	public boolean inscribir_agrupacion(Agrupacion a) {
		boolean var = true;
		boolean ret = false;

		
		if (a != null) {
			for(int n=0; n < agrupaciones.length; n++) {
				if (a == agrupaciones[n]) {
					var=false;
					break;
			}
		}
	}
		if(ret) {
			for(int n=0; n < agrupaciones.length; n++) {
				if(agrupaciones[n] == null) {
					agrupaciones[n] = a;
					ret = true;
				}
			}
		}
		return ret;
	}
	
	public boolean eliminar_agrupacion(Agrupacion a) {
		boolean ret = false;
		
		for(int n = 0; n < agrupaciones.length; n++) {
			if(a == agrupaciones[n]) {
				agrupaciones[n] = null;
				ret = true;
				break;
			}
		}
		return ret;
	}
	
	
	public void ordenar_por_puntos(AgrupacionOficial[] orden) {
		Arrays.sort(orden, new CompAgrupacionOfiPnts());
	}
	
	public void ordenar_por_nombre() {
		Arrays.sort(agrupaciones, new CompAgrupacionNombre());
	}
	
	public void ordenar_por_autor() {
		Arrays.sort(agrupaciones, new CompAgrupacionAutor());
	}
	
	public void ordenar_por_autor_musica_letra() {
		Arrays.sort(agrupaciones, new CompAgrupacionMusLet());
	}
	
	public void asignarPuntos(AgrupacionOficial a, Integer pnt) {
		a.setPuntosObtenidos(pnt);
	}

	
	
	
	
	
}
