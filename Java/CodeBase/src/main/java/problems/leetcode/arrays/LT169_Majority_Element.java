package problems.leetcode.arrays;

public class LT169_Majority_Element {
    public int majorityElement(int[] nums) {
        int majority = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; ++i) {
            if (count == 0) {
                majority = nums[i];
            }
            count += (nums[i] == majority) ? 1 : -1;
        }

        return majority;
    }

    LT169_Majority_Element() {
        System.out.println(majorityElement(new int[]{3,2,3}));
    }

    public static void main(String[] args) {
        new LT169_Majority_Element();
    }
}
