package problems.dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

public class SubsetSum {

	public static void main(String[] args) {
		new SubsetSum();
	}

	Map<String, Boolean> map = new HashMap<String, Boolean>();

	public SubsetSum(){
		int[] array = {1,2,3,4,5};
		int size = array.length;

		System.out.println(subsetSum(array, size - 1, 10));
	}

	public boolean subsetSum(int[] array, int n, int sum){
		if(sum == 0)
			return true;

		if(n < 0 || sum < 0)
			return false;

		String key = n + "_" + sum;

		if(!map.containsKey(key)){
			boolean included = subsetSum(array, n - 1, sum - array[n]);
			boolean excluded = subsetSum(array, n - 1, sum);

			map.put(key, included || excluded);
		}

		return map.get(key);
	}
}
