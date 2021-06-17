package collections;

import java.util.ArrayDeque;

public class ArrayDequeueClass {
		//Synchronised, thread safe
	public static void main(String[] args) {
		ArrayDeque<Integer> q = new ArrayDeque<Integer>();
		q.add(5);
		q.add(44);
		q.add(43);
		q.add(456);
		q.add(0);
		System.out.println("q : " + q);
		q.add(44);
		q.addFirst(3);
		q.addLast(2);
		q.add(2);
		System.out.println("q : " + q);
		q.pollFirst();
		q.pollLast();
		q.removeLastOccurrence(44);
		System.out.println("q : " + q);
	}

}
