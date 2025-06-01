package java_Method;

public class Test_withMethod {
	
	
	static  void  add(int a , int b)
	{
		int sum =a+b;
		System.out.println("Sum: "+ sum);
	}

	public static void main(String[] args) {
		
   add(5,3);// call method 
   add(10,2); // reuse method 

	}

}
