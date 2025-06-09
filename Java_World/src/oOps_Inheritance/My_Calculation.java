package oOps_Inheritance;

public class My_Calculation extends Calculation{

	public void multiplication(int x,int y)
	{
		z = x* y;
		System.out.println("The sum of multication:  "+z);
	}
	
	
	public static void main(String[] args) {
		
		int a =20, b=10;
		My_Calculation calculate = new My_Calculation();
		calculate.addition(a, b);
		calculate.subtraction(a, b);
		calculate.multiplication(a, b);
		

	}

}
