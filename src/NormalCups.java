import java.util.Scanner;

public class NormalCups implements Cups {

	double filling;
	double price;
	String name;
	
	protected double volumeCm3;
	
	public double getVolumeCm3() {
		return volumeCm3;
	}

	
	public void setVolumeCm3(double volumeCm3) {
		this.volumeCm3 = volumeCm3;
	}

	
	public void advancedSetVolumeCm3(double lowerRadiusCm, double upperRadiusCm, double heightCm) {
		volumeCm3 = filling * Math.PI / 3 * heightCm *
				(Math.pow(lowerRadiusCm, 2) + lowerRadiusCm * upperRadiusCm + Math.pow(upperRadiusCm, 2));
	}


	public double getVolumePerPrice() {
		return volumeCm3 / price;
	}
	
	
	@Override
	public void userInputDetails() {
		userInputName(false);
		userInputVolume(true, false);
		userInputPrice(true, false);
	}

	@Override
	public void userInputName(boolean update) {
		String type;
		if(update == true)
		type = "Update";
		else
		type = "Enter";
		
		System.out.println(type + " the name of the product");
		Scanner keyboard = new Scanner(System.in);
		String input = keyboard.nextLine();
		
		this.name = input;
	}

	@Override
	public void userInputPrice(boolean nameGiven, boolean update) {
		String type;
		if(update == true)
		type = "Update";
		else
		type = "Enter";
		
		if(nameGiven == true)
		System.out.println(type + " the price of the " + name);
		else
		System.out.println(type + " the price of the product");
		
		Scanner keyboard = new Scanner(System.in);
		double input= keyboard.nextDouble();
		
		this.price = input;
	}

	@Override
	public void userInputVolume(boolean nameGiven, boolean update) {
		String type;
		if(update == true)
		type = "Update";
		else
		type = "Enter";
		
		if(nameGiven == true)
		System.out.println(type + " the Volume of the " + name);
		else
		System.out.println(type + " the Volume of the product");
		
		Scanner keyboard = new Scanner(System.in);
		double input= keyboard.nextDouble();
		
		setVolumeCm3(input);
	}

}
