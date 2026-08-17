
package java_basics;
import java.util.*;

public class palindrome_no {
	void palindrome(int n)
	{
		int original=n;
		int reversed=0;
		while(n!=0)
		{
			int d=n%10;
			reversed=reversed*10+d;
			n=n/10;
		}
		if(original==reversed)
		{
			System.out.println("Its a palindrome number");
		}
		else
		{
			System.out.println("Not a palindrome number");
		}
		
		
	}
	public static void main(String[] args)
	{
		palindrome_no test=new palindrome_no();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		test.palindrome(num);
		sc.close();
	}

}
