package compete.leetcode;

public class AddTwoIntegers {

	public static void main(String[] args) {
		new AddTwoIntegers();
	}

	public AddTwoIntegers(){
		System.out.println(getSum(-1,1));
	}

	/*public int getSum(int a, int b) {
        int counter = java.lang.Math.abs(a);

		if(a > 0)
        	for(int i = 0; i < counter; ++i)
        		++b;

        if(a < 0)
        	for(int i = 0; i < counter; ++i)
        		--b;

        return b;
    }*/

	public int getSum(int a, int b) {
		if(b == 0)
			return a;

		int carry = (a & b) << 1;
		int sum = a ^ b;

		return getSum(sum, carry);
	}

}
