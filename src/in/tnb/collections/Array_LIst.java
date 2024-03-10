package in.tnb.collections;

import java.util.ArrayList;

public class Array_LIst {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		ArrayList list1=new ArrayList();
		
		list.add(100);
		list.add("Tarak");
		list.add('a');
		list.add(true);
		System.out.println(list);
		
		list1.add(100);
		list1.add("Tarak Nath Bar");
		list1.add('a');
		list1.add(true);
		list1.add(list);
		
		System.out.println(list1);
		
	}

}
