package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeClass {

	public static void main(String[] args) {
		Deque<Integer> dq = new ArrayDeque<Integer>();
		dq.add(4);
		dq.add(33);
		dq.add(-24);
		dq.add(342);
		System.out.println("dq: " + dq);
		dq.addFirst(87);
		System.out.println("dq: " + dq);
		dq.addLast(209);
		System.out.println("dq: " + dq);
		dq.poll();
		System.out.println("dq: " + dq);
	}

}
