package logicProgramme;

public class ReadInetegerWithoutScanner {

	
	// read the number from  without scanner class

	
	public static void main(String[] args) {
    if (args.length >0) // check the  user entered input or no.
    {
    	int num =Integer.parseInt(args[0]);
    	// Integer.parseInt(args[0]); , Integer.parseInt -> it is convert  string to integer, args[0] , index of  array 0 the postion take the input 
    	// parse mean read and  convert , int means integer - string to int convert 
    	// example:-i entered arg tab 123 and it String args output 45  
    	// in eclipse right click file -> runs as -> run configuration -> argument tab  give nput and apply and run.
    	
    	// simple Integer ,java class  in java.lang package parseInt
    	//Integer -> class ,  parseInt method,
    	
    	System.out.println("Entered integer is: "+num);
    }
    else
    {
    	System.out.println("No integer entered");
    }
	}

}

/*int to String convert 
 * String.valueof();
 * 
 * 
 * /
 */