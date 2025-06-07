package typecasting;

public class Narrowing_Test2 {

	public static void main(String[] args) {
		
		int num =501;
		
		//type casting int to double
		double doubleNum = (double) num;
		
		System.out.println("Type casting int to double: "+doubleNum);
		
		//type casting   double to  int
       // data loss in narrowing casting , because is can  not hold larger data to small type data type                           
		int   num2 = (int) doubleNum;
		
		System.out.println("Type casting   double to int: "+num2);


	}

}
