package day_7;
public class Binary_search {
public static int binarysearch(int[] arr,int target) {
	int left=0;
	int right=arr.length-1;
	while(left<=right) {
		int mid=(left+right)/2;
		System.out.println("checking:"+arr[mid]);
		if(arr[mid]==target)
			return mid;
		else if(target>arr[mid]) {
			left=mid+1;
		}else {
			right=mid-1;
		}
	}return -1;
}


	public static void main(String[] args) {
		int[] numbers= {10,20,30,40,50,60,70,80,90};
		int target=70;
		int result=binarysearch(numbers,target);
		if(result !=-1) {
			System.out.println("element found at index:"+result);
		}else {
			System.out.println("element not found");
		}
	
		
		
		}
}
