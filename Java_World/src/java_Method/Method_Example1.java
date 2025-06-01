package java_Method;

// method  defining and  calling
public class Method_Example1 {

	public static void main(String[] args) {
  int total= add(210,210);
  System.out.println(" Return value example => Total: 210+210 = "+total);
  twlethMark(550);
	}
	
	//  method using to void example 
	public static void twlethMark(int mark)
	{
		if(mark>580)
		{
			System.out.println("Rank:A1");
		}
		else if (mark >=550)
		{
			System.out.println("Rank:A2");
			
		}
		else
		{
			System.out.println("Rank:A3");
		}
		
	}

	public static int add (int n1,int n2)
	{
		int total = n1+n2;
		
		return total;
		

	}

}
