package java_Method;

public class JavaReturnandVoid{

	public static void main(String[] args) {
		int Balance =myAccountBalance(100);
System.out.println("Balance: "+Balance);
System.out.println("\n");
samInfo(25,55);
char [] data=samInfo(25,55,5.9);
System.out.println(data);


	}

static void samInfo(int i, int j) {
	
	System.out.println("Age: "+i);
	System.out.println("Weight: "+j);
	
		
	}
// differen  paremeter if you have ,  how to return  ?
static char[] samInfo(int i, int j, double d) {
	System.out.println("differen  paremeter if you have ?  how to return ");
	String data = "Age:" +i+", weight"+j+", Height:"+d;
	return data.toCharArray(); //convert to char[]
	
}

static int myAccountBalance(int AccountBalnce ) {
	
	int myPurse = 1;
	int Balance =myPurse+AccountBalnce;
		return Balance;
	}


}
