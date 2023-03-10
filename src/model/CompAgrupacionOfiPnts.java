package model;

import java.util.Comparator;

/**
 * <h2>Clase Comparator de Agrupacion.</h2>
 * 
 * @version 10.0
 * @author &Aacute;lvaro P&eacute;rez Infante
 */
public class CompAgrupacionOfiPnts implements Comparator<AgrupacionOficial> {

	/**
	 * M&eacute;metodo que usamos para comprar dos agrupaciones distintas en
	 * funci&oacute;n a los puntos obtenidos en la calificaci&oacute;n de ambas.
	 */
	@Override
	public int compare(AgrupacionOficial o1, AgrupacionOficial o2) {
		int compare = 0;

		if (o1 != null && o2 != null) {
			compare = o1.getPuntosObtenidos().compareTo(o2.getPuntosObtenidos());
		}
		return compare;
	}

}
