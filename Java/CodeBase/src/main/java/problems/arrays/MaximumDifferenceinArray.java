package problems.arrays;

public class MaximumDifferenceinArray {

	public static void main(String[] args) {
		new MaximumDifferenceinArray();
	}

	public MaximumDifferenceinArray(){
		int[] array = {10,8,7,6,5};
		System.out.println(findMaximumDifferenceinArray(array));
	}

	public int findMaximumDifferenceinArray(int[] array){
		int maxCur = 0, maxSoFar = 0;

        for(int i = 1; i < array.length; i++) {
        	maxCur += array[i] - array[i-1];
            maxCur = Math.max(0, maxCur);
            maxSoFar = Math.max(maxCur, maxSoFar);
        }

        return maxSoFar == 0 ? -1 : maxSoFar;
	}
}
