package collections;

import java.util.LinkedHashSet;

public class LinkedHashSetClass {

	//Maintains insertion order
	//Contains unique elements
	
	public static void main(String[] args) {
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		set.add(9);
		set.add(4);
		set.add(12);
		set.add(2);
		set.add(5);
		System.out.println("Set : " + set);
		set.add(4);
		set.add(55);
		System.out.println("Set : " + set);
	}

}
