package singleton;

public class App {

	public static void main(String[] args){
		
		SingleObject obj = SingleObject.getInstance();
		
		obj.showMessage();
	}
}
