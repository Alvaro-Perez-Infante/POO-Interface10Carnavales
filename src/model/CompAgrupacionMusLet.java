package model;

import java.util.Comparator;

public class CompAgrupacionMusLet implements Comparator<Agrupacion>{

	@Override
	public int compare(Agrupacion o1, Agrupacion o2) {
		int compare = 0;
		
		if(o1 != null && o2 != null) {
			compare = o1.getAutorMusica().compareTo(o2.getAutorMusica());
			if(compare == 0) {
				compare = o1.getAutorLetras().compareTo(o2.getAutorLetras());
			}
		}
		return compare;
	}

}
