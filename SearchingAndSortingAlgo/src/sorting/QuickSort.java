package sorting;

// Link for better understanding: https://www.youtube.com/watch?v=QXum8HQd_l4

public class QuickSort {

	/*
	 * This function takes last element as pivot, places the pivot element at its
	 * correct position in sorted array, and places all smaller (smaller than pivot)
	 * to left of pivot and all greater elements to right of pivot
	 */
	public static int partition(int[] arr, int low, int high) {
		// Index of smaller element and
		// indicates the right position
		// of pivot found so far
		int i = low - 1;
		// pivot
		int pivot = arr[high];

		for (int j = low; j < high; j++) {
			// If current element is smaller
			// than the pivot
			if (arr[j] < pivot) {
				// Increment index of
				// smaller element
				i++;
				// swap
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		i++;
		int temp = arr[i];
		arr[i] = pivot;
		arr[high] = temp;

		return i;
	}

	/*
	 * The main function that implements QuickSort arr[] --> Array to be sorted, low
	 * --> Starting index, high --> Ending index
	 */

	public static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			// pi is partitioning index, arr[p]
			// is now at right place
			int pidx = partition(arr, low, high);

			// Separately sort elements before
			// partition and after partition
			quickSort(arr, low, pidx - 1);
			quickSort(arr, pidx + 1, high);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 3, 9, 2, 0, 8, 5 };

		quickSort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
