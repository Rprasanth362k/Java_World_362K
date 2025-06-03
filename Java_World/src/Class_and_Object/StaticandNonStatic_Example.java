package Class_and_Object;

public class StaticandNonStatic_Example {

	
	static int staticCounter =0;
	
	int instanceCounter = 0 ;
	
	//static method
	public static void staticMethod()
	{
		System.out.println("Inside static method");
		
		// Access static variable directely 
		System.out.println("static Counter:"+ staticCounter);
        
		// can not access non-static variable directely
		//System.out.println(instanceCounter);//error
		// can not call non-static method directely
		
	//	instanceMethod(); //error
	}
	
	// non-static  method
	public void instanceMethod()
	{
		System.out.println("Inside Non-static(instance) method");
// 
		System.out.println("Static counter: "+staticCounter);
		System.out.println("Instance Counter:  "+instanceCounter);
		staticMethod();
	}
	public static void main(String[] args) {
		//  
		
		StaticandNonStatic_Example obj1 = new StaticandNonStatic_Example();
		
		StaticandNonStatic_Example obj2 = new StaticandNonStatic_Example();
		obj1.instanceMethod();
		System.out.println("inside of staticMethod in non-staticCounter "+obj1.instanceCounter);
		 obj1.instanceCounter =1;
		 System.out.println("Reassigning value instanceCounter in static method:-  "+obj1.instanceCounter);
		
		//System.out.println("Inside of Staticounter"+staticCounter);
		
	}
	

}
