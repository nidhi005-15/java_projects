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
        double salary = 0.0;

        while (true)
        {
            System.out.println("\n1.Create  2.Display  3.Raise salary  4.Exit ");
            System.out.print("Enter your choice:");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice)
            {
                case 1:
                {
                    System.out.print("Enter your name:");
                    name = sc.nextLine();

                    System.out.print("Enter your age:");
                    age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter your designation(Programmer or Manager or Tester):");
                    desgn = sc.nextLine();

                    System.out.print("Enter current salary:");
                    salary = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Employee created successfully!");
                    break;
                }
                case 2:
                {
                    if (name.isEmpty())
                    {
                        System.out.println("No employee created yet. Choose option 1 first.");
                    }
                    else
                    {
                        System.out.println("Name:" + name);
                        System.out.println("Age:" + age);
                        System.out.println("Designation:" + desgn);
                        System.out.println("Salary:" + salary);
                    }
                    break;
                }
                case 3:
                {
                    if (name.isEmpty())
                    {
                        System.out.println("No employee created yet. Choose option 1 first.");
                    }
                    else
                    {
                        System.out.print("Enter your raise:");
                        double raise = sc.nextDouble();
                        sc.nextLine();
                        salary = salary + raise;
                        System.out.println("Salary updated. New salary:" + salary);
                    }
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

            System.out.print("\nContinue? (y/n): ");
            String ans = sc.nextLine().trim().toLowerCase();
            if (ans.equals("n"))
            {
                System.out.println("Stopped.");
                break;
            }
            else if (!ans.equals("y"))
            {
                System.out.println("Invalid input. Stopping.");
                break;
            }
        }
        sc.close();
    }
}