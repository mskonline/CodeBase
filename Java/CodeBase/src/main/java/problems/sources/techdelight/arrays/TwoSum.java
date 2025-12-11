package problems.sources.techdelight.arrays;


import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public Pair<Integer, Integer> findPair(int[] nums, int target) {
        // Write your code here...
        Map<Integer, Integer> numMap = new HashMap();
        Pair<Integer, Integer> pair = null;

        for (int i = 0; i < nums.length; i++) {
            numMap.put(nums[i], i);
        }


        for (int i = 0; i < nums.length; i++) {
            int otherNumber = target - nums[i];

            if (numMap.get(otherNumber) != null && i != numMap.get(otherNumber).intValue()) {
                pair = new Pair<>(nums[i], otherNumber);
                break;
            }
        }


        return pair;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;


        Pair<Integer, Integer> pair = new TwoSum().findPair(nums, target);
        System.out.println(pair);
    }

    private class Pair<T, T1> {
        T v1;
        T1 v2;

        public Pair(T v1, T1 v2) {
            this.v1 = v1;
            this.v2 = v2;
        }

        @Override
        public String toString() {
            return (v1 + " " + v2);
        }
    }
}
