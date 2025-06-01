package java_Method;

public class Test_withMethod {
	
	
	static  void  add(int a , int b)
	{
		int sum =a+b;
		System.out.println("Sum: "+ sum);
	}
public static int minFunction(int n1, int n2)
{
	int min;
//	System.out.println("Min value is : "+min); you can not initialize local variable  ,when printing came compile time error.

	if (n1>n2)
	{
		min =n2;
	System.out.println("Min:n2 is : "+min);
	return min;
	}
			else
			{	
	min=n1;
	System.out.println("Min:n1 is : "+min);
	return min;
			}
	}

	
	public static void main(String[] args) {
		
   add(5,3);// callmethod 
   add(10,2); // reuse method 
   minFunction(1,2);
	}

}
