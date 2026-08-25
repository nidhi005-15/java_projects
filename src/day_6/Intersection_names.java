package day_6;

public class Intersection_names {
	public static void main(String[] args) {
		String[] arr1 = {"ab", "cd", "ef"};
		String[] arr2 = {"ab","cd","gh"};
		String[] merged = new String[arr1.length + arr2.length];
		int count = 0;                              

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					merged[count] = arr1[i];          
					count++;                          
				}
			}
		}

		for (int i = 0; i < count; i++) {             
			System.out.print(merged[i] + " ");
		}
	}
}