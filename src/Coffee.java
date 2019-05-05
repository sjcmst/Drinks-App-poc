import java.util.Scanner;

// Coffee means starbucks for now, will change later
public class Coffee extends NormalCups implements Cups {
	
	public String Type;
	
	public void ouncesSetVolumeCm3(double ounces) {
		volumeCm3 = 29.5735D * ounces;
	}
	
	@Override
	public void userInputVolume(boolean nameGiven, boolean update) {
		String type;
		if(update == true)
		type = "Update";
		else
		type = "Enter";
		
		if(nameGiven == true)
		System.out.println(type + " the size of the " + name + "(Starbucks Size)");
		else
		System.out.println(type + " the size of the product");
		
		Scanner keyboard = new Scanner(System.in);
		String input= keyboard.nextLine();
		
		switch(input) {
		case "Short":
			ouncesSetVolumeCm3(8);
			Type = "Short";
		case "Tall":
			ouncesSetVolumeCm3(12);
			Type = "Tall";
		case "Grande":
			ouncesSetVolumeCm3(16);
			Type = "Grande";
		
		}
	}
}
