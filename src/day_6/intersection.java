package day_6;

public class intersection {
	public static void main(String[] args) {
		int[] arr1 = {10, 20, 40};
		int[] arr2 = {40, 50, 60};
		int[] merged = new int[arr1.length + arr2.length];
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