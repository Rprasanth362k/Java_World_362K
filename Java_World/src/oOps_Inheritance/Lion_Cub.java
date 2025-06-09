package oOps_Inheritance;

public class Lion_Cub extends Lion  {
	
	@Override
	public void infoDisplay()
	{
		super.infoDisplay();
		System.err.println("My fathe name is "+name);
			
	}
	
	

	public static void main(String[] args) {
		
		Lion_Cub  cub = new Lion_Cub();
		cub.position="Secound-King";
		cub.infoDisplay();
		

	}

}
