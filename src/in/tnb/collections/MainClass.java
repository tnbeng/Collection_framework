package in.tnb.collections;

import java.util.HashMap;
import java.util.LinkedList;

public class MainClass {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1,"Tarak");
		map.put(2,"Nath");
		map.put(3,"Bar");
		System.out.println(map);
		String name=map.get(2);
		System.out.println(name);
		System.out.println(map.containsKey(1));
		map.replace(2, "nath");
		System.out.println(map);
	}

}
