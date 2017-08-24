package problems.arrays;

import java.util.Stack;

/**
 * https://www.techiedelight.com/generate-power-set-given-set/
 */
public class PowerSet {

	public static void main(String[] args) {
		new PowerSet();
	}

	Stack<Integer> set = new Stack<Integer>();

	public PowerSet(){
		int[] array = {1,2,3};
		powerSet(array, array.length);
	}

	public void powerSet(int[] array, int n){
		if(n == 0){
			printSet();
			return;
		}

		set.push(array[n - 1]);
		powerSet(array, n - 1);

		set.pop();
		powerSet(array, n - 1);
	}

	public void printSet(){
		for (Integer integer : set) {
			System.out.print(integer + " ");
		}

		System.out.println();
	}
}
