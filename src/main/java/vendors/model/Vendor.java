package vendors.model;

public class Vendor {

    public static String ID = "Sprite";
    public static double price = 0.00; 

	public static double requestPrice(String ID) {
		if(ID.equalsIgnoreCase("sprite")) {
		  price = 2.00;
		} else {
		 price = 0.00;
		}
		return price;
	}
}
