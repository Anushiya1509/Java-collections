package collections;

import java.util.HashMap;

public class HashMapClass {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		System.out.println("map.isEmpty() : " + map.isEmpty());
		System.out.println("map.putIfAbsent(5, \"xyz\") : " + map.putIfAbsent(5, "xyz"));
		System.out.println("map : " + map);
		System.out.println("map.putIfAbsent(7, \"jkl\") : " + map.putIfAbsent(7, "jkl"));
		System.out.println("map : " + map);
		System.out.println("map.putIfAbsent(6, \"ght\") : " + map.putIfAbsent(6, "ght"));
		System.out.println("map : " + map);
		map.put(3, "anu");
		System.out.println("map : " + map);
		System.out.println("map.putIfAbsent(3, \"abc\") : " + map.putIfAbsent(3, "abc"));
		System.out.println("map : " + map);
		System.out.println("map.putIfAbsent(1, \"bcd\") : " + map.putIfAbsent(1, "bcd"));
		System.out.println("map : " + map);
		System.out.println("map.containsKey(9) : " + map.containsKey(9));
		System.out.println("map.containsKey(1) : " + map.containsKey(1));
		System.out.println("map.remove(4) : " + map.remove(4));
		System.out.println("map.remove(6) : " + map.remove(6));
		System.out.println("map : " + map);
		System.out.println("map.remove(24, \"fgd\") : " + map.remove(24, "fgd"));
		System.out.println("map.remove(1, \"bcd\") : " + map.remove(1, "bcd"));
		System.out.println("map : " + map);
		System.out.println("map.size() : " + map.size());
		System.out.println("map.get(5) : " + map.get(5));
	}

}
