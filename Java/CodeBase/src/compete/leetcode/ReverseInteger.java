package compete.leetcode;

public class ReverseInteger {

	public static void main(String[] args) {
		new ReverseInteger();
	}

	public ReverseInteger() {
		int i = 964632435;
		System.out.println(i * 10);
		System.out.println(this.reverse(1534236469));
	}


	public int reverse(int x) {
		int reverse = 0;
		boolean sign = x > 0 ? true : false;
		int lastDigit;

		x = java.lang.Math.abs(x);

		while(x > 0){
	    	lastDigit = x % 10;
	    	reverse = multiplyWithOverFlowCheck(reverse, 10);

	    	System.out.println("s1 - " + reverse);

	    	if(reverse < 0)
	    		return 0;

	    	reverse = reverse + lastDigit;

	    	System.out.println("s2 - " + reverse);

	    	if(reverse < 0)
	    		return 0;

	    	x = x / 10;
	    }

		if(sign){
			return reverse;
		}else {
			reverse = -(reverse);
			return reverse;
		}
    }

	public int multiplyWithOverFlowCheck(int a, int b){

		while(b > 0){
			a += a;
			if(a < 0)
				return 0;
			--b;
		}

		return a;
	}
}
