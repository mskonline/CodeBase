package tutorial.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int[] array = {3,4,1,2,5};
		new InsertionSort(array).printArray(array);
	}

	public InsertionSort(int[] array) {
		this.sort(array);
	}

	public void sort(int[] array){

	}

	public void printArray(int[] array){
		for(int i = 0; i < array.length; ++i){
			System.out.print(array[i]);
		}
	}
}
