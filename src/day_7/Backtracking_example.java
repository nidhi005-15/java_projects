package day_7;

public class Backtracking_example {
	static String correctpassword="231";
	static void trypassword(String pass) {
		System.out.println("trying :"+pass);
		if(pass.equals(correctpassword)) {
			System.out.println("password found:"+pass);
			return;
		}
		System.out.println("wrong password . Go back and try another");
	}
	public static void main(String[] args) {
		trypassword("123");
		trypassword("132");
		trypassword("231");
	}
}

