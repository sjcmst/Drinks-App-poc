
public class CupsFactory {
	public Cups getCup(String cupType) {
		if(cupType == null){
	         return null;
	      }		
	      if(cupType.equalsIgnoreCase("COFFEE")){
	         return new Coffee();
	         
	      } else if(cupType.equalsIgnoreCase("JUICES")){
	         return new Juices();
	      } else {
	    	 return new NormalCups();
	      }
	}

}
