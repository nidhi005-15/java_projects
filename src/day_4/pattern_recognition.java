package day_4;

import java.util.HashSet;

public class pattern_recognition {
	public static void main(String[] args) {
		int [] numbers= {10,20,30,20,40};
		HashSet<Integer> x=new HashSet<Integer>();
		for(int a:numbers) {
			if(x.contains(a)) {
				System.out.println("duplicate:"+a);
			}
			else
			{
				x.add(a);
			}
		}
	}
	}
