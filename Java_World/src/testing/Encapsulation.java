package testing;

public class Encapsulation {
	
	
	//private String name="sham";
	//private int age =26;
	
	private String name;
	private int age;
	
	public Encapsulation(String name ,int age)
	
	{
		this.name=name;
		this.age=age;
		
	}
	public String getName()
	{
		return name;
	}
	public void setName(String  name)
	{
      this.name =name;
	}

	public int getAge()
	{
		return age;
	}
	public void setAge(int age )
	{
      this.age=age;
	}
	
	
	public void infoDisplay()
	{
		System.out.println("Name:  "+name +"Age:  "+age);
	}

	

}
