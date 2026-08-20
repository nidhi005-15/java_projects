package day_4;
import java.util.*;

public class sum_till_n {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		int sum=0;
		for(int i=n;i>=0;i--)
		{
			sum=sum+i;
		}
		System.out.println("sum:"+sum);
		sc.close();
	}
}
