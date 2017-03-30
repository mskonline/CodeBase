package compete.leetcode;

public class SingleNumber {

	public static void main(String[] args) {
		new SingleNumber();
	}

	public SingleNumber(){
		int[] array = {1,2,3,1,2};
		System.out.println(singleNumber(array));
	}

	public int singleNumber(int[] nums) {
		int r = nums[0];

		for(int i = 1;i < nums.length; ++i){
			r ^= nums[i];
		}

		return r;
	}
}
