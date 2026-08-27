package day_7;
public class Binary_multiple_strings{
	public static void main(String[] args) {
	String[] arr= {"apple","apple","apple","dates","dates","dates","raspberry","raspberry","raspberry"};
	String target="dates";
	int first=-1;
	int last=-1;
	int start=0;
	int end=arr.length-1;
	while(start<=end) {
		int mid=(start+end)/2;
		if(arr[mid].equals(target)) {
			first=mid;
			end=mid-1;
		}
		else if(arr[mid].compareTo(target)<0) {
			start=mid+1;
		}else {
			end=mid-1;
		}
	}
	start=0;
	end=arr.length-1;
	while(start<=end) {
		int mid=(start+end)/2;
		if(arr[mid]==target) {
			last=mid;
			start=mid+1;
		}
		else if(arr[mid].compareTo(target)<0) {
			start=mid+1;
		}else {
			end=mid-1;
		}
	}
	System.out.println("FIRST:"+first);
	System.out.println("LAST:"+last);
}

	
}
