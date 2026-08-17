package java_basics;

public class add {
	int addition(int a,int b)
	{
		return a+b;
	}
	public static void main(String[] args)
	{
		add test=new add();
		int result=test.addition(10,20);
		System.out.println("sum:"+result);
	}

}
