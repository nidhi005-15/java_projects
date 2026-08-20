package day_4;
import java.util.*;
	

public class hash_set_looping {
	public static void main(String[] args) {
		HashSet<Integer> num =new HashSet<Integer>();
		num.add(10);
		num.add(20);
		num.add(30);
		int target = 10;
		if(num.contains(target)) {
        	System.out.println("found");
        }
        else
        {
        	System.out.println("not found");
		        
	    }
	}
}


