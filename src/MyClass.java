import java.util.*;
import java.lang.Math; 

public class MyClass {
	
	public static String userInputSubclassName(String productName)
	{				
		System.out.println("Enter the category of the " + productName + ". If none applicable, press enter");
		Scanner keyboard = new Scanner(System.in);
		String input = keyboard.nextLine();
		return input;
	}
	
	public static void generateObject(Cups obj, String productName)
	{
		String objTest;
			objTest = userInputSubclassName(productName);
			if(objTest == "Soft Drinks") {
				obj = new SoftDrinks();}
			
			if (obj instanceof SoftDrinks) {
			    ((SoftDrinks) obj).thankYou();
			}
			
			obj.name = "Toby";
		
	}
		
	public static void main(String[] args) {	
		
			Cups firstProduct = new Cups();
			generateObject(firstProduct, "first product");
			System.out.println(firstProduct.name);
			
			Cups secondProduct = new Cups();
			generateObject(secondProduct, "second product");
			System.out.println(secondProduct.name);
			
			
			
			System.out.println("Please enter the details of the first product for comparaion");
			firstProduct.userInputDetails();

			System.out.println("Please enter the details of the second product for comparaion");
			secondProduct.userInputDetails();
			
			System.out.println("Here's the comparasion between them!");
			String message;
			double pricePerVolumeDiffPercent = (firstProduct.getVolumePerPrice() / secondProduct.getVolumePerPrice() - 1) * 100;
			if(pricePerVolumeDiffPercent < 100)
				message = "cheaper ";
			else
				message = "more expensive ";
				
			System.out.println("The " + firstProduct.name + " is " + Math.abs(pricePerVolumeDiffPercent) + "% " + message + "than the " + secondProduct.name);
			
	    }
}
