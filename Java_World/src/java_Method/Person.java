package java_Method;

public class Person {
private String name="sam";
private int age=12;


// two way to achive the private to access  one using getter and seeters and   secound one  using constructor with(super(_ in subclass) 
/*
 * (or)
 * 
 * private String name;
 * Private int age;
 * 
 * and  use  below and construtor create the object of the  main class.
 */
/*
public Person(String name, int age)
{
	this.name= name;
	this.age = age;
	
}
*/
//Access method (getter) for name

public String getName()
{
	return name;
}
//mutator method (setter) for name
public  void setName(String name)
{
	this.name = name;
	
}
//Access method (getter) for age

public int getAge()
{
	return age;
}

public  void setAge(int age)
{
	this.age=age;
	
}


public void displauinfo()
{
	System.out.println("Name:  "+name);
	System.out.println("Age: "+age);

	
}
	

	}

