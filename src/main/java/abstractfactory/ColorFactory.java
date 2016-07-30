package abstractfactory;
import patterns.java.Shape;

public class ColorFactory extends AbstractFactory {
	
	public Shape getShape(String shapeType){
		return null;
	}
	
	public Color getColor(String color){
		
		if (color == null){
			return null;
		}
		else if (color.equalsIgnoreCase("red")){
			return new Red();
		}
		else if (color.equalsIgnoreCase("blue")){
			return new Blue();
		}
		else if (color.equalsIgnoreCase("green")){
			return new Green();
		}
		
		return null;
	}
	
}
