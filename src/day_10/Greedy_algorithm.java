package day_10;

import java.util.ArrayList;
import java.util.Collections;

public class Greedy_algorithm {
	public static void main(String[] args) {
		ArrayList<Integer> slices=new ArrayList<>();
		slices.add(3);
		slices.add(5);
		slices.add(1);
		slices.add(7);
		slices.add(8);
		System.out.println(slices);
		while(!slices.isEmpty()) {
			int biggest=Collections.max(slices);
			System.out.println("The biggest slice:"+biggest);
			slices.remove(Integer.valueOf(biggest));
			
		}
		
		
	}

}
