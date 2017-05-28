package problems.dynamicprogramming;

import java.util.Arrays;

/**
 * A Child is running up a staircase with n steps and can hop 1 step, 2 step or 3step at a time.
 * Implement a method to count how many possible ways the child can run up the stairs
 */

public class Staircase {

	public static void main(String[] args) {
		new Staircase();
	}

	public Staircase(){
		System.out.println(countWays(5));
	}

	public int countWays(int n){
		int[] mem = new int[n + 1];
		Arrays.fill(mem, -1);

		return countWays(n, mem);
	}

	public int countWays(int n, int[] mem){
		if(n < 0)
			return 0;
		else if (n == 0)
			return 1;
		else if (mem[n] > -1)
			return mem[n];
		else{
			mem[n] = countWays(n - 1, mem) + countWays(n - 2, mem) + countWays(n - 3, mem);
			return mem[n];
		}
	}
}
