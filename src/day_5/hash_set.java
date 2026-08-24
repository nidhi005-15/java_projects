package day_5;
import java.util.*;
//no duplicate values
// can add null values

public class hash_set {
	public static void main(String[] args) {
			HashSet num =new HashSet();
			num.add("C");
			num.add("A");
			num.add("E");
			num.add("B");
			num.add("D");  
			num.add("F");
			num.add(null);
			System.out.println(" size of hashset before adding elements:"+num.size());
			System.out.println(" hashset is empty before adding values:"+num.isEmpty());
			System.out.println("contents of hashset before adding values:"+num);
			boolean b1=num.contains("E");
			System.out.println("Value E is present:"+b1);
			boolean b2=num.contains("R");
			System.out.println("Value R is present:"+b2);
			num.remove("B");
			System.out.println(" size of hashset after deletion:"+num.size());
			System.out.println("contents of hashset after deletion:"+num);
			num.clear();
			System.out.println(" size of hashset after clearing:"+num.size());
			
			
			
	}
}
			
			


