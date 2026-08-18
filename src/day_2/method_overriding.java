package day_2;
class m{
	void m1()
	{
		System.out.println("zero");
	}
	void m2()
	{
		System.out.println("a certain balance");
	}
}

public class method_overriding extends m 
{
	void m2()
	{
		System.out.println("a different balance");
	}
	public static void main(String[] args)
	{
		method_overriding test=new method_overriding();
		test.m2();
		test.m1();
	}
}
