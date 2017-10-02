package problems.techdelight.arrays;

// http://www.techiedelight.com/find-majority-element-in-an-array-boyer-moore-majority-vote-algorithm/
public class MajorityElement {

	public static void main(String[] args) {
		findMajority();
	}

	public static void findMajority(){
		int[] array = {2,2,2,4};

		int counter = 0, m = 0;

		for (int i = 0; i < array.length; i++) {
			if(counter == 0){
				m = array[i];
				counter = 1;
			} else if(m == array[i]){
				++counter;
			} else
				--counter;
		}

		System.out.println(m);
	}
}
