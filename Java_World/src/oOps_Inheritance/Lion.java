package oOps_Inheritance;

public class Lion extends Animal_SuperClass {
	
	 String position ;
String name = "Likera";
	
	
	@Override
	public void eat() {
		super.eat();
		System.out.println("I can eat non-veg");
	}
	
	public void infoDisplay()
	{
		
		System.err.println("My name is "+name+" .I am king of the jungle");
			
	}
	
	public static void main(String[] args)
	{
		Lion lion = new Lion();
		
		lion.position="King";
		lion.eat();
		lion.infoDisplay();
	}

}
