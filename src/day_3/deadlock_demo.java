package day_3;
import java.util.Iterator;
class resource
{
	synchronized void method1(resource r) {
		System.out.println(Thread.currentThread().getName()
				+"entered method1()");
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()
				+ "is waiting for method2");
		r.method2();
	}
	synchronized void method2() {
		System.out.println(Thread.currentThread().getName()
				+"entered method1()");
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
	
}
}
}
public class deadlock_demo {
	public static void main(String[] args) {
		resource r1=new resource();
		resource r2=new resource();
		Thread t1=new Thread(()->{
			r1.method1(r2);
		},"Thread 1");
		Thread t2=new Thread(()->{
			r2.method1(r1);
		},"Thread 2");
		t1.start();
		t2.start();
		}
	}


