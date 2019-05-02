import java.util.*;

public class MyClass {
	public static void main(String[] args) {	
			
			String product1Name;
			Cups firstProduct =  new Cups();
			
			boolean firstInput = false;
			do{
				
			System.out.println("Enter the name of the product");
			Scanner keyboard = new Scanner(System.in);
			
			product1Name = keyboard.nextLine();
			
				switch(product1Name)
				{
				case "Starbucks Tall":
					
					Starbucks firstProductStarbucks = (Starbucks) firstProduct;
					firstProductStarbucks.name = "Tall";
					firstProductStarbucks.Ounces = 12;
					firstInput = true;
					break;
					
				default: 
					System.out.println("No Match, Please Try Again"); 
					break;
				}
			
			} while (!firstInput);
			
			
	    }
}
