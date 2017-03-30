package tutorial.junit;

import org.junit.Test;
import org.junit.Assert;

import tutorial.sorting.QuickSort;

public class JUnitDemo {

	@Test
	public void test(){
		int[] array = {2,3,1,5,4};
		int[] sArray = {1,2,3,4,5};
		QuickSort qS = new QuickSort(array);

		Assert.assertArrayEquals(qS.getSortedArray(), sArray);
	}
}
