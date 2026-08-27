package day_7;
public class Backtracking_example_2{
	static int ans=8;
	static void guessnumber(int guess) {
		System.out.println("checking :"+guess);
		if(guess==ans) {
			System.out.println("The guess is correct:"+guess);
			return;
		}
		System.out.println("wrong guess.Go back and try another");
	}
	public static void main(String[] args) {
		guessnumber(1);
		guessnumber(4);
		guessnumber(5);
		guessnumber(8);
	}	
}
