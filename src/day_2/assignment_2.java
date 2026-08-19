package day_2;
import java.util.*;

public abstract class assignment_2 
{   static String name=" ";
	static int age=0;
	static String desgn=" ";
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		
		
		while(true)
		{
			System.out.println(" 1.Create  2. Display  3. Raise salary 4. exit");
			System.out.println("enter your choice:");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				create();
				break;
			case 2:
				display();
				break;
			case 3:
				
				break;
			case 4:
				System.out.println("EXIT");
				sc.close();
				break;
			default:
				System.out.println("Enter valid choice:");
				break;
			}
		}
	}
	static void create()
	{	char ch;
		do {
    		System.out.print("Enter your name:");
    		name = sc.next();

    		System.out.print("Enter your age:");
    		age = sc.nextInt();
    		if(age<18 && age>60)
    			System.out.println("enter valid age");
    	
    		sc.nextLine();

    		System.out.print("Enter your designation(Programmer or Manager or Tester):");
    		desgn = sc.next();
    		sc.nextLine();
    		
    		System.out.println("Employee created successfully!");
        
    		System.out.println("Proceed adding extra?(y/n)");
    		ch=sc.next().charAt(0);
    		sc.nextLine();
    	}while(ch=='y'||ch=='Y');
}
	static void display()
	{
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("designtion:"+desgn);
		
	}
	
}


		

