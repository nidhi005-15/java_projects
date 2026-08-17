package java_basics;

public class sub {
	int subtraction(int a,int b)
	{
		return a-b;
	}
	public static void main(String[] args)
	{
		sub test=new sub();
		int result=test.subtraction(20,10);
		System.out.println("difference:"+result);
	}

}
