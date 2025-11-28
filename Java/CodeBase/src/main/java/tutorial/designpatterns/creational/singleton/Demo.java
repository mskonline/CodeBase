package tutorial.designpatterns.creational.singleton;

/**
 * @author SaiKumar
 *
 * CREATIONAL PATTERN
 *
 * Create a concrete class with private constructor
 * Create a method in the above class to return an instance (created only once)
 *
 * USAGE:
 */
public class Demo {

	public static void main(String[] args) {
		SingleObject singleObject = SingleObject.getInstance();
		singleObject.show();
	}

}
