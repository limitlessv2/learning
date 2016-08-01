package builder;

public class App {
	public static void main(String[] args){
		
		MealBuilder mb = new MealBuilder();
		
		Meal vegMeal = mb.prepareVegMeal();
		System.out.println("Veg meal");
		vegMeal.showItems();
		System.out.println("Total Cost: " + vegMeal.getCost());
		
		Meal nonVegMeal = mb.prepareNonVegMeal();
		System.out.println("\nNon-veg Meal");
		nonVegMeal.showItems();
		System.out.println("Total Cost: " + nonVegMeal.getCost());
		
	}
}
