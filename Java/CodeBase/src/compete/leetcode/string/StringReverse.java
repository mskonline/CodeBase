package compete.leetcode.string;

// Accepted

public class StringReverse {

	public static void main(String[] args) {
		System.out.println(new StringReverse().reverseString("abcde"));
	}

	public String reverseString(String s) {
		StringBuffer sB = new StringBuffer();
		java.util.Stack<Character> stack = new java.util.Stack<Character>();

		for(int i = 0; i < s.length(); ++i)
			stack.push(new Character(s.charAt(i)));

		for(int i = 0; i < s.length(); ++i)
			sB.append(stack.pop().charValue());

		return sB.toString();
    }
}
