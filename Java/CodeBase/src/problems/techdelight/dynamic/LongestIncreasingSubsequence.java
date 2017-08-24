package problems.techdelight.dynamic;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		int[] array = {0,8,4,12,2,10,6,14,1,9,5,13,3,11,7,15};

		System.out.println(lis_withoutDP(array, 0, array.length, Integer.MIN_VALUE));

		System.out.println(lis_withDP(array));
	}

	public static int lis_withoutDP(int[] a, int i, int n, int prev){
		if(i == n)
			return 0;

		int excl = lis_withoutDP(a, i + 1, n, prev);

		int incl = 0;

		if(a[i] > prev)
			incl = 1 + lis_withoutDP(a, i + 1, n, a[i]);

		return Math.max(incl, excl);
	}

	public static int lis_withDP(int[] a){
		int[] L = new int[a.length];

		L[0] = 1;

		for (int i = 1; i < a.length; i++) {
			for (int j = 0; j < i; j++) {

				if(a[j] < a[i] && L[j] > L[i])
					L[i] = L[j];
			}

			L[i]++;
		}

		int lis = Integer.MIN_VALUE;

		for(int i : L)
			lis = Math.max(lis, i);

		return lis;
	}
}
