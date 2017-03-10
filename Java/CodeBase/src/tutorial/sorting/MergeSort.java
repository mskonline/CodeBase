package tutorial.sorting;

public class MergeSort {

	public static void main(String[] args) {
		int[] array = {3,4,1,7,2,5};
		new MergeSort(array).printArray(array);
	}

	private int[] array;

	public MergeSort(int[] array) {
		this.array = array;
	}

	public void printArray(int[] array){
		for(int i = 0; i < array.length; ++i){
			System.out.print(array[i]);
		}
	}
}
