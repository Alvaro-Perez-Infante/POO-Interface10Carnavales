package model;

import java.util.Comparator;

/**
 * <h2>Clase Comparator de Agrupacion.</h2>
 * 
 * @version 13.0
 * @author &Aacute;lvaro P&eacute;rez Infante
 */
public class CompAgrupacionMusLet implements Comparator<Agrupacion> {

	/**
	 * M&eacute;metodo que usamos para comprar dos agrupaciones distintas en
	 * funci&oacute;n al Autor de la M&uacute;sica de cada una y a el Autor de las
	 * Letras tambi&eacute;.
	 */
	@Override
	public int compare(Agrupacion o1, Agrupacion o2) {
		int compare = 0;

		if (o1 != null && o2 != null) {
			compare = o1.getAutorMusica().compareTo(o2.getAutorMusica());
			if (compare == 0) {
				compare = o1.getAutorLetras().compareTo(o2.getAutorLetras());
			}
		}
		return compare;
	}

}
