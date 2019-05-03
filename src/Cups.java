import java.util.Scanner;

public class Cups {
	double filling;
	double lowerRadiusCm;
	double upperRadiusCm;
	double heightCm;
	double price;
	String name;
	
	private double volumeCm3;
	

	
	public Cups(double Filling, double LowerRadiusCm, double UpperRadiusCm, double HeightCm, double Price, String Name)
	{
		this.filling = Filling;
		this.lowerRadiusCm = LowerRadiusCm;
		this.upperRadiusCm = UpperRadiusCm;
		this.heightCm = HeightCm;
		this.price = Price;
		this.name = Name;
	}
	
	public Cups()
	{}
	
	
	public Cups(double price, String name)
	{}
	
	public double volumeCm3()
	{
		if(volumeCm3 != 0)
			return volumeCm3;
		
		return filling * Math.PI / 3 * heightCm *
				(Math.pow(lowerRadiusCm, 2) + lowerRadiusCm * upperRadiusCm + Math.pow(upperRadiusCm, 2));
	}
	
	public double pricePerVolume()
	{
		return price / volumeCm3();
	}
	
	public void printName()
	{
		System.out.println(name);
	}
	
	public void userInputName()
	{
		boolean finished = false;
		do{
			
		System.out.println("Enter the name of the product");
		Scanner keyboard = new Scanner(System.in);
		String input = keyboard.nextLine();
		
			switch(input)
			{
			case "Coke Can":
				name = "Coke Can";
				volumeCm3 = 330;
				userInputPrice();
				finished = true;
				break;
				
			default: 
				System.out.println("No Match, Please Try Again"); 
				break;
			}
		
		} while (!finished);
		
	}
	
	public void userInputPrice()
	{
		boolean finished = false;
		do{
			
		System.out.println("Enter the price of the " + name);
		Scanner keyboard = new Scanner(System.in);
		double input= keyboard.nextDouble();
		
		} while (!finished);
	}
	
}






