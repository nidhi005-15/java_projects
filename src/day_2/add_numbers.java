package day_2;
import java.util.*;

public class add_numbers {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		int num=n;
		int sum=0;
		while(n!=0)
		{

			int d=n%10;
			sum=sum+d;
			n=n/10;
		}
		System.out.println("sum:"+sum);
	}

}
