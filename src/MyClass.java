import java.util.*;
import java.lang.Math; 

public class MyClass {
	
	
	public static void main(String[] args) {	
			
			Cups firstProduct =  new Cups();
			Cups secondProduct =  new Cups();
			
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
