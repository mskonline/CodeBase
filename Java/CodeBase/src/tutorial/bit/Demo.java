package tutorial.bit;

public class Demo {

	public static void main(String[] args) {
		new Demo();
	}

	public Demo(){
		leftShift(2);
		rightShift(2);
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
