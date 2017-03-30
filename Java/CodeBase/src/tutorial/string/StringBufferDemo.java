package tutorial.string;

public class StringBufferDemo {

	public static void main(String[] args) {
		new StringBufferDemo();
	}

	public StringBufferDemo(){
		StringBuffer sBuffer = new StringBuffer();

		for(int i = 0; i < 10; ++i)
			sBuffer.append("" + i);

		System.out.println(sBuffer.toString());
		System.out.println(sBuffer.reverse());

		// Clear String Buffer
		sBuffer.delete(0, sBuffer.length());
		// or
		sBuffer.setLength(0);

		System.out.println(sBuffer.toString());
	}
}
