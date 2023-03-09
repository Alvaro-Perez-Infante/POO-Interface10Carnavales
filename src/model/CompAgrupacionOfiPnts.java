package model;

import java.util.Comparator;

public class CompAgrupacionOfiPnts implements Comparator<AgrupacionOficial>{

	@Override
	public int compare(AgrupacionOficial o1, AgrupacionOficial o2) {
		int compare = 0;
		
		if(o1 != null && o2 != null) {
			compare = o1.getPuntosObtenidos().compareTo(o2.getPuntosObtenidos());
		}
		return compare;
	}

}
