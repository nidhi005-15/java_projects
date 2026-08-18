package day_2;
import java.util.*;

public class armstrong_no {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		int original=n;
		int arg=0;
		while(n!=0)
		{
			int d=n%10;
			arg=arg+(d*d*d);
			n=n/10;
		}
		if(arg==original)
		{
			System.out.println("It is an armstrong number");
		}
		else
			System.out.println("It is an armstrong number");
		
	}
	
	
	
}
