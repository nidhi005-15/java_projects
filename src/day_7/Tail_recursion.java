package day_7;

public class Tail_recursion {
	static void count(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		count(n-1);
	}
	public static void main(String[] args) {
		System.out.println("inside main");
		count(5);
		System.out.println("after tail recursion");
	}

}
