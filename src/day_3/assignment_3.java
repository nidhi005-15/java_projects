package day_3;


import java.util.*;

public abstract class assignment_3
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
			sc.nextLine();
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
				return;
			default:
				System.out.println("Enter valid choice:");
				break;
			}
		}
	}

	static void create()
	{	char ch;
		do {
			
			int spaceCount;
			do {
				System.out.print("Enter your name:");
				name = sc.nextLine();

				spaceCount = 0;
				for (int i = 0; i < name.length(); i++) {
					if (name.charAt(i) == ' ') {
						spaceCount++;
					}
				}

				if (spaceCount > 2) {
					System.out.println("Invalid name! More than 2 spaces are not allowed. Enter correctly.");
				}
			} while (spaceCount > 2);
			System.out.println("Valid name: " + name);

			
			do {
				System.out.print("Enter your age:");
				age = sc.nextInt();
				sc.nextLine();

				if (age < 18 || age > 60) {
					System.out.println("Invalid age! Age must be between 18 and 60. Enter correctly.");
				}
			} while (age < 18 || age > 60);
			System.out.println("Valid age: " + age);

			// ---- Designation validation ----
			do {
				System.out.print("Enter your designation(Programmer or Manager or Tester):");
				desgn = sc.nextLine();

				if (!(desgn.equalsIgnoreCase("Programmer") ||
					  desgn.equalsIgnoreCase("Manager") ||
					  desgn.equalsIgnoreCase("Tester"))) {
					System.out.println("Invalid designation! Enter Programmer, Manager or Tester correctly.");
				}
			} while (!(desgn.equalsIgnoreCase("Programmer") ||
					   desgn.equalsIgnoreCase("Manager") ||
					   desgn.equalsIgnoreCase("Tester")));

			System.out.println("Employee created successfully!");

			System.out.println("Proceed adding extra?(y/n)");
			ch = sc.nextLine().charAt(0);
		} while(ch=='y'||ch=='Y');
	}

	static void display()
	{
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("designtion:"+desgn);
	}
}
