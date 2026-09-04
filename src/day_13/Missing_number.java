package day_13;
public class Missing_number {
	public static void main(String[] args) {
		int[] arr= {3,0,1};
		int sum=0;
		int n=arr.length;
		int exp_sum=n*(n+1)/2;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
			}
		System.out.println("missing number:"+(exp_sum-sum));
	}
}
