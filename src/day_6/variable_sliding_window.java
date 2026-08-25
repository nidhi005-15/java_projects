package day_6;

public class variable_sliding_window {
	public static void main(String[] args) {
		int [] numbers= {2,3,1,2,4,3};
		int target=7;
		int start=0;
		int sum=0;
		int minlength=numbers.length;
		//end grows the window size every iteration and adding every element
		for(int end =0;end<numbers.length;end++) {
			sum=sum+numbers[end];
			//decreasing the window size while the condition stays true
			while(sum>=target) {
				int length=end-start+1;//current window length
				if(length<minlength) {//finding smallest window length
					minlength=length;
				}
				sum=sum-numbers[start];//remove starting numbers 
				start++;               //move the sliding window 
			}
		}
		System.out.println("smallest window size length="+minlength);
	}

}
