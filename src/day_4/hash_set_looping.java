package day_4;
import java.util.*;
	

public class hash_set_looping {
	public static void main(String[] args) {
		HashSet<Integer> num =new HashSet<Integer>();
		int[] numbers= {10,20,30,40,50};
		for(int number:numbers)
		{
			num.add(number);
		}
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


