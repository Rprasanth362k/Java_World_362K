package java_Method;

public class Person_MainInstanceMethodsTypesExample2 {

	public static void main(String[] args) {
		Person person1= new Person();
		// or 		Person person1= new Person("Prasanth",25);

		
	System.out.println("Initial Name: "+person1.getName());
	System.out.println("Initial Age: "+person1.getAge());
	person1.setName("Prasanth");
	person1.setAge(25);
	person1.displauinfo();

	}

}
