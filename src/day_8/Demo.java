package day_8;
import java.util.*;

public class Demo {
	  int a;
	  int b;
	Demo(int a,int b){
		this.a=a;
		this.b=b;
	}
	 void display() {
		System.out.println(a);
		System.out.println(b);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value:");
		int aa=sc.nextInt();
		System.out.println("enter a value:");
		int bb=sc.nextInt();
		Demo d=new Demo(aa,bb);
		d.display();
		sc.close();
		
		
	}

}
