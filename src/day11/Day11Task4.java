package day11;

public class Day11Task4 {

	class Account 
	{
	    private String accountHolderName;
	    private int accountNumber;
	    private double balance;

	    public Account() 
	    {
	        this.accountHolderName = "Unknown";
	        this.accountNumber = 0;
	        this.balance = 0.0;
	    }

	    public Account(String name, double balance) 
	    {
	        this.accountHolderName = name;
	        this.accountNumber = (int)(Math.random() * 10000); 
	        this.balance = balance;
	    }

	    public void deposit(double amount) 
	    {
	        if (amount > 0) 
	        {
	            balance += amount;
	            System.out.println("Deposited: " + amount);
	        }
	        else
	        {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	    public void withdraw(double amount)
	    {
	        if (amount > 0 && amount <= balance)
	        {
	            balance -= amount;
	            System.out.println("Withdrawn: " + amount);
	        } 
	        else
	        {
	            System.out.println("Insufficient balance or invalid amount.");
	        }
	    }

	    public void checkBalance()
	    {
	        System.out.println("Current balance: " + balance);
	    }

	    public void displayInfo() 
	    {
	        System.out.println("Account Holder: " + accountHolderName);
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Balance: " + balance);
	    }
	}

	public class Main 
	{
	    public static void main(String[] args)
	    {
	        Account acc1 = new Account(); 
	        Account acc2 = new Account("Alice", 1000.0);

	        System.out.println("Account 1:");
	        acc1.displayInfo();
	        acc1.deposit(500);
	        acc1.withdraw(200);
	        acc1.checkBalance();

	        System.out.println("\nAccount 2:");
	        acc2.displayInfo();
	        acc2.deposit(300);
	        acc2.withdraw(1500); 
	        acc2.checkBalance();
	    }
	}

}
