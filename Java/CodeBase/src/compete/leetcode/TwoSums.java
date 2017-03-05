package compete.leetcode;
public class TwoSums {

	public static void main(String[] args) {

		int nums[] = {2, 11, 7, 19};
		int indexes[] = new TwoSums().twoSum(nums, 9);

		for(int i = 0; i < indexes.length; ++i)
			System.out.println(indexes[i]);

		if(indexes.length == 0)
			System.out.println("Nothing found");
	}

	public int[] twoSum(int[] nums, int target) {
		int indexes[], indexVal;

		for(int i = 0; i < nums.length; ++i){
			indexVal = nums[i];

			for(int j = i + 1; j < nums.length; ++j){
				if((indexVal + nums[j]) == target){
					indexes = new int[2];
					indexes[0] = i;
					indexes[1] = j;

					return indexes;
				}
			}
		}

		return new int[0];
	}

	public void test(){
		int indexes[] = new int[2];
		System.out.println(indexes.length);
	}
}
