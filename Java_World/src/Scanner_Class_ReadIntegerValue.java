import java.util.Scanner;

public class Scanner_Class_ReadIntegerValue {
	
	


	public static void main(String[] args) {
		int num;
		System.out.println("Enter the integer: ");
		
		Scanner  s = new Scanner(System.in);
		
		
		num = s.nextInt();
		
		System.out.println("Entered interger is: "+ num);
		
		s.close();
		

	}

}
