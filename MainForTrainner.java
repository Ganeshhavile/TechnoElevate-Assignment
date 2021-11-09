package com.technoelevate.assignmentd0811;

import java.util.ArrayList;
import java.util.Collections;

public class MainForTrainner {

	public static void main(String[] args) {
		
		ArrayList<SortingOfTrainner> list = new ArrayList<SortingOfTrainner>();
		list.add(new SortingOfTrainner("Bharat Sir", 77, "15 Year"));
		list.add(new SortingOfTrainner("Rudra Sir", 45, "08 Year"));
		list.add(new SortingOfTrainner("Deepti Mam", 18, "11 Year"));
		list.add(new SortingOfTrainner("Megha Mam", 97, "02 Year"));

		System.out.println(list);
		System.out.println("============== After Sort =======================");
		Collections.sort(list);
		System.out.println(list);
		
		
		System.out.println("================== Comparator Method ===================================");
		SortingOfTrainnerByComparator obj = new SortingOfTrainnerByComparator();
		Collections.sort(list,obj);
		System.out.println(list);
	}

}
