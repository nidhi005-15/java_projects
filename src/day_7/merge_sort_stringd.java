package day_7;

public class merge_sort_stringd {     
	static void mergesort(String []a,int left,int right) {
		if(left>=right)
			return;
		int mid=(left+right)/2;
		mergesort(a,left,mid);
		mergesort(a,mid+1,right);
		String[] temp=new String[right-left+1];
		int i=left,j=mid+1,k=0;
		while(i<=mid && j<=right) 
			temp[k++]=(a[i].compareTo(a[j])<0)?a[i++]:a[j++];
		while(i<=mid)
			temp[k++]=a[i++];
		while(j<=right)
			temp[k++]=a[j++];
		for(i=0;i<temp.length;i++) 
			a[left+i]=temp[i];
		}
	public static void main(String[] args) {
		String[] marks= {"a","c","h","e","g","b","d"};
		mergesort(marks,0,marks.length-1);
		for(String mark:marks)
			System.out.print(mark+" ");
	}
	
	
}
