package day_7;
/*public class Iteration_withdrawal {
	 static void withdraw(int bal,int amt ) {
		 for( bal=10000; bal>=0;bal-=amt) {
			 System.out.println(bal);
		 }
	 }
	 public static void main(String[] args) {
		withdraw(10000,2000);
	}

}
*/
public class Iteration_withdrawal {
	static void withdraw(int bal,int amt ) {
		while(bal>=0) {
			System.out.println("amount:"+bal);
			bal=bal-amt;
		}
	}
	public static void main(String[] args) {
		withdraw(10000,2000);
	
}
}