package com.technoelevate.hashsetsortoperation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class FamilyCollection {

	public static void main(String[] args) {
		HashSet<Family> set=new HashSet<Family>();
		set.add(new Family("Vaijinath","Father", 48));
		set.add(new Family("VarshaRani","Mother", 45));
		set.add(new Family("Suvarna","Sister", 27));
		set.add(new Family("Usha","Sister",25));
		set.add(new Family("Kishor","Brother", 20));
		set.add(new Family("Mallinath","GrandFather", 60));
		set.add(new Family("Nagamma","GrandMother", 56));
		set.add(new Family("Ganesh","I", 22));
		ArrayList<Family> list=new ArrayList<Family>(set);
		System.out.println(list);
		System.out.println("===========Using Comparable Method=============");
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println("============Using Comparator Method============");
		ComparatorFamily gk=new ComparatorFamily();
		Collections.sort(list,gk);
		System.out.println(list);

	}

}
