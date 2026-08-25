package day_6;

public class Union_of_array {
	public static void main(String[] args) {
		int[] arr1 = {10, 20, 40};
		int[] arr2 = {40, 50, 60};
		int[] merged = new int[arr1.length + arr2.length];
		int count = arr1.length;

		for (int i = 0; i < arr1.length; i++) {
			merged[i] = arr1[i];
		}

		for (int i = 0; i < arr2.length; i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < count; j++) {
				if (merged[j] == arr2[i]) {
					isDuplicate = true;
				}
			}
			if (!isDuplicate) {
				merged[count] = arr2[i];
				count++;
			}
		}

		for (int i = 0; i < count; i++) {
			System.out.print(merged[i] + " ");
		}
	}
}