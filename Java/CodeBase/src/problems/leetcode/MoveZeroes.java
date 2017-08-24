package problems.leetcode;

public class MoveZeroes {

	public static void main(String[] args) {
		int[] array = {0, 1, 0, 0, 12};
		moveZeroes(array);
	}

	public static void moveZeroes(int[] nums) {
		/*for (int i = 0; i < nums.length; i++) {
			if(nums[i] == 0){
				for (int j = i; j < nums.length - 1; j++) {
					nums[j] = nums[j + 1];
				}

				nums[nums.length - 1] = 0;
			}
		}

		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}*/

		if (nums == null || nums.length == 0) return;

	    int insertPos = 0;
	    for (int num: nums) {
	        if (num != 0) nums[insertPos++] = num;
	    }

	    /*while (insertPos < nums.length) {
	        nums[insertPos++] = 0;
	    }*/

	    for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
    }
}
