package day_9;

import java.util.PriorityQueue;

class patient{
	String name;
	int priority;
	patient(String name,int priority){
		this.name=name;
		this.priority=priority;
	}
}

public class Priority_queue {
	public static void main(String[] args) {
		PriorityQueue<patient> queue=new PriorityQueue<>((p1,p2)->p1.priority-p2.priority);
		queue.add(new patient("Anand",2));
		queue.add(new patient("Rahul",3));
		queue.add(new patient("Priya",8));
		queue.add(new patient("John",6));
		while(!queue.isEmpty()) {
			patient p=queue.poll();
			System.out.println(p.name+" -Priority "+p.priority);
		}
	
		
	}

}
