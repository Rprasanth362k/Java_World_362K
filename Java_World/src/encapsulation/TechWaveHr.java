package encapsulation;

public class TechWaveHr {

	public static void main(String[] args) {
		
		// first object - setting values using constructor
		TechwaveEmployee person1 = new TechwaveEmployee("Prasanth","Empl001",15000.00);
		
		TechWaveHr person2 =  new TechWaveHr();
		
		// printing data
		System.out.println("Employee (Initial values):");
		System.out.println(person1.getEmp_id()+ " , "+ person1.getEmp_name()+" ," + person1.getNet_salary());
	
		// updating values setter methods
		person1.setEmp_id("Empl002");
		person1.setEmp_name("Vishal");
		person1.setNet_salary(50000.00);
		
		
		//printing data
		
		// printing data
				System.out.println("Employee (Updated values):");
				System.out.println(person1.getEmp_id()+ " , "+ person1.getEmp_name()+" ," + person1.getNet_salary());
		
	}

}
