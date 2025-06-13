package encapsulation;

// Creating Write-Only Class
public class FruitShop {
	
	private String fruitname;
	private int fruitprice;
	
	public  void setName(String name)
	{
		this.fruitname=name;
		
	}

	public void  setfruitPrice(int price)
	{
		this.fruitprice=price;
	}
}
