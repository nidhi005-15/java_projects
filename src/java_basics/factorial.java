package java_basics;

public class factorial {
	static int factorial_find(int a)
	{
		int sum=1;
		for(int i=1;i<=a;i++)
		{
			sum=sum*i;
		}
		return sum;
	}
	public static void main(String[] args)
	{
		int result=factorial_find(5);
		System.out.println("factorial:"+result);
	}
}
