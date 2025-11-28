package problems.dynamicprogramming;

public class Fibonacci {

	public static void main(String[] args) {

		System.out.println(fibonacci(5));
	}

	public static int fibonacci(int n){
		int[] mem = new int[n + 1];

		return fibonacci(n, mem);
	}

	public static int fibonacci(int n, int[] mem){
		if(n == 0 || n == 1)
			return n;

		if(mem[n] == 0){
			mem[n] = fibonacci(n - 1, mem) + fibonacci(n - 2, mem);
		}

		return mem[n];
	}
}
