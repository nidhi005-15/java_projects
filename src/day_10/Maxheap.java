package day_10;

import java.util.Collections;
import java.util.PriorityQueue;

public class Maxheap {
	public static void main(String[] args) {
		int[] numbers= {10,5,20,8,15,30,25};
		int k=3;
		PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
		for(int number:numbers) {
			maxheap.add(number);
			if(maxheap.size()>k) {
				maxheap.poll();
			}
		}
		System.out.println("Top "+k+" smallest numbers:");
		while(!maxheap.isEmpty()) {
			System.out.println(maxheap.poll());}
		}

}
