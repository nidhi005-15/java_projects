package day_4;
import java.util.*;
public class days_in_a_week {
	static char ch;
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	do {
	System.out.print("Enter a number to display the day of the week:");
	int ch=sc.nextInt();
	switch(ch)
	{
	case 1:
		System.out.println("Sunday");
		break;
	case 2:
		System.out.println("Monday");
		break;
	case 3:
		System.out.println("Tuesday");
		break;
	case 4:
		System.out.println("Wednesay");
		break;
	case 5:
		System.out.println("Thursday");
		break;
	case 6:
		System.out.println("Friday");
		break;
	case 7:
		System.out.println("Saturday");
		break;
	default:
		System.out.println("Invalid choice(enter a number between 1 to 7)");
		break;
	}
	System.out.println("wish to continue:(y/n)");
	ch=sc.next().charAt(0);
		
	}while(ch=='y');
	if(ch=='n')
		System.exit(0);
	sc.close();
	
	
}
}	