package java_basics;

public class multiplication {
	int multiply(int a,int b)
	{
		return a*b;
	}
	public static void main(String[] args)
	{
		multiplication test=new multiplication();
		int result=test.multiply(10,2);
		System.out.println("product:"+result);
	}
}
