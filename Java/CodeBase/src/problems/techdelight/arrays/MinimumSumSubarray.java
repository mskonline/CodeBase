package problems.techdelight.arrays;

public class MinimumSumSubarray {

	public static void main(String[] args) {

	}

	public static void findMinimumSumSubArray(int[] A, int k){
		int window_sum = 0;

		int min_window = Integer.MIN_VALUE;

		for (int i = 0; i < A.length; i++) {
			window_sum += A[i];

			if(i + 1 >= k){
				if(min_window > window_sum){
					min_window = window_sum;
				}

				window_sum -= A[i + 1 - k];
			}
		}
	}
}
