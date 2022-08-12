import java.util.*;
class Account
{
	int accountNumber;
	String holderName;
	double balance;

	Account()
	{
		this.accountNumber = -1;
		holderName = "";
		balance = 0.0d;
	}

	void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the account number : ");
		accountNumber = sc.nextInt();
		String dummy = sc.nextLine();
		System.out.println("Enter the account holder name : ");
		holderName = sc.nextLine();
		System.out.println("Enter the balance : ");
		balance = sc.nextDouble();
	}

	void putData()
	{
		System.out.println("The account number is : "+accountNumber);
		System.out.println("The account holder name is : "+holderName);
		System.out.println("The available balance is : "+balance);
	}
}

class SavingsAccount extends Account
{
	double interestRate = 3.5;

	void calculateYearlyInterest()
	{
		double interest = (balance*interestRate*1.0)/100.0;
		System.out.println("The yearly interest is : "+interest);
		System.out.println("-----------------------------------------");
	}
}

class CurrentAccount extends Account
{

}

class Manager
{
	public static void main(String args[])
	{
		SavingsAccount sa1 = new SavingsAccount();
		sa1.getData();
		CurrentAccount ca1 = new CurrentAccount();
		ca1.getData();
		sa1.putData();
		sa1.calculateYearlyInterest();
		ca1.putData();
	}
}
