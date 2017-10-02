package problems.sources.techdelight.arrays;

public class MaximumProductSubArray {

	public static void main(String[] args) {
		int[] A = {-6, 4, -5, 8, -10, 0, 8};
		findMaxProductSubArray(A);
	}

	public static void findMaxProductSubArray(int[] A){
		int max_ending = 0, min_ending = 0;
		int max_sofar = 0;
		int temp;

		for (int i = 0; i < A.length; i++) {

			temp = max_ending;
			max_ending = Math.max(A[i], Math.max(A[i] * max_ending, A[i] * min_ending));

			min_ending = Math.min(A[i], Math.min(A[i] * temp, A[i] * min_ending));

			max_sofar = Math.max(max_sofar, max_ending);
		}

		System.out.println(max_sofar);
	}
}
