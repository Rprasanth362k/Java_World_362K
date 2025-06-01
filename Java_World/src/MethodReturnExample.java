
public class MethodReturnExample {

	public static void main(String[] args) {
		// 1. calling void method 
		 greet();
		 // 2. calling int return method
		   int sum=add(210,210);
		   System.out.println("sum: "+ sum);
		   //3.calling  String return method
		   String message=getMessage("Prasanth");
		   System.out.println(message);
		   //4. calling method that returns both and string
		      Object[] data=getUserinfo();
		      System.out.println("Id "+ data[0]);
		      System.out.println("Name "+ data[1]);

		       
	}
// 1.void method - just print 
	 static void greet() {
System.out.println("Hello ,Welcome to java ");
	 }
//2. return int
 
static int add(int num1,int num2)
{
	int sum= num1+num2;
	
	return sum;
	
}
//3. return string

static String getMessage(String name)
{
	return "Hi My name is " + name +" i am Javadeveloper";
}
	
//4. return  int and string  using object[] or Array
static Object[] getUserinfo()
{
	int id =101;
	String name ="Hellow";
	
	return new Object[] {id,name};
}

}
