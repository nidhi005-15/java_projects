package day_6;

public class Semo_2 {
public static void main(String[] args) {
	int[] numbers= {200,100,150,300,250};
	int max_sum=0;
	int windowsize=3;
	
	for(int start =0;start<=numbers.length-windowsize;start++) {
		int sum=0;
		for(int i=start;i<start+windowsize;i++) {
			sum=sum+numbers[i];
		}
		
		if(sum>max_sum) {
			max_sum=sum;
		}
		
}
	System.out.println("sum:"+max_sum);
}
}