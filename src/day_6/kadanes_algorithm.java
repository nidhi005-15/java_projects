//used to find the max sum of a continuous sub array in an array
//it finds the continuous group of numbers that gives the highest total
//keep adding array elements and print the highest total
package day_6;
public class kadanes_algorithm {
	public static void main(String[] args) {
		int[] numbers= {5,3,-2,4,-10,6,2};
		int currentprofit=0;
		int bestprofit=0;
		for(int i=0;i<numbers.length;i++) {
			currentprofit=currentprofit+numbers[i];
			if(currentprofit>bestprofit) {
				bestprofit=currentprofit;
			}
		}
		System.out.println("maximum profit: "+bestprofit);
		
	}

}
