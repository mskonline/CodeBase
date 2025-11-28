package tutorial.algorithms.sorting;

/**
 * Complexity : O(n log n) Using max-heap data structure
 */
public class HeapSort {

	public static void main(String[] args) {
		int[] array = { 3, 4, 1, 7, 2, 5 };
		new HeapSort(array).printArray(array);
	}

	private int[] array;
	private int heapSize;

	public HeapSort(int[] array) {
		this.array = array;
		this.heapSize = array.length - 1;

		heapify();

		// Maxheap datastructure
		printArray(array);

		for (int i = heapSize; i > 0; --i) {
			swapValue(0, i);
			this.heapSize -= 1;
			maxheap(0);
		}
	}

	private void heapify() {
		for (int i = heapSize / 2; i >= 0; --i)
			maxheap(i);
	}

	private void maxheap(int i) {
		int left = 2 * i;
		int right = 2 * i + 1;
		int max = i;

		if (left <= heapSize && array[left] > array[i])
			max = left;

		if (right <= heapSize && array[right] > array[max])
			max = right;

		if (max != i){
			swapValue(i, max);
			maxheap(max);
		}
	}

	private void swapValue(int i, int j) {
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}

	public void printArray(int[] array) {
		for (int i = 0; i < array.length; ++i) {
			System.out.print(array[i]);
		}
		System.out.println();
	}
}
