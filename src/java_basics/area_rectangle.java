package java_basics;


public class area_rectangle {
	void area(double b,double l)
	{
		System.out.println("area:"+(l*b));
		
	}
	public static void main(String[] args)
	{
		area_rectangle test=new area_rectangle();
		test.area(10, 10);
	}
	
}
