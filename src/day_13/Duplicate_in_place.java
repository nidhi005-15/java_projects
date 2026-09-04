package day_13;
public class Duplicate_in_place {
		public static void main(String[] args) {
			int[] nums = {1, 1, 2, 2, 3};
			int index = 1;
			for (int i = 1; i < nums.length; i++) {
				if (nums[i] != nums[i - 1]) {
					nums[index] = nums[i];
					index++;
				}
			}
			System.out.println("Number of unique elements = " + index);
			}
	}