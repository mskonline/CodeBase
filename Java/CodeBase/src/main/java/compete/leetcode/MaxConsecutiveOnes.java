package compete.leetcode;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		new MaxConsecutiveOnes();
	}

	public MaxConsecutiveOnes(){
		int[] array = {1,1};
		System.out.println(findMaxConsecutiveOnes(array));
	}

	public int findMaxConsecutiveOnes(int[] nums) {
		int count = 0, max = 0;

		for(int i = 0; i < nums.length; ++i){
			if(nums[i] == 0){
				if(count >= max)
					max = count;

				count = 0;
			} else {
				++count;
			}
		}

		if(count >= max)
			max = count;

		return max;
    }
}
