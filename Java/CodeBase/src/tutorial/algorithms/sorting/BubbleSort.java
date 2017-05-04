package tutorial.algorithms.sorting;

/**
 * Complexity : O(n^2)
 *
 * Worst performance for large arrays
 */

public class BubbleSort {

	public static void main(String[] args) {
		int[] array = {3,4,1,2,5};
		new BubbleSort(array).printArray(array);
	}

	public BubbleSort(int[] array) {
		this.sort(array);
	}

	public void sort(int[] array){
		boolean swapped = false;
		int temp;

		for(int i = 0; i < array.length; ++i){
			for(int j = 0; j < array.length - i - 1; ++j){
				if(array[j] > array[j + 1]){
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					swapped = true;
				}
			}

			if(!swapped)
				break;
		}
	}

	public void printArray(int[] array){
		for(int i = 0; i < array.length; ++i){
			System.out.print(array[i]);
		}
	}
}
