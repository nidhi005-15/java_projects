package day_6;

public class Array_2_pointer {
	public static void main(String[] args) {
		int [] numbers= {40,80,60,40,50};
		int target=80;
		int left=0;
		int right=numbers.length-1;
		while(left<right) {
			int sum=numbers[left]+numbers[right];
			if(sum==target) {
				System.out.println("numbers found: "+numbers[left]+" and "+numbers[right]);
				break;
			}
			else if(sum<target) {
				left++;
			}
			else {
				right--;
			}
		}
	}
}
