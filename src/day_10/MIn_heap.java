package day_10;

import java.util.PriorityQueue;

public class MIn_heap {
	public static void main(String[] args) {
		int[] numbers= {10,5,20,8,15,30,25};
		int k=3;
		PriorityQueue<Integer> minheap=new PriorityQueue<>();
		for(int number:numbers) {
			minheap.add(number);
			if(minheap.size()>k) {
				minheap.poll();
			}
		}
		System.out.println("Top "+k+" largest numbers:");
		while(!minheap.isEmpty()) {
			System.out.println(minheap.poll());}
		}

}
