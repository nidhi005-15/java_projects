package day_2;
interface Atm
{
	abstract void depo();	
	abstract void with();
}
abstract class Abc implements Atm
{	
	public	void depo()
	{
		System.out.println("Depos");
	}
	}

public class interface_ extends Abc {
	public	void with()
	{
		System.out.println("With");
	}

	
	public static void main(String[] args) {
		interface_   v = new interface_();
		v.depo();
		v.with();
	

}
}