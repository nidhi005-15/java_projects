package java_basics;
import java.util.*;

public class string_to_char_array_sorted_order {
	     public static void main(String[] args) {
			System.out.println("enter a string");
			Scanner sc=new Scanner(System.in);
			String input=sc.next();
			char [] ch=input.toCharArray();
			Arrays.sort(ch);
			System.out.print(new String(ch));
			sc.close();
		}

	}
	/*for(char c:ch){
	 * System.out.print(c);
	 * or
	 * regular for loop
	 * */
	  



