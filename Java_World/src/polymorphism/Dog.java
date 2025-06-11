package polymorphism;

public class Dog extends  Animal {

	
	void sound()
	{
		System.out.println("Dog barks");
	}
	void guard()
	{
		System.out.println("Dog gurads the house");
	}
	
	public static void main(String[] args) {
		
		Animal a;
		
		a = new Dog();
		a.sound();
		a.type();
	//	a.guard(); not allowed only override method only allowed 
        Dog c = (Dog) a;
        c.guard();
	}
	
}
