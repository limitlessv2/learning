package abstractfactory;
import patterns.java.*;;

public abstract class AbstractFactory {
	abstract Color getColor(String color);
	abstract Shape getShape(String shape);
}
