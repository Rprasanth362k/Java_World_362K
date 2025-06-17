package abstraction;

abstract public class Vehicle {
	
	// you can use fields private use to getter/setter method (abstraction +Encapsulation)
	String brand;
	int wheels =4;
	final int speedLimit =120;
	
	
	
	//constructor in abstract class
	Vehicle(String brand)
	{
		this.brand = brand;
		System.out.println("Vehicle constructor called");
	}

	// abstract method (must be implemeted in child class)
	
	// abstract method can use public ,default(no modifer),proctecte
	// can not use abstract method in private,static,final
	abstract void start();
	
	abstract void carWashing();
	
	//concreate method
	
	void stop()
	{
		System.out.println("Vehicle stopped");
	}
	final void fueltype()
	{
		System.out.println("car Fuel type Petrol or Diesel");
	}
	
	static void info()
	{
		System.out.println("Vehicle are used for transport");
	}
    public static void main(String[] args) {
    
    	//Vehicle vehicle1 = new Vehicle();  object can not created in abstract class in core concept java incomplemetd  method in class can not create object .
    }
}
