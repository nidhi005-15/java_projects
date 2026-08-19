package day_3;
import java.util.Iterator;

public class multi_threading extends Thread 
{
	public void run()
	{
		for (int i = 0; i < 5; i++) {
			System.out.println("method"+i);
		}
	}
	public static void main(String[] args) {
		multi_threading tt=new multi_threading();
		tt.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("main method"+i);}

}
}
//multi_threading-to not waste cpu time,because every nano second is important..
//to improve programming efficiency
