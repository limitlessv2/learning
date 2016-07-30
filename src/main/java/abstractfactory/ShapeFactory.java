package abstractfactory;

import patterns.java.Circle;
import patterns.java.Rectangle;
import patterns.java.Shape;
import patterns.java.Square;

public class ShapeFactory extends AbstractFactory {
	
	@Override
	public Shape getShape(String shapeType){

		if (shapeType == null){
			return null;
		}
		else if (shapeType.equalsIgnoreCase("Circle")){
			return new Circle();
		}	
		else if (shapeType.equalsIgnoreCase("Square")){
			return new Square();
		}	
		else if (shapeType.equalsIgnoreCase("Rectangle")){
			return new Rectangle();
		}
			
		return null;
	}

	@Override
	Color getColor(String color) {
		return null;
	}
	

}	
