package collections;

import java.util.HashSet;

public class HashSetClass {

	//Does not maintain insertion order
	//Contains only unique elements
	
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(255);
		set.add(39);
		set.add(4);
		set.add(15);
		System.out.println("Set : " + set);
		set.add(4);
		set.add(99);
		System.out.println("Set : " + set);
	}
}
