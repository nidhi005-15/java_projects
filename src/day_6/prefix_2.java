package day_6;

public class prefix_2 {
	public static void main(String[] args) {
		int[] expenses= {65,85,95,45,75};
		
		int[] prefixsum=new int[expenses.length];
		prefixsum[0]=expenses[0];
		for(int i=1;i<expenses.length;i++) {
			prefixsum[i]=prefixsum[i-1]+expenses[i];
		}
		int sum=prefixsum[3]-prefixsum[0];
		System.out.println("total spent: "+sum);
	}

}
