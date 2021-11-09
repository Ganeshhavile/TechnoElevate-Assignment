package com.technoelevate.assignmentd0811;

public class SortingOfTrainner implements Comparable<SortingOfTrainner> {

	String name;
	int id;
	String experience;
	public SortingOfTrainner(String name, int id, String experience) {
		this.name = name;
		this.id = id;
		this.experience = experience;
	}
	
	@Override
	public int compareTo(SortingOfTrainner o) {
		return this.experience.compareTo(o.experience);
	}
	
	@Override
	public String toString() {
		return "SortingOfTrainner [name=" + name + ", id=" + id + ", experience=" + experience + "]";
	}
	
	
	
	
}
