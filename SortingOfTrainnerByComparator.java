package com.technoelevate.assignmentd0811;

import java.util.Comparator;

public class SortingOfTrainnerByComparator implements Comparator<SortingOfTrainner> {

	@Override
	public int compare(SortingOfTrainner o1, SortingOfTrainner o2) {
		return o2.experience.compareTo(o1.experience);
	}

	
	
	
}
