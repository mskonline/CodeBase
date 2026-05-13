package problems.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class LT1_TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int index = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i: nums) {
            int j = target - i;

            if (!map.containsKey(j)) {
                map.put(i, index);
            } else {
                result[0] = map.get(j);
                result[1] = index;
                break;
            }

            ++index;
        }

        return result;
    }

    public LT1_TwoSum() {
        int[] result = twoSum(new int[]{1,2,3,4}, 4);

        for(int i : result) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        new LT1_TwoSum();
    }
}
