package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListClass {

	public static void main(String[] args) {
		List values = new ArrayList();
		values.add(1);
		values.add("anu");
		values.add(15.985);
		values.add(0, "abcd");
		System.out.println(values);
		
		List<String> fruits = new ArrayList<String>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Pineapple");
		fruits.add("Grapes");
		fruits.add("Banana");
		fruits.sort(null);
		String[] fruitArray = fruits.toArray(new String[fruits.size()]);	
		System.out.print("To array : ");
		for(int i=0; i<fruitArray.length; i++)
			System.out.print(fruitArray[i] + " ");
		System.out.println();
		
		List<Integer> list = new ArrayList<Integer>();
		//ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(1, 2);
		System.out.println("list = " + list);
		List<Integer> list1 = new ArrayList<Integer>();
		list1.addAll(list);
		System.out.println("Size of list1 : " + list1.size());
		System.out.println("Class of list1 : " + list1.getClass().getName());
		list.clear();
		System.out.println("list = " + list);
		System.out.println("list1 = " + list1);
		list.addAll(list1);
		System.out.println("list = " + list);
		System.out.println("list[0] = " + list.get(0) + ", list[1] = " + list.get(1) + ", list[1] = " + list.get(2));
		System.out.println("list.contains(list1) : " + list.containsAll(list1));
		System.out.println("list.contains(2) : " + list.contains(2));
		System.out.println("list.equals(list1) : " + list.equals(list1));
		System.out.println("list.hashCode() : " + list.hashCode());
		System.out.println("list.indexOf(5) : " + list.indexOf(5));
		System.out.println("list.indexOf(3) : " + list.indexOf(3));
		System.out.println("list.isEmpty() : " + list.isEmpty());
		list1.clear();
		System.out.println("list1.isEmpty() : " + list1.isEmpty());
		list.remove(1);
		System.out.println("list : " + list);
		System.out.println("list.remove(3) : " + list.remove(1));
		System.out.println("list : " + list);
		System.out.println("list.toString() : " + list.toString());
		list.set(0, 5);
		list.add(4);
		list.add(2);
		list.add(1);
		list.add(2, 3);
		list.add(0);
		System.out.println("list : " + list);
		list.sort(null);
		System.out.println("list : " + list);
		list1.add(0);
		list1.add(22); 
		System.out.println("list1 : " + list1);
		System.out.println("list.retainAll(list1) : " + list.retainAll(list1)); //returns true if list is modified
		System.out.println("list : " + list);
		list.add(5);
		list.add(5);
		System.out.println("list : " + list);
		System.out.println("list.lastIndexOf(5) : " + list.lastIndexOf(5));
		System.out.print("Iterator : ");
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext())
			System.out.print(iterator.next() + " ");
		System.out.println();
		System.out.print("ListIterator : ");
		Iterator<Integer> listIterator = list.listIterator(1);
		while(listIterator.hasNext())
			System.out.print(listIterator.next() + " ");
		System.out.println();
		list.sort(null);
		System.out.println(list);
	}
}
