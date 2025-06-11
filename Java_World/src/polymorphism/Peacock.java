package polymorphism;

public class Peacock extends Bird implements Vegetarian  {

	public static void main(String[] args) {

		Peacock  p = new Peacock();
		Bird a =p;
		Vegetarian  v =p;
		Object o =p;
		System.out.println(p instanceof Peacock);
		System.out.println(a instanceof Peacock);
		System.out.println(v instanceof Peacock);
		System.out.println(o instanceof Peacock);

		
		
		
	}

}
