package day_12;

public class Multiple_nos_detection {
	public static void main(String[] args) {
		int [] arr= {1,2,3,1};
		int count=0;
	    for(int i=0;i<arr.length;i++) {
	    	for(int j=0;j<arr.length;j++) {
	    		if(arr[i]==arr[j]) {
	    			count++;
	    		}}}
	    if(count>0)	
	    		System.out.println(" array has a number repeated.");
	    else
	    		System.out.println("array has unique elements");
	}

}
