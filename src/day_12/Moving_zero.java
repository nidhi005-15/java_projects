package day_12;

public class Moving_zero {
	public static void main(String[] args) {
		int [] arr= {0,1,0,3,12};
		int insertpos=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[insertpos]=arr[i];
				insertpos++;
			}
	}
		while(insertpos<arr.length) {
			arr[insertpos]=0;
			insertpos++;
		}
		for(int x=0;x<arr.length;x++) {
			System.out.print(arr[x]+ " ");
		}

}}
