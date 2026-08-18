package day_2;

public class scope_variables {
	int a=10;
	int b=20;
	void m1(int c,int d)
	{
		System.out.println("accessing instance variable:"+(a+b));
		System.out.println("passed by method call:"+(c+d));
	}
	
	public static void main(String[] args)
	{
		scope_variables x= new scope_variables();
		x.m1(4, 3);
	}

}
