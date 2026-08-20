package day_4;

public class total_electricity {
	public static void main(String[] args) {
		int [] units= {10,15,12,20,18,14,16};
		int sum=0;
		for(int i=0;i<units.length;i++) {
			sum=sum+units[i];
		}
		System.out.print("total units:"+sum);
	}
}
