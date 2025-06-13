package encapsulation;

public class Bank_Main {

	public static void main(String[] args) {

		
		BankAccount account = new BankAccount("Prasanth",1001,5000);
	
	account.displayAccountInfo();
	account.deposit(1500);
	account.displayAccountInfo();
	
	
	
	//Trying to withdraw
	account.withdraw(1500);
	account.displayAccountInfo();
	
	
	
	//trying to withdraw
	account.withdraw(2000);
	account.displayAccountInfo();
	
    // Trying to set a bad name
	account.setAccountHolderName("");
	account.setAccountHolderName("sam");
	System.out.println("updated name:" +account.getAccountHolderName());
	
	
	//trying invalid operations
	account.deposit(-500);
	account.withdraw(10000); //more than balance
	
	}

}
