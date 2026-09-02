package day_11;

public class searching_matrix_alphabets {
	public static void main(String[] args) {
		char [][]matrix= {{'A','B','C','D'},{'E','F','G','H'},{'I','J','K','L'},{'M','N','O','P'}};
		char target='K';
		int row=0;
		int col=matrix[0].length-1;
		while(row<matrix.length && col>=0) {
			if(matrix[row][col]==target) {
				System.out.println("element found ");
				return;
				}
			else if(matrix[row][col]>target) {
				col--;
			}else {
				row++;
			}
			}
		System.out.println("element not found");
		}


	}
