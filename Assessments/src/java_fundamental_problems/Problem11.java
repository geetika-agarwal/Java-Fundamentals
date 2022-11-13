package java_fundamental_problems;

/*11.	Write statements that perform the following one-dimensional-array operations:
a.	Set the 10 elements of integer array counts to zero.
b.	Add one to each of the 15 elements of integer array bonus.
c.	Display the five values of integer array bestScores in column format.
*/

public class Problem11 {
	public static void main(String[] args) {
		int[] arr1 = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		int arr2[] = new int[15];
		for (int i = 0; i < 15; i++) {
			arr2[i] = arr2[i] + 1;
		}

		String arr3[] = { "A", "B", "C", "D", "E" };
		for (String n : arr3) {
			System.out.print(n + " ");
		}
	}
}
