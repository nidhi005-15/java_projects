package day_2;

public class scope_variable_1 {
	int a=10;
	int b=20;
	void m1(int a,int b)
	{
		System.out.println("still instance variable"+(this.a+this.b));
		System.out.println("passed through method call,local variable:"+(a+b));
	}
	public static void main(String[] args)
	{
		scope_variable_1 x=new scope_variable_1();
		x.m1(4, 3);
	}

}
