package day_6;

public class demo_total {
	public static void main(String[] args) {
		int[] marks= {65,75,85,95,45};
		int currentmarks=0;
		int bestmarks=0;
		for(int i=0;i<marks.length;i++) {
			currentmarks=currentmarks+marks[i];
			if(currentmarks>bestmarks) {
				bestmarks=currentmarks;
			}
		}
		System.out.println("maximum marks: "+bestmarks);
		}
		
	}


