package day_4;
import java.util.*;

public class simple_calculator {
	static char ch;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=10,b=20;
		do {
		System.out.println("1. addition 2. subtraction 3. multiplication 4.division");
		System.out.print("enter your choice:");
		int choice=sc.nextInt();
		
		
		switch(choice) {
		
		case 1:
			System.out.println(" Sum:"+(a+b));
			break;
		case 2:
			System.out.println(" difference:"+(a-b));
			break;
		case 3:
			System.out.println(" product:"+(a*b));
			break;
		case 4:
			System.out.println(" quotient:"+(a/b));
			break;
		default:
			System.out.println("wrong choice: enter any number between1 and 4");
			break;
			
		
		}
		System.out.println("wish to continue:(y/n)");
		 ch=sc.next().charAt(0);
		}while(ch=='y');
		if(ch=='n')
		{
			System.exit(0);
		}
		sc.close();
	}

}
