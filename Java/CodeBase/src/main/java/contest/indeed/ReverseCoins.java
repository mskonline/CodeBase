package contest.indeed;

public class ReverseCoins {

	public static void main(String[] args) {
		new ReverseCoins();

	}

	public ReverseCoins(){
		//int[] array = {1,1,1,1,0,0};
		//System.out.println(solution(array));

		System.out.println(solution2(4, 9));
	}

	public int solution(int[] A) {
        // write your code in Java SE 8
		int zeroCount = 0, oneCount = 0;

		for(int i = 0; i < A.length; ++i){
			if(A[i] == 0)
				++zeroCount;

			if(A[i] == 1)
				++oneCount;
		}

		return java.lang.Math.min(zeroCount, oneCount);
    }

	public int solution2(int A, int B) {
        // write your code in Java SE 8
		double sqrt;
		int count = 0;

		for(int i = A; i <= B; ++i){
			sqrt = java.lang.Math.sqrt(i);

			// Check if the square root is whole
			if(sqrt % 1 == 0)
				++count;
		}

		return count;
    }
}
