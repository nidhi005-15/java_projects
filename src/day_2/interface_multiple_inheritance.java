package day_2;

interface Atm2
{
	abstract void depo();
}
interface Atm3
{
	abstract void min();
}

public class interface_multiple_inheritance implements Atm2,Atm3
{
	public void depo() {
		System.out.println("dep");
	}
	public void min() {
		System.out.println("min");
	}
	public static void main(String[] args) {
		interface_multiple_inheritance v = new interface_multiple_inheritance();
		v.min();
		v.depo();

}
}

