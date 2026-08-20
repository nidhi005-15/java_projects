package day_4;
import java.util.*;

public class array_list {
	public static void main(String[] args) {
		ArrayList list= new ArrayList();
		System.out.println("Initial size before adding elements:"+list.size());
		System.out.println("array list is empty before adding values:"+list.isEmpty());
		System.out.println("contents of array list before adding values:"+list);
		list.add("C");
		list.add("A");
		list.add("B");
		list.add("D");
		list.add("E");
		list.add("F");
		list.add(null);
		System.out.println("Array list size after adding elements:"+list.size());
		System.out.println("array list is empty after adding values:"+list.isEmpty());
		System.out.println("contents of array list after adding values:"+list);
		boolean b1=list.contains("E");
		System.out.println("Value E is present:"+b1);
		boolean b2=list.contains("R");
		System.out.println("Value R is present:"+b2);
		list.remove("b");
		System.out.println("Array list size after adding elements:"+list.size());
		System.out.println("contents of array list after adding values:"+list);
		list.clear();
		System.out.println("Array list size after adding elements:"+list.size());
		System.out.println("contents of array list after adding values:"+list);
}
}

