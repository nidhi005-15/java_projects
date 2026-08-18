package day_2;

public class method_overloading {
	void m1()
	{
		System.out.println("Method1");
	}
	void m1(int a)
	{
		System.out.println("Method1:overloading");
	}
	public static void main(String[] args)
	{
		method_overloading test=new method_overloading();
		test.m1();
		test.m1(3);
	}
}
