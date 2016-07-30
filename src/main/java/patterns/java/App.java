package patterns.java;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ShapeFactory factory = new ShapeFactory();
        
        Shape c = factory.getShape("circle");
        
        c.draw();
        
        Shape s = factory.getShape("square");
        
        s.draw();
        
        Shape r = factory.getShape("rectangle");
        
        r.draw();
    }
}
