package day_4;




public class searching_1_loop {
	public static void main(String[] args) {
		int n=100000;
		int[] students=new int[n];
		for (int i = 0; i < n; i++) {
			students[i]=i+1;
		}
		int target=1000;
		boolean found=false;
		for (int i = 0; i < n; i++) {
			 {
				if(students[i]==target) {
					found=true;
					break;
			}
		}
		if(found) {
			break;
		}
		
	}
	System.out.println("Student found:"+found);

}
}

