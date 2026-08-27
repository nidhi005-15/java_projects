package day_7;
public class binary_search_strings{
public static int binarysearch(String[] arr,String target) {
	int left=0;
	int right=arr.length-1;
	while(left<=right) {
		int mid=(left+right)/2;
		System.out.println("checking:"+arr[mid]);
		if(arr[mid].equals(target))                     //.equals operator to check the contents of two strings
			return mid;
		else if (target.compareTo(arr[mid]) > 0) {      //.compareTp checks the alphabetical  ordering of strings
			left=mid+1;
		}else {
			right=mid-1;
		}
	}return -1;
}


	public static void main(String[] args) {
		String[] names= {"apple","banana","chickoo","dates","guava","kiwi","mango","raspberry","strawberry"};
		String target="dates";
		int result=binarysearch(names,target);
		if(result !=-1) {
			System.out.println("element found at index:"+result);
		}else {
			System.out.println("element not found");
		}
 }
}
