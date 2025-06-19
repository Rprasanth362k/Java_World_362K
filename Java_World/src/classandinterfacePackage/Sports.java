package classandinterfacePackage;

public interface Sports {
	public static final int val =10;
     //int val =10; by default  is public static final, instance variable not allowed interface
	
	 
	 void footBall(); // by default public and abstract ,static ,final,private ,protected,default not accetpted abstract method.because main goal
	// interface is override/implement the  implemented class.
	//public abstract void footBall();  above lines equals to below line.
	
	/*
	public void footBall() // abstract method do not define the body 
	{
		
	}
	*/
	 
	//java 7 to 8 between  only  interface only to allowed incompleted method (abstract method) , that time  interface  100% abstraction.
	 // java 8 to 9 between allowed to  concreate method , that mean method with body , it is now partial abstraction, introduced static, default method,java 9 after allowed to private method.
	public static void  cricket()
	{
		
	}
	default void  hockey()
	{
		
	}

}
