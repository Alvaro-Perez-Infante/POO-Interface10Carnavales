package model;

import java.util.Comparator;

/**
 * <h2>Clase Comparator de Agrupacion.</h2>
 * 
 * @version 15.0
 * @author &Aacute;lvaro P&eacute;rez Infante
 */
public class CompAgrupacionAutor implements Comparator<Agrupacion>{

	/**
	 * M&eacute;metodo que usamos para comprar dos agrupaciones distintas en
	 * funci&oacute;n al autor de cada una.
	 */
	@Override
	public int compare(Agrupacion o1, Agrupacion o2) {
		int compare = 0;
		
		if(o1 != null && o2 != null) {
			compare = o1.getAutor().compareTo(o2.getAutor());
		}
		return compare;
	}

}
