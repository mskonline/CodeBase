package problems.leetcode;

import java.util.ArrayList;
import java.util.List;

public class DisappearedNumbers {

	public static void main(String[] args) {
		int[] nums = {4,3,2,7,8,2,3,1};
		List<Integer> ret = findDisappearedNumbers(nums);

		for (Integer integer : ret) {
			System.out.println(integer);
		}
	}

	public static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> missing = new ArrayList<Integer>();

        for(int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]) - 1;
            if(nums[val] > 0) {
                nums[val] = -nums[val];
            }
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
            	missing.add(i + 1);
            }
        }
        return missing;
    }
}
