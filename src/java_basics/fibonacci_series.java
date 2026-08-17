package java_basics;

public class fibonacci_series 
{
	static int fibonacci(int a)
	{
		if(a<=1)
		{
			return a;
		}
		int x=0,y=1;
		for(int i=2;i<=a;i++)
		{
			int z=x+y;
			x=y;
			y=z;
		}
		return y;
	}
	public static void main(String[] args)
	{
		int result=fibonacci(4);
		System.out.println("fibonacci:"+result);
	}
	

}
