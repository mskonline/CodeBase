package tutorial.lambda;

public class Demo {

	public static void main(String[] args) {
		  MyLambda func = () -> System.out.println("Hello World");
		  func.func();
	}

}

interface MyLambda{
	void func();
}