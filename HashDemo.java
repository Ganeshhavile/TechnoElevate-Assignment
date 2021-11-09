package com.technoelevate.basicsjava.collectionarraylist.arraylistiteration;

import java.util.HashSet;
import java.util.Iterator;

public class HashDemo {

	public static void main(String[] args) {
		HashSet hasset=new HashSet();
		hasset.add(5);
		hasset.add(10);
		hasset.add(10);
		hasset.add("Hello");
		hasset.add("Ganesh");
		System.out.println(hasset);
		System.out.println("Size of hasset is "+hasset.size());
		System.out.println("=========for each loop===============");
		for (Object object : hasset) {
			System.out.println(object);
		}
		System.out.println("=============using for loop================");
		for (int i=0;i<hasset.size();i++) {
			System.out.println(hasset);
			
		}
		System.out.println("============using Iterator ================");
		Iterator iterator= hasset.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		//System.out.println("==============Using Iterator backword===================");
		//Iterator iterator1=hasset.iterator();
		//while (iterator.has)
		
	}

}
