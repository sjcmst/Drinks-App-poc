import java.util.Scanner;

public class CupsFactoryDemo {
	
	public static String userInputClass(String name) {
		System.out.println("Please enter the category of the " + name +" (Enter coffee if it's a starbucks)");
		Scanner keyboard = new Scanner(System.in);
		return keyboard.nextLine();
	}
	
	

	public static void main(String[] args) {
		
		CupsFactory cupsFactory = new CupsFactory();
		
		Cups firstCup = cupsFactory.getCup(userInputClass("first product"));
		firstCup.userInputDetails();
		
		Cups secondCup = cupsFactory.getCup(userInputClass("second product"));
		secondCup.userInputDetails();
		
		
		
		
	}

}
