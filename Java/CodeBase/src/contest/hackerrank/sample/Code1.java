package contest.hackerrank.sample;

public class Code1 {

	public static void main(String[] args) {

		int[] n = {1,2,3,4,5};
		System.out.println(summation(n));
	}

	static void StairCase(int n) {
		int stairs = 0;
		int spaces = 0;

		for(int i = 1; i <= n; ++i){
			stairs = i;

			spaces = n - stairs;

			while(spaces --> 0)
				System.out.print(" ");

			while(stairs --> 0)
				System.out.print("#");

			System.out.println("");
		}
    }

	static int summation(int[] numbers) {
		int sum = 0;

		for (int i : numbers) {
			sum += i;
		}

		return sum;
    }
}

