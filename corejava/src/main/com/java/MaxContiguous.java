package main.com.java;

public class MaxContiguous {

	public static void main(String[] args) {
		int arr[] = { 3, 6, 36, 42, 62, 121, 66, 26, 271, 661, 6, 4, 8, -1};

		int n = arr.length;

		System.out.println(countMaxContiguous(arr, n));
	}

	static int countMaxContiguous(int arr[], int n) {
		int current_max = 0, max_so_far = 0;

		for (int i = 0; i < n; i++) {

			if (arr[i] % 2 != 0)
				current_max = 0;
			else {
				current_max++; // increase count
				max_so_far = Math.max(current_max, max_so_far);
			}
		}

		return max_so_far;
	}

}
