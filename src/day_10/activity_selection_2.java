package day_10;

public class activity_selection_2{
	public static void main(String[] args) {
		int[] arrival= {9,9,10,10,11};
		int[] departure= {10,11,10,11,12};
		int lastend = departure[0];
		System.out.println("Trains selected:A");
		for(int i=0;i<arrival.length;i++) {
			if(arrival[i]>=lastend) {
				System.out.println("Trains selected:"+(char)('A'+i));
				lastend=departure[i];
			}
		}
	}
}
