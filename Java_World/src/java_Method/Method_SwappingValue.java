package java_Method;

public class Method_SwappingValue {

	public static void main(String[] args) {

		int a =30;
		int b =45;
		System.out.println("Before swapping, a =" +a+ " and b ="+b);
		swapValueinFunction(a,b);
		System.out.println("\n Now ,Before and After swapping values will be same here");
		System.out.println("After swapping, a = "+a + ", b = "+b);
	}

public static void swapValueinFunction(int a, int b) {
	System.out.println("Before swapping(Inside), a = "+a + ", b = "+b);
	
	int c =a;  // a(30) value moved to c (),now a (empty) is  empty
	a= b;  // b(45) value moved  a, because a is empty, now a is 45
	b=c;  // c(30)  value   moved  to b(empty) , now b is 30
	System.out.println("After Swapping(Inside), a = "+a + ", b = "+b);


	
	}

}
