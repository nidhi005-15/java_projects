package java_basics;

public class area_circle {
	double area(double r)
	{
		return 3.14*r*r;
	}
	public static void main(String[] args)
	{
		area_circle test=new area_circle();
		double  res=test.area(5);
		System.out.println("Area of circle:"+res);
	}

}
