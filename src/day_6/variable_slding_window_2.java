package day_6;

public class variable_slding_window_2 {
	public static void main(String[] args) {
		int [] numbers= {2,3,1,2,4,3};
		int target=7;
		int minlength=numbers.length;
		for(int start =0;start<numbers.length;start++) {
			int sum=0;
			for(int end =start;end<numbers.length;end++) {
				sum=sum+numbers[end];
					if(sum>=target) {
					int length=end-start+1;
					if(length<minlength) {
						minlength=length;
					}
				   break;            
			}
		}}
		System.out.println("smallest window size length="+minlength);
		}}



