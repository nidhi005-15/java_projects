package day_4;

import java.util.Scanner;

public class menu {
	static char ch;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		do {
		System.out.print("menu:1. Pizza 2.burger 3.sandwich 4.roti 5.pasta ");
		System.out.print("Enter a number to choose a menu:");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Pizza");
			break;
		case 2:
			System.out.println("burger");
			break;
		case 3:
			System.out.println("sandwich");
			break;
		case 4:
			System.out.println("roti");
			break;
		case 5:
			System.out.println("pasta");
			break;
		default:
			System.out.println("Invalid choice(enter a number between 1 to 5)");
			break;
		}
		System.out.println("wish to continue:(y/n)");
		ch=sc.next().charAt(0);
			
		}while(ch=='y');
		if(ch=='n')
			System.exit(0);
		
		
	}
	}	

