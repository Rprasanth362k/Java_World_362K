package polymorphism;


//Method Overloading: Different Number of Arguments 
public class Calculator {
	
	
	public int addTwoElements(int a , int b)
	{
		return a+b;
		
	}

	public int addThreeElemets(int a , int b ,int c)

	{
		return a+b+c;
		
	}
	
	// Method Overloading: Different Type of Arguments
	public static int  multiply(int a ,int b)

	{
		
		return a*b;
	}

	public static double division(double a ,double b)

	{
		
		return a/b;
		
	}
	// can not  overloaded if you different return type 
	//int add(int a, int b) { return a + b; }
    //double add(int a, int b) { return a + b; } 
	
	
	/*
	 * can’t overload by changing between static and non-static?
	 * 
	 * static void display(int a) {}
    void display(int a) {}  //
	 * 
	 * 
	 */
	public static void main(String args[])
	{
		Calculator  cal = new Calculator();
	
		System.out.println(cal.addThreeElemets(1, 2, 3));
		System.out.println(cal.addTwoElements(10, 20));
		System.out.println(multiply(10,5));   
		System.out.println(division(10,5));

		
	}
	
}
