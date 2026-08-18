package day_2;
class Parents {
	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

}

public class get_set extends Parents{
	public static void main(String[] args) {
	get_set test = new get_set();// object
	test.setA(11);
	int ac = test.getA();
	System.out.println(ac);

}
}