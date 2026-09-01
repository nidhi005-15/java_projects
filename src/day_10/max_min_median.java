package day_10;

import java.util.PriorityQueue;
import java.util.Collections;

public class max_min_median {
	public static void main(String[] args) {
		int[] numbers = {10,5,20,8,15,3,25};

		PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> minheap = new PriorityQueue<>();

		for (int number : numbers) {
			maxheap.add(number);
			minheap.add(number);
		}

		int max = maxheap.peek();
		int min = minheap.peek();

		System.out.println("Max: " + max);
		System.out.println("Min: " + min);

		// for median, pull out sorted order using minheap (poll always gives smallest first)
		int n = numbers.length;
		int[] sorted = new int[n];
		for (int i = 0; i < n; i++) {
			sorted[i] = minheap.poll();
		}

		double median = (n % 2 == 1) ? sorted[n/2] : (sorted[n/2 - 1] + sorted[n/2]) / 2.0;
		System.out.println("Median: " + median);
	}
}