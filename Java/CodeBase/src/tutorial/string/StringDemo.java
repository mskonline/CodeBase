package tutorial.string;

public class StringDemo {

	public static void main(String[] args) {
		new StringDemo();
	}


	public StringDemo(){
		String str = "Hello";
		String str2 = new String("World");

		String str3 = str + str2;

		System.out.println(str3);

		// Substring - index of first character is 0

		// Substring from 2nd character to the end
		System.out.println("GoodDay".substring(1));

		// Substring from 2nd character to the 5th character
		System.out.println("GoodDay".substring(1, 6));

		// Split
		String[] s = "Hello World".split(" ");

		for(String st : s)
			System.out.println(st);
	}
}
