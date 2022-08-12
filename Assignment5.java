import java.util.*;
class BankAccount
{
	int AccountNumber;
	double  bal;
	String ownerName;
	
	BankAccount()
	{
		int acNo;
		double bal;
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name : ");
		name = sc.nextLine();
		System.out.println("Enter the Account Number : ");
		acNo = sc.nextInt();
		System.out.println("Enter the balance :");
		bal = sc.nextDouble();
		this.AccountNumber = acNo;
		this.bal = bal;
		this.ownerName = name;
	}

	void balance()
	{
		System.out.println("The current balance is : "+bal);
	}

	void add(double value)
	{
		this.bal+=value;
	}

	void subtract(int value)
	{
		this.bal-=value;
	}

	void details()
	{
		System.out.println("The Account Number : "+AccountNumber);
		System.out.println("The Name is "+ownerName);
		System.out.println("The balance is "+bal);
		System.out.println("----------------------------------");
	}
}

class AccountManager
{
	BankAccount ob[] = new BankAccount[100];
	int ind = -1;
	int size = 0;
	void create()
	{
		ind++;
		ob[ind] = new BankAccount();
		size++;
	}

	void delete(int index)
	{
		ob[index] = null;
	}

	void deposite(int index)
	{
		int value;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value to be deposited : ");
		value = sc.nextInt();
		ob[index].add(value); 
	}

	void withdraw(int index)
	{
		int value;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value to be withdrawn : ");
		value = sc.nextInt();
		ob[index].subtract(value);
	}
	
}

class Bank
{
	public static void main(String args[])
	{
		AccountManager a = new AccountManager();
		a.create();
		a.create();
		a.create();
		a.create();
		a.create();

		for(int i = 0; i < 5; i++)
		{
			a.ob[i].details();
		}
	}
}
