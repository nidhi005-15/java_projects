package day_6;

public class kadane_2 {
	public static void main(String[] args) {
		int[] numbers= {5,3,-2,4,-10,6,2};
		int currentprofit=0;
		int bestprofit=0;
		int start=0;
		int beststart=0;
		int bestend=0;
		for(int i=0;i<numbers.length;i++) {
			currentprofit=currentprofit+numbers[i];
			if(currentprofit>bestprofit) {
				bestprofit=currentprofit;
				beststart=start;
				bestend=i;
			}
			if(currentprofit<0) {
				currentprofit=0;
				start=i+1;
			}
		}
		int length = bestend - beststart + 1;
		System.out.println("maximum profit: " + bestprofit);
		System.out.println("number of elements in subarray: " + length);
		System.out.println("subarray starts at index " + beststart + " and ends at index " + bestend);
		}
}
