package day_4;

public class highest {
	public static void main(String[] args) {
		int [] marks= {78, 65, 89, 92, 71};
		int high=marks[0];
		for(int i=0;i<marks.length;i++) {
			if(marks[i]>high)
				high=marks[i];
		}
		System.out.print("highest marks:"+high);

}
}