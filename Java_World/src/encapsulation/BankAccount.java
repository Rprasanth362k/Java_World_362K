package encapsulation;

public class BankAccount {
	
	// private variable - hidden from outside
	private  String  accountHolderName;
	private int accountNumber;
	private double balance;
	

	
	// constructor
	BankAccount(String name ,int accNumber, double initialBalance)

	{
		this.accountHolderName=name;
		this.accountNumber=accNumber;
		if (initialBalance >=0)
		{
		this.balance=initialBalance;
		
		}
		else
		{
			System.out.println("Invalid blance! setto 0 by default. ");
	        this.balance=0;
		}
	}
	
	public String getAccountHolderName()
	{
		return accountHolderName;
	}
	
	public void setAccountHolderName(String name)
	{
		if (name != null && !name.isEmpty())
		{
	this.accountHolderName= name;
		}else
		{
			System.out.println("Invalid name!");
			
		}
	}
    // Get balance (no direct access to variable)
	public double getBalance()
	{
		
		return balance;
	}
	// withdraw method with check
	public void deposit(double amount)
	{
		if (amount > 0 )
		{
			balance += amount;
			System.out.println("Deposited: "+ amount);
		}
		else {
			System.out.println("Invalid deposite amount!   ");
			
		}
	}
	
	// deposit method with validation
	public void withdraw (double amount)
	{
	if (amount > 0 &&amount <= balance)
	{
		
		balance -= amount;
		System.out.println(" Withdrawn:"+ amount);
	}
	else
	{
		System.out.println("Invalid funds");
	}
	}
	
	//Display details (read-only)
	
	public void displayAccountInfo()
	{
		System.out.println("Account Holder: "+ accountHolderName);
		System.out.println("Account Number: "+ accountNumber );
		System.out.println("Current Balance: "+ balance);


	}
	
}
