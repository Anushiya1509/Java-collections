package collections;

import java.util.PriorityQueue;

public class QueueClass {
		//FIFO
	public static void main(String[] args) {
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		q.add(1);
		q.add(5);
		q.add(3);
		q.add(0);
		q.add(2);
		System.out.println("q : " + q);
		q.offer(55);
		System.out.println("q : " + q);
		System.out.println("q.peek() : " + q.peek());
		System.out.println("q : " + q);
		System.out.println("q.poll() : " + q.poll());
		System.out.println("q : " + q);
		System.out.println("q.remove() : " + q.remove());
		System.out.println("q : " + q);
		System.out.println("q.remove(3) : " + q.remove(3));
		System.out.println("q : " + q);
		System.out.println("q.element() : " + q.element());
		System.out.println("q : " + q);
		System.out.println(q.size());
	}

}
