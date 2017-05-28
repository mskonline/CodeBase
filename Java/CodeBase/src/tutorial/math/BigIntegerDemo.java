package tutorial.math;

import java.math.BigInteger;

public class BigIntegerDemo {

	public static void main(String[] args) {
		BigInteger numberA = BigInteger.valueOf(18);

		BigInteger numberB = BigInteger.valueOf(10).pow(100);
		numberB = numberB.add(BigInteger.valueOf(7));

		System.out.println(numberB);
	}

}
