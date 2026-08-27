package day_7;

public class withdraw_recursion {
	
	static void withdraw(int amount,int withdrawal) {
		if(amount==0) {
			System.out.println("withdraw completed cannot withdraw further!!");
			return;
		}
		System.out.println("Withdrawal:"+withdrawal);
		amount=amount-withdrawal;
		
		withdraw(amount,withdrawal);
		
	}
	public static void main(String[] args) {
		int amount=10000;
		int withdrawal=2000;
		withdraw(amount,withdrawal);
	}

}
