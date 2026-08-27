package day_7;

public class Recursion_another_way {
	static void x(int a,int b) {
		if(a==0) {
			System.out.println("completed!");
			return;
		}
		System.out.println("amount:"+a);
		a=a-b;
		x(a,b);
	}
	public static void main(String[] args) {
		int a=10000;
		int b=2000;
		x(a,b);
	}

}
