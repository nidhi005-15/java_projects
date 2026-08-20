package day_4;
public class total_salary {
	public static void main(String[] args) {
		int [] employees= {10000,15000,12000,18000,20000};
		int sum=0;
		for(int i=0;i<employees.length;i++) {
			sum=sum+employees[i];
		}
		System.out.println("total salary:"+sum);
		}

}
