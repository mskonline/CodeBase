package problems.techdelight.arrays;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		int[] A = {1,2,3,4,5,6};
		findSubarray(A, 5);
	}

	public static void findSubarray(int[] A, int sum){
		int low = 0, high = 0;
		int n = A.length;

		int windowSum = 0;

		while(low < n){
			while(windowSum < sum && high < n){
				windowSum += A[high];
				high++;
			}

			if(windowSum == sum){
				System.out.println("Found at (" + low + ", " + (high - 1) + ")");
				return;
			}

			windowSum -= A[low];

			++low;
		}
	}
}
