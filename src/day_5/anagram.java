//checking for length
//case sensitive
//listen becomes silent
package day_5;
import java.util.*;
public class anagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string:");
		String s1=sc.nextLine();
		System.out.println("enter a string:");
		String s2=sc.nextLine();
		char[] a=s1.toCharArray();
		char[] b=s2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		if(Arrays.equals(a,b)) {
			System.out.println("anagram");
		}else {
			System.out.println("not anagram");
		}
	}
}
