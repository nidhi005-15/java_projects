package day_1;
import java.util.*;


public class assignment_1 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Create  2.Display  3.Raise salary  4.Exit ");
		System.out.print("Enter your choice:");
		int choice=sc.nextInt();
		String name = null; 
		int age = 0;
		String desgn = null;
		double salary=0.0;
		double raise=0.0;
		switch(choice)
		{
		case 1:
		{
			System.out.print("Enter your name:");
			name=sc.next();
			System.out.print("Enter your age:");
			age=sc.nextInt();
			System.out.print("Enter your designation(Programmer or Manager or Tester):");
			desgn=sc.next();
			System.out.println("PROCEED? (y/n)");
			char ch=sc.next().charAt(0);
			if(ch =='y')
				System.out.println("1.Create  2.Display  3.Raise salary  4.Exit ");
			else
				 choice =1;
			break;
			
		}
		case 2:
		{
			System.out.println("Name:"+name);
			System.out.println("Age:"+age);
			System.out.println("Designation:"+desgn);
			break;
			
		}
		case 3:
		{
			System.out.print("Enter your current salary:");
			salary=sc.nextDouble();
			System.out.print("Enter your raise:");
			raise=sc.nextInt();
			salary=salary+raise;
			System.out.println("Salary updated.New salary:"+salary);
			break;
		}
		case 4:
		{
			System.out.println("EXIT");
			break;
		}
		default:
		{
			System.out.println("Enter valid choice");
			break;
		}
			
		}
	}
}
