package tutorial.algorithms.search;

public class BinarySearch {

	public static void main(String[] args) {
		new BinarySearch();
	}

	public BinarySearch(){
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		int index = binarySearch(10, array, 0, array.length - 1);

		if(index != -1)
			System.out.println(array[index]);

		System.out.println(index);
	}

	public int binarySearch(int n, int[] array, int low, int high){

		if(low == high - 1){
			if(array[low] == n)
				return low;
			else if(array[high] == n)
				return high;
			else
				return -1;
		}

		int mid = (high - low) / 2 + low;

		if(array[mid] == n)
			return mid;
		else if(n < array[mid]){
			System.out.println(low + " " + mid);
			return binarySearch(n, array, low, mid);
		}
		else{
			System.out.println(mid + " " + high);
			return binarySearch(n, array, mid, high);
		}
	}

	public void printArray(int[] array){
		for(int i = 0; i < array.length; ++i){
			System.out.print(array[i]);
		}
	}
}
