package collections;

import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(5);
		set.add(1);
		set.add(77);
		set.add(22);
		set.add(0);
		System.out.println("Set : " + set);
		set.add(0);
		set.add(8);
		System.out.println("Set : " + set);
	 	System.out.println("set.ceiling(60) : " + set.ceiling(60));
	 	System.out.println("set.descendingSet() : " + set.descendingSet());
	 	System.out.println("set.floor(60) : " + set.floor(60));
	 	System.out.println("set.first() : " + set.first());
	 	System.out.println("set.last() : " + set.last());
	 	System.out.println(set.pollFirst() + " is deleted.");
	 	System.out.println(set.pollLast() + " is deleted.");
		System.out.println("Set : " + set);
		System.out.println("set.higher(1) : " + set.higher(1));
		System.out.println("set.higher(77) : " + set.higher(77));
	}

}
