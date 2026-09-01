package day_10;


import java.util.PriorityQueue;

public class min_heap_2 {
	public static void main(String[] args) {
		PriorityQueue<Integer> minheap=new PriorityQueue<>();
		
		minheap.add(30);
		minheap.add(10);
		minheap.add(20);
		minheap.add(50);
		System.out.println("min heap:"+minheap);
		System.out.println("smallest element:"+minheap.peek());
		
		

		
	
	}
}
