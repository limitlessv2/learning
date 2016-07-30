package abstractfactory;

import patterns.java.Shape;

public class App {

	public static void main(String[] args){
		
		AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
		
		Shape s1 = shapeFactory.getShape("circle");
		s1.draw();
	
		Shape s2 = shapeFactory.getShape("square");
		s2.draw();
		
		Shape s3 = shapeFactory.getShape("rectangle");
		s3.draw();
		
		AbstractFactory colorFactory = FactoryProducer.getFactory("color");
		
		Color c1 = colorFactory.getColor("red");
		c1.fill();
		
		Color c2 = colorFactory.getColor("green");
		c2.fill();
		
		Color c3 = colorFactory.getColor("blue");
		c3.fill();		
	}
}
