package day_3;
import java.util.Iterator;
class mytask implements Runnable{
	public void run()
	{
		for (int i = 0; i < 5; i++) {
			System.out.println("method"+i);
		}
	}
}

public class runnsble_interface {
	
	public static void main(String[] args) {
		mytask tt=new mytask();
		Thread t= new Thread(tt);
		t.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("main method"+i);}

}
} 
