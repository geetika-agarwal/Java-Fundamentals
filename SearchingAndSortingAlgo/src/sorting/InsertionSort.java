package sorting;

public class InsertionSort {
	public static void main(String[] args) {
		int arr[] = { 5, 2, 1, 6, 10, 3, 4, 8, 7, 0, 9 };

		// Insertion sort will check the previous elements which are sorted and will
		// sort swap or insert the element which is in it's right place by performing
		// shifting operations

		// Link for better understanding : https://www.youtube.com/watch?v=9g0axedHGBY

		for (int i = 1; i < arr.length; i++) {
			int j = i - 1;
			int current = arr[i];
			while (j >= 0 && arr[j] > current) {
				arr[j + 1] = arr[j]; // Shifting till the values are less than the current
				j--;
			}

			arr[++j] = current;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
