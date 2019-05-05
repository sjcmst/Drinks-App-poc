import java.util.Scanner;

public class CupsFactoryDemo {

	public static void main(String[] args) {
		
		CupsFactory cupsFactory = new CupsFactory();
		
		Cups firstCup = cupsFactory.makeCup(NormalCups.userInputClass("first product"));
		firstCup.userInputDetails();
		
		Cups secondCup = cupsFactory.makeCup(NormalCups.userInputClass("second product"));
		secondCup.userInputDetails();
		
		//Comparasion between them both
		NormalCups.showComparasion((NormalCups) firstCup, firstCup.getName() , (NormalCups) secondCup, secondCup.getName());
	}

}
