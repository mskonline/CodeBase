package problems.leetcode.arrays;

public class LT1929_Concatenate_Arrays {

    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        int index = 0;

        for (int i: nums) {
            ans[index] = i;
            ans[index + nums.length] = i;
            ++index;
        }

        return ans;
    }

    public LT1929_Concatenate_Arrays() {
        int[] nums = {1,2,3,4};
        int[] ans = getConcatenation(nums);
    }

    public static void main(String[] args) {
        new LT1929_Concatenate_Arrays();
    }
}
