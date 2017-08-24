package problems.leetcode;

// https://leetcode.com/problems/majority-element/description/
public class MajorityElement {

	public static void main(String[] args) {
		int[] nums = {2,3,4,2,2,2};
		System.out.println(majorityElement(nums));
	}

	public static int majorityElement(int[] nums) {
        int c = 0, m = 0;
        for(int i = 0; i < nums.length; ++i){
            if(c == 0){
                m = nums[i];
                c = 1;
            } else if(m == nums[i]){
                ++c;
            } else{
                --c;
            }
        }

        return m;
    }
}
