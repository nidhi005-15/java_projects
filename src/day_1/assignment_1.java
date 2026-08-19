package day_1;
import java.util.*;

public class assignment_1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name = "";
        int age = 0;
        String desgn = "";
        

        while (true)
        {
            System.out.println("\n1.Create  2.Display  3.Raise salary  4.Exit ");
            System.out.print("Enter your choice:");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice)
            {
                case 1:
                {   char ch;
                	do {
                		System.out.print("Enter your name:");
                		name = sc.nextLine();

                		System.out.print("Enter your age:");
                		age = sc.nextInt();
                		sc.nextLine();

                		System.out.print("Enter your designation(Programmer or Manager or Tester):");
                		desgn = sc.next();
                		sc.nextLine();
                		System.out.println("Employee created successfully!");
                    
                		System.out.println("Proceed adding extra?(y/n)");
                		ch=sc.next().charAt(0);
                		sc.nextLine();
                	}while(ch=='y'||ch=='Y');
                	break;
                }
                case 2:
                {
                	break;
                }
                
                case 3:
                {
                	break;
                }
                case 4:
                {
                    System.out.println("EXIT");
                    sc.close();
                    return;
                }
                default:
                {
                    System.out.println("Enter valid choice");
                    break;
                }
            }

            
        }
       
    }
}