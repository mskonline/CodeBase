package contest.leetcode.c22;

import java.util.Arrays;


// Accepted

public class Problem_1 {

	public static void main(String[] args) {

		int[] nums = {1,3,1,5,4};

		System.out.println(findPairs(nums,0));
	}

	public static int findPairs(int[] nums, int k) {
		Arrays.sort(nums);

		java.util.LinkedHashSet<Integer> uniqueArray = new java.util.LinkedHashSet<Integer>();

		int absDiff;
		for(int i = 0; i < nums.length; ++i){
			for(int j = i + 1; j < nums.length; ++j){
				absDiff = java.lang.Math.abs(nums[i] - nums[j]);

				if(absDiff == k)
					uniqueArray.add(nums[i]+nums[j]);
				else if(absDiff > k)
					break;
			}
		}

		return uniqueArray.size();
    }
}
