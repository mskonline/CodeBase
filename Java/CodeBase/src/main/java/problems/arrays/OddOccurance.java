package problems.arrays;

//http://www.geeksforgeeks.org/find-the-number-occurring-odd-number-of-times/
public class OddOccurance {

	public static void main(String[] args) {
		new OddOccurance();
	}

	public OddOccurance(){
		int[] array = {2, 5, 3, 3, 5};
		System.out.println(findOddOccurrance(array));
		test(array);
	}

	private int findOddOccurrance(int[] array){
		int res = 0;

		for (int i = 0; i < array.length; i++) {
			res = res ^ array[i];
		}

		return res;
	}

	private void test(int[] array){
		int res = 0;

		for (int i = 0; i < array.length; i++) {
			res = res ^ array[i];
			System.out.println(Integer.toBinaryString(res));
		}
	}
}
