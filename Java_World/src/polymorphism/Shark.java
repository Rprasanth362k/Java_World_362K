package polymorphism;

public class Shark  extends Water_Animals {
	
	@Override
	public void move()
	{
		System.out.println("i move faster to and hungry hunter of sea");
		
	}
	
	@Override
	public void foodType()
	{
		System.out.println("i eat Non-Veg all time");
	}
	public static void main(String args[]) {
	
		
		Water_Animals wa = new Water_Animals(); // normal object (only  access method/variables  Water_Animals)
		Shark  shark = new Shark(); // normal object ,Can access both Shark and inherited Water_Animals non-static members
		Water_Animals waterAnimal = new Shark (); //upcasting(Child object, Parent reference), You can access only methods/variables declared in Water_Animals, Cannot access Shark-specific methods/fields unless overridden
		 Shark  sh = (Shark) waterAnimal;
		 //Downcasting (Parent reference cast back to Child),You can now access both Water_Animals and Shark members
		

		
	}
	

}
