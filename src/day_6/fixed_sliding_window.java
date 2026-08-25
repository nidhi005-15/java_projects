package day_6;

public class fixed_sliding_window {
	public static void main(String[] args) {
		int [] numbers= {10,20,30,40,50};
		int windowsize=3;
		
		for(int start =0;start<=numbers.length-windowsize;start++) {
			int sum=0;
			for(int i=start;i<start+windowsize;i++) {
				sum=sum+numbers[i];
			}
			System.out.println("sum:"+sum);
		}
	}
}
