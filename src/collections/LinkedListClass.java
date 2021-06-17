package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListClass {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(5);
		list.add(10);
		list.add(1);
		list.add(7);
		list.add(3);
		System.out.println("List : " + list);
		list.add(3, 9);
		System.out.println("List : " + list);
		System.out.println("list.contains(3) : " + list.contains(3));
		System.out.println("list.contains(8) : " + list.contains(8));
		System.out.println("list.hashCode() : " + list.hashCode());
		System.out.println("list.indexOf(3) : " + list.indexOf(3));
		System.out.println("list.indexOf(8) : " + list.indexOf(8));
		System.out.println("list.isEmpty() : " + list.isEmpty());
		List<Integer> list1 = new LinkedList<Integer>();
		System.out.println("list1 : " + list1);
		System.out.println("list1.isEmpty() : " + list1.isEmpty());
		System.out.println("list.equals(list) : " + list.equals(list));
		list1.addAll(list);
		System.out.println("list1 : " + list1);
		System.out.println("list.equals(list) : " + list.equals(list));
		System.out.println("list.toString() : " + list.toString());
		System.out.println("list.get(5) : " + list.get(5));
		System.out.println("list.getClass().getName() : " + list.getClass().getName());
		list.add(10);
		System.out.println("List : " + list);
		System.out.println("list.indexOf(10) : " + list.indexOf(10));
		System.out.println("list.lastIndexOf(10) : " + list.lastIndexOf(10));
		System.out.println("list.remove(6) : " + list.remove(6));
		System.out.println("List : " + list);
		System.out.println("list.set(0, 1) : " + list.set(0, 1));
		System.out.println("List : " + list);
		list.sort(null);
		System.out.println("List : " + list);
		list1.clear();
		System.out.println("List1 : " + list1);
		System.out.println("list.size() : " + list.size());
		list1 = list.subList(3,6); // endIndex(6) is exclusive
		System.out.println("List1 : " + list1);
		System.out.print("Iterator : ");
		Iterator<Integer> i = list.iterator();
		while(i.hasNext())
			System.out.print(i.next() + " ");
		System.out.println();
		System.out.print("ListIterator : ");
		Iterator<Integer> listIterator = list.listIterator(1);
		while(listIterator.hasNext())
			System.out.print(listIterator.next() + " ");
		System.out.println();
	}

}
