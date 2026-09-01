package day_10;

import java.util.PriorityQueue;


public class Median_in_heap {
	public static void main(String[] args) {
		int[] numbers = {10,5,20,8,15,30,25};

	
		PriorityQueue<Integer> minheap = new PriorityQueue<>();  
		for (int number : numbers) {
			
			minheap.add(number);
		}
		int n = numbers.length;
		int[] sorted = new int[n];
		for (int i = 0; i < n; i++) {
			sorted[i] = minheap.poll();
		}

		double median = (n % 2 == 1) ? sorted[n/2] : (sorted[n/2 - 1] + sorted[n/2]) / 2.0;
		System.out.println("Median: " + median);
	}
}