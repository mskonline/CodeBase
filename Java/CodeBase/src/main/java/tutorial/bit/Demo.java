package tutorial.bit;

public class Demo {

	public static void main(String[] args) {
		new Demo();
	}

	public Demo(){
		xor_operation(0,3);
		and_operation(2,3);
		or_operation(2,3);

		leftShift(2);
		rightShift(2);
	}

	/**
	 * xor:
	 * 1 ^ 0 = 1
	 * 0 ^ 1 = 1
	 * 0 ^ 0 = 0
	 * 1 ^ 1 = 0
	 *
	 * 2 ^ 3 = 010 ^ 011 = 001 = 1
	 */
	private void xor_operation(int a, int b){
		int c = a ^ b;
		System.out.println(c);
	}

	/**
	 * and:
	 * 1 & 0 = 0
	 * 0 & 1 = 0
	 * 0 & 0 = 0
	 * 1 & 1 = 1
	 *
	 * 2 & 3 = 010 & 011 = 010 = 2
	 */
	private void and_operation(int a, int b){
		int c = a & b;
		System.out.println(c);
	}

	/**
	 * or:
	 * 1 | 0 = 1
	 * 0 | 1 = 1
	 * 0 | 0 = 0
	 * 1 | 1 = 1
	 *
	 * 2 ^ 3 = 010 ^ 011 = 011 = 3
	 */
	private void or_operation(int a, int b){
		int c = a | b;
		System.out.println(c);
	}

	private void leftShift(int i){
		i = i << 1;
		System.out.println(i);
	}

	private void rightShift(int i){
		i = i >> 1;
		System.out.println(i);
	}
}
