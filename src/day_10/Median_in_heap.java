package day_10;

import java.util.PriorityQueue;
import java.util.Collections;

public class Median_in_heap {
	public static void main(String[] args) {
		int[] numbers = {10,5,20,8,15,30,25};

		PriorityQueue<Integer> lowerHalf = new PriorityQueue<>(Collections.reverseOrder()); // max-heap
		PriorityQueue<Integer> upperHalf = new PriorityQueue<>();                            // min-heap

		for (int number : numbers) {
			// step 1: add to the correct half
			if (lowerHalf.isEmpty() || number <= lowerHalf.peek()) {
				lowerHalf.add(number);
			} else {
				upperHalf.add(number);
			}

			// step 2: rebalance so sizes never differ by more than 1
			if (lowerHalf.size() > upperHalf.size() + 1) {
				upperHalf.add(lowerHalf.poll());
			} else if (upperHalf.size() > lowerHalf.size() + 1) {
				lowerHalf.add(upperHalf.poll());
			}

			// step 3: compute current median
			double median;
			if (lowerHalf.size() == upperHalf.size()) {
				median = (lowerHalf.peek() + upperHalf.peek()) / 2.0;
			} else if (lowerHalf.size() > upperHalf.size()) {
				median = lowerHalf.peek();
			} else {
				median = upperHalf.peek();
			}
			System.out.println("After adding " + number + ", median = " + median);
		}
	}
}