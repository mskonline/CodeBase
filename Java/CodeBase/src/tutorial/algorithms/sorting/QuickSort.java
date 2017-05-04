package tutorial.algorithms.sorting;


/**
 * Complexity : O(n log n), Worst case: O(n ^ 2) - when pivot is at rightmost
 *
 * Best sorting algorithm in most cases
 */
public class QuickSort {

	public static void main(String[] args) {
		int[] array = {3,4,1,7,2,5};
		new QuickSort(array).printArray(array);
	}

	private int[] array;

	public QuickSort(int[] array) {
		this.array = array;
		this.qsort(0, array.length - 1);
	}

	private void qsort(int left, int right){
		int pivot;

		if(left < right) {
			// Consider a random pivot and partition them
            pivot = randomizedPartition(left, right);
            qsort(left, pivot - 1);
            qsort(pivot + 1, right);
        }
	}

	private int randomizedPartition(int left, int right) {

		int n = right - left + 1;
		int pivot = (int) Math.random() % n;

		// Place the pivot at the right most and then perform
		// the partition. At the end, move pivot to its actual
		// location
		swapValue(left + pivot, right);
		return doPartion(left, right);
	}

	private int doPartion(int left, int right){
		int pivotval = array[right];
		int pos = left;

		while(pos <= right - 1){
			if(array[pos] <= pivotval){
				swapValue(left, pos);
				++left;
			}
			++pos;
		}

		swapValue(left, right);
		return left;
	}

	private void swapValue(int i, int j){
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}

	public void printArray(int[] array){
		for(int i = 0; i < array.length; ++i){
			System.out.print(array[i]);
		}
	}

	public int[] getSortedArray(){
		return array;
	}
}
