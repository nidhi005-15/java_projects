package day_12;

public class Two_sum {
	public static void main(String[] args) {
		int [] num= {2,7,11,15};
		int target=9;
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num.length;j++) {
			if(num[i]+num[j]==target) {
				System.out.println(num[i]+" and "+num[j]);
			}
			}
		}
		
	}

}
