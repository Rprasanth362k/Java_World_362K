package java_Method;

// Sum of Natural Numbers Using Recursion
public class RecursionExample1 {

	public static void main(String[] args) {

		
		int result = sum(10);
		System.out.println (result);
		

	}
	
	public static int sum(int k)
	{
		if(k>0)
		{
			return k+ sum(k-1);
		}
		
		else
		{
			return 0;
		}
	}

}

