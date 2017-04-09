package tutorial.java8.lambda;

public class Demo {

	public static void main(String[] args) {
		  exec(() -> System.out.println("Hello World"));
	}

	private static void exec(MyLambda m){
		m.func();
	}
}

interface MyLambda{
	void func();
}