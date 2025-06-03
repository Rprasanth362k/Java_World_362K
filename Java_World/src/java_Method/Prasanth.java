package java_Method;

public class Prasanth extends Student  {
	private int rollNo;
    
	// constructor 
	public Prasanth(String name, int id, int rollNo)
	{
		super(name,id);
		this.rollNo = rollNo;
    }
	
	//display method 
	public  void displayStudentInfo()
	{
		System.out.println("Name: " + getName()); // use getter to access private variable
	    System.out.println("ID: "+getId());
	    System.out.println("Rollo No:"+ rollNo);
	}
	
	
	//main method 
	public static void main(String[] args) 
	{
		
    Prasanth  student = new Prasanth("samvel",101,9717);
    
	  student.displayStudentInfo();

	}

}
