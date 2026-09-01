package problems.leetcode.arrays;

public class LT27_Remove_Element {

    public int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                ++k;
            }
        }

        return k;
    }

    public LT27_Remove_Element() {
        System.out.println(removeElement(new int[]{3,2,2,3}, 3));
    }

    public static void main(String[] args) {
        new LT27_Remove_Element();
    }
}
