package java_basics;

public class division {
	 int divide(int a,int b)
	{
		return a/b;
	}
	public static void main(String[] args)
	{
		division test=new division();
		int result = test.divide(20,5);
		System.out.println("quotient:"+result);
	}

}
