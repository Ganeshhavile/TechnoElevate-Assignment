package com.technoelevate.basicjava.collection.myownimplimentation;

import java.util.Iterator;

public class MainMethodGaneshArrayList {

	public static void main(String[] args) {
		ArrayListGanesh arraylist=new ArrayListGanesh(5);
		arraylist.add("Employ Name: Ganesh Havile");
		arraylist.add("Employ Id: ABC0799");
		arraylist.add("Employ Phone No: 9637731476");
		arraylist.add("Employ Salary: 30000");
		arraylist.add("Employee location: Bangalore");
		arraylist.add("Employee mailid: er.ganeshhavile@gmail.com");
		arraylist.add("Employee Salary Account: Saving Account");
		arraylist.add("Employee Account No: 12345678919");
		System.out.println(arraylist.get(0));
		System.out.println(arraylist.get(1));
		System.out.println(arraylist.get(2));
		System.out.println(arraylist.get(3));
		System.out.println(arraylist.size());
		Iterator iterator=arraylist.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
	}

}
