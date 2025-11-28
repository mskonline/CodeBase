package problems.ctci.hard;

public class AddWithoutPlus {

	public static void main(String[] args) {
		new AddWithoutPlus();
	}

	public AddWithoutPlus(){
		System.out.println(add(3,4));
	}

	public int add(int a, int b){
		if(b == 0) return a;

		int sum = 0, carry;
		while(b != 0){
			sum = a ^ b;
			carry = (a & b) << 1;
			a = sum;
			b = carry;
		}

		return sum;
	}
}
