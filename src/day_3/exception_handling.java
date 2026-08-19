package day_3;

public class exception_handling {
	public static void main(String[] args) {
		System.out.println("hello");
		try 
		{
			int a[]= {10,20,30};
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[2]);
			System.out.println(a[3]);
			
		}
		catch(Exception e)
		{
			System.out.println("excepition handled:"+e);
			
			
		}
	}

}
