package encapsulation;

// Creating Read-Only Class
public class VegShop {
	
	private String vegName = "Tomato";
	
	private int  oneKgPerPrice = 20;
	
	
	public String getName()
	{
		return this.vegName;
	}
	public int getPrice()
	{
		return this.oneKgPerPrice;
	}

}
