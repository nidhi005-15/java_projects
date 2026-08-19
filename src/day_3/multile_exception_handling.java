package day_3;

public class multile_exception_handling {
	public static void main(String[] args) {
		System.out.println("hello");
		try {
			int a[]= {10,20,30};
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[2]);
			System.out.println(a[3]);
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("arithmtic exception handling");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array index out of bound exception handled");
		}
	}

}
