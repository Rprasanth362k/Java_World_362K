package abstraction;

public class Car extends Vehicle{

	Car()
	{
		super("Honda");
	}
	// implementing abstract method override  
	@Override
	void start()
	{
	
		System.out.println("car started ");
		
		// if do not define undefine method in extends class  can  not create object. and that class also abstract.
	}
	
	//own class method
	void musicSystem()
	{
		System.out.println("music system is on");
	}
	@Override
	void carWashing()
	{
		System.out.println("car washing in service center");
	}
	public static void main(String[] args) {

		Car car1 = new Car();
		
		Vehicle.info(); // static method
		
		System.out.println("Car Brand: "+car1.brand);
		System.out.println("speed Limit: "+car1.speedLimit);
		System.out.println("No of Whells: "+car1.wheels);
		car1.start();  // implemented abstract method
		car1.musicSystem(); //child class method
		car1.stop(); // concreate method
		car1.fueltype(); // final method-
	

		
		
	}

}
