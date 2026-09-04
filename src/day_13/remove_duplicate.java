package day_13;

import java.util.HashSet;
import java.util.Set;

public class remove_duplicate {
	public static void main(String[] args) {
		int [] arr= {1,1,2,2,3,3};
		Set<Integer> set=new HashSet<>();
		for(int num:arr) {
			set.add(num);
		}
		System.out.println("number of unique elements:"+set.size());
		
	}

}
