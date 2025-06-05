package testing;

public class Encapsulation_Example extends Encapsulation {
  private int rollNo;
	
	Encapsulation_Example(String name,int age,int rollNo)
	{
		super(name,age);
		this.rollNo=rollNo;
	}
	
	public void infoDisplay()
	{
		super.infoDisplay();
		System.out.println("Roll No: "+rollNo);
	final int val =10;
	}
	public static void main(String[] args) {
		
		
		Encapsulation_Example student1 = new Encapsulation_Example("jambu",12,122);
		
		System.out.println("IntialName: "+student1.getName());
		System.out.println("IntialName: "+student1.getAge());
		student1.setName("zimzng");
		student1.setAge(28);
		student1.infoDisplay();
		
		


		

	}

}
