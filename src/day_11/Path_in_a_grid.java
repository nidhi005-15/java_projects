package day_11;

public class Path_in_a_grid {
	public static void main(String[] args) {
		int rows=3;
		int cols=3;
		int[][]dp=new int[rows][cols];
		for(int j=0;j<cols;j++) {
			dp[0][j]=1;
		}
		for(int i=0;i<cols;i++) {
			dp[i][0]=1;
		}
		for(int i=1;i<rows;i++) {
			for(int j=1;j<cols;j++) {
				dp[i][j]=dp[i-1][j]+dp[i][j-1];
			}
		}
		
		
		System.out.println("number of paths = "+dp[rows-1][cols-1]);
		
	}
	

}
