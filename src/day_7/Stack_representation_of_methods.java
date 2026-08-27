package day_7;

public class Stack_representation_of_methods {
	static void methodA() {
		System.out.println("inside method a");
		methodB();
		System.out.println("back to method a");
		
	}
	static void methodB() {
		System.out.println("inside method B");
	}
	public static void main(String[] args) {
		System.out.println("inside main ");
		methodA();
		System.out.println("back to main");
		}
}
