package day_2;
import java.util.*;
public class reverse_string {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string:");
		String str=sc.next();
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("reversed:"+rev);
	}

}
