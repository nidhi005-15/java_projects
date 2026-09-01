package day_10;

public class Activity_selection {
	public static void main(String[] args) {
		int[] start= {1,2,3,6,7};
		int[] end= {3,4,5,7,8};
		int lastend = end[0];
		System.out.println("Patient appointment:A");
		for(int i=0;i<start.length;i++) {
			if(start[i]>=lastend) {
				System.out.println("Patient appointment:"+(char)('A'+i));
				lastend=end[i];
			}
		}
		
		
	}

}
