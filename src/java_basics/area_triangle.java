package java_basics;

public class area_triangle {
	double area(double b,double h)
	{
		return 0.5*b*h;
	}
	public static void main(String[] args)
	{
		area_triangle test=new area_triangle();
		double res=test.area(5,7);
		System.out.println("Area:"+res);
	}
}
