package day_7;

public class Quick_sort {

	static void quicksort(int[] a, int left, int right) {
		if (left >= right)
			return;

		int pivotIndex = partition(a, left, right);

		quicksort(a, left, pivotIndex - 1);   // sort left of pivot
		quicksort(a, pivotIndex + 1, right);  // sort right of pivot
	}
   
	static int partition(int[] a, int left, int right) {
		int pivot = a[right];   // choosing last element as pivot
		int i = left - 1;       // boundary of "smaller than pivot" zone

		for (int j = left; j < right; j++) {
			if (a[j] < pivot) {
				i++;
				swap(a, i, j);
			}
		}

		swap(a, i + 1, right);  // place pivot in its correct sorted position
		return i + 1;            // pivot's final index
	}

	static void swap(int[] a, int x, int y) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}

	public static void main(String[] args) {
		int[] marks = {80, 45, 60, 30, 90, 20, 70, 50};
		quicksort(marks, 0, marks.length - 1);
		for (int mark : marks)
			System.out.print(mark + " ");
	}
}
