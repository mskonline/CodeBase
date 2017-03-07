package tutorial.designpatterns.creational.factory;


/**
 * @author SaiKumar
 *
 * CREATIONAL PATTERN
 *
 * Create an Interface
 * Create concrete classes for the Interface
 * Create concrete factory which creates the above classes
 *
 * USAGE:
 */

public class Demo {

	public static void main(String[] args) {

		ShapeFactory shapeFactory = new ShapeFactory();
		Shape s = shapeFactory.createShape("CIRCLE");

		s.draw();

		s = shapeFactory.createShape("SQUARE");

		s.draw();
	}

}
