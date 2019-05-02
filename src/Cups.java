
public class Cups {
	double filling;
	double lowerRadiusCm;
	double upperRadiusCm;
	double heightCm;
	double price;
	String name;
	
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
	
}






