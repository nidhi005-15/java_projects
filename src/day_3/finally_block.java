package day_3;

public class finally_block {
	public static void main(String[] args) {
		System.out.println("hello");
		try
		{
			System.out.println("world");
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception handled");
		}
		finally {
			System.out.println("finally block exceuted");
		}
		System.out.println("this line is not executed");
	}

}
