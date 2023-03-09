package model;

import java.util.Comparator;

public class CompAgrupacionNombre implements Comparator<Agrupacion>{

	@Override
	public int compare(Agrupacion o1, Agrupacion o2) {
		int compare = 0;
		if (o1 != null && o2 != null) {
			compare = o1.getNombre().compareTo(o2.getNombre());
		}
		return compare;
	}

}
