package problems.leetcode.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LT217_Duplicate {

    // Using hashset
    public boolean containsDuplicate(int[] nums) {
        boolean foundDup = false;
        Set<Integer> set = new HashSet<>();

        for (int i : nums) {
            if (set.contains(i)) {
                foundDup = true;
                break;
            }

            set.add(i);
        }

        return foundDup;
    }

    // Sorting the array
    public boolean containsDuplicate2(int[] nums) {
        Arrays.sort(nums);
        boolean foundDup = false;


        for (int i = 1; i < nums.length; ++i) {
            if (nums[i - 1] == nums[i]) {
                foundDup = true;
                break;
            }
        }

        return foundDup;
    }

    public LT217_Duplicate() {
        int[] nums = {1, 2, 3, 1};
        char[] chars = "hello".toCharArray();
        System.out.println(containsDuplicate(nums));
    }

    public static void main(String[] args) {
        new LT217_Duplicate();
    }
}
