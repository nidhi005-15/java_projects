package day_12;


public class Stock_prices {
	public static void main(String[] args) {
		int[] arr= {7,1,5,3,6,4};
		int min=arr[0];
		int maxp=0;
		for(int i=0;i<arr.length;i++) {
			maxp=Math.max(maxp,arr[i]-min);
			min=Math.min(min,arr[i]);
			
			}
		System.out.println("maximum profit:"+maxp);
		}
}

