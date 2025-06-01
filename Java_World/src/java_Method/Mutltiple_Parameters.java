package java_Method;

public class Mutltiple_Parameters {
	 static String parentname;
	 //method with parameter
	static void myFamily(String  name)
	{
		parentname="Shivan&Parvathi";
		System.out.println(parentname+" child is: "+name );
	}

	public static void main(String[] args) {
		// calling with Arguments 
		myFamily("Ganesh");
		myFamily("Murgan");

	}

}
