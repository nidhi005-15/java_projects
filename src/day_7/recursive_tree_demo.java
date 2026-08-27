package day_7;

public class recursive_tree_demo {
	static void count(int n) {
		if(n==0) {
			return;
		}
		System.out.println("calling count ("+n+")");
		count(n-1);
		System.out.println("returning from count("+n+")");
	
	}
	public static void main(String[] args) {
		count(5);
	}

}
