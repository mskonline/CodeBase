package tutorial.designpatterns.creational.factory;

public class ShapeFactory {
	public Shape createShape(String shapeType){
		if(shapeType == null){
	         return null;
	      }
	      if(shapeType.equalsIgnoreCase("CIRCLE")){
	         return new Circle();

	      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle();

	      } else if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new Square();
	      }

	      return null;
	}
}
