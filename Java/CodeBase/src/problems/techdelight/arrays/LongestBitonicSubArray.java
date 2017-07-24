package problems.techdelight.arrays;

public class LongestBitonicSubArray {

	public static void main(String[] args) {
		int[] A = {3,5,8,4,5,6,7,12,10,6,5,4,5};
		findBiotonic(A);
	}

	public static void findBiotonic(int[] A){

		int i = 0, max_len = 0;
		int n = A.length;
		int len;

		while(i + 1 < n){

			len = 1;
			while(i + 1 < n && A[i] < A[i + 1]){
				i++;
				len++;
			}

			while(i + 1 < n && A[i] > A[i + 1]){
				i++;
				len++;
			}

			if(len > max_len){
				max_len = len;
			}
		}

		System.out.println(max_len);
	}
}
