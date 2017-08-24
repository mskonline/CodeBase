package tutorial.collections.stack;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Character> bStack = new Stack<Character>();
		bStack.push(Character.valueOf('c'));

		System.out.println(bStack.pop());
	}
}
