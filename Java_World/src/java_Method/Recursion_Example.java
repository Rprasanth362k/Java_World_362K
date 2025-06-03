package java_Method;

// Factorial Using Recursion 
public class Recursion_Example {
	
	int fact(int n)
	{
		int result;
		
		if (n==1)
		
			return 1;
			result =fact(n-1) * n;
			
			/*fact(3-1) *3 -> fact (2) * 3  becomes -> (fact(1) *2)*3)
			 * fact(4-1) *4 -> fact (3) * 3  
			 * 
			 * 
			 * 
			 * 
			 */
			return result ;
			
		
	}
	

	public static void main(String[] args) {

		Recursion_Example obj1 = new Recursion_Example();
		System.out.println("Factorial of 3 is "+ obj1.fact(3));
		System.out.println("Factorial of 4 is "+ obj1.fact(4));
		System.out.println("Factorial of 5 is "+ obj1.fact(5));
/*
 * fact(5) = 5 x 4 x 3 x 2 x 1 =120
 * 
 * fact(1) = 1
 * fact(2) =1*2 =3 
 * fact(3) =2*3 =6
 * fact(4) =6*4 = 24
 * fact(5) =24*5 =120
 * 
 * ------------------
 * fact(4) = 4 × 3 × 2 × 1 = 24
 * 
 * fact(1) =1
 * fact(2) =1*2 =3 
 * fact(3) =2*3 =6
 * fact(4) =6*4 =24
 * fact(4) =24
 * ------------------
 * fact(3) = 3 × 2 × 1 = 6
 * 
 * fact(1) =1
 * fact(2) =1*2 =2
 * fact(3) =2*3 =6
 * 
 * ------------
 * 
 * 
 * 
 */
		
	}

}
