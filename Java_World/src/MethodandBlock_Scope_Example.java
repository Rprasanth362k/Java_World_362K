
public class MethodandBlock_Scope_Example {

	public static void main(String[] args) {
  //System.out.println(x);
		int a =100;
		System.out.println(a);
		
		
		//method Scope: x is visible any where inside main method
		//Anywhere in the method
		int x =100;
		System.out.println("x in method:"+x);
		
		if(x>50)
		{
			//Block Scope: y is only visible inside this if block
			//only inside the block
			int y =200;
			System.out.println("Y in if block: "+y);
			
		}
		// try to access y outside the block
	//	System.out.println("y is outside if block: "+y); //error not visble out of block
		
		
	}

}
