package polymorphism;

public class Cat extends Animal {
	
	void sound()
	{
		System.out.println("cat meow");
	}
	void work()
	{
		System.out.println(" catching the mouse and  sleep a  lot");
		
	}
	public static void main(String[] args) {
		
		Animal a;
		
		a = new Cat();
		a.sound();
		a.type();
		//a.work(); only allowed Animal override in cat class
}
	

}
