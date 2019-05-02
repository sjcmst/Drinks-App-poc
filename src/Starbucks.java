
public class Starbucks extends Cups
{
	double Ounces;
	
	Starbucks(double Filling, double LowerRadiusCm, double UpperRadiusCm, double HeightCm, double Price, String Name, float Ounces){
		super(Filling, LowerRadiusCm, UpperRadiusCm, HeightCm, Price, Name); 
		this.Ounces = Ounces;
	}
	
	Starbucks(){
		super();
	}
	
	Starbucks(double price, String name, double ounces){
		super(price, name);
	}
	
	public double volumeCm3()
	{
		return Ounces * 29.5735;
	}
}
