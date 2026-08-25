package day_6;

public class merge_array_names{
	public static void main(String[] args) {
		String[] arr1= {"abcd","ef","gh"};
		String[] arr2= {"ab","ca","gh"};
		String[] merged=new String[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++) {
			merged[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++) {
			merged[arr1.length+i]=arr2[i];
		}
		for(int i=0;i<merged.length;i++) {
			System.out.print(merged[i]+ " ");
		}
	}
}
