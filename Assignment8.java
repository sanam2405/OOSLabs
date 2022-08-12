import java.util.Scanner;
class Book
{
	String title;
	String author[];
	int pages;
	float price;
	String pub;
	
	Book()
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the title of the book : ");
		this.title = sc.nextLine();
		System.out.println("Enter the publisher : ");
		this.pub = sc.nextLine();
		System.out.println("Enter the number of pages : ");
		this.pages = sc.nextInt();
		System.out.println("Enter the price : ");
		this.price = sc.nextFloat();
		System.out.println("Enter the number of authors : ");
		n = sc.nextInt();
		author = new String[n];
		String dummy = sc.nextLine();
		System.out.println("Enter the name of the authors : ");
		for(int i = 0 ; i < n; i++)
		this.author[i] = sc.nextLine();
	}	
}

class Library
{
	Book obj[] = new Book[100];
	int ind = -1;
	float totalPrice = 0;
	void add()
	{
		ind++;
		obj[ind] = new Book();
	}

	void remove(int idx)
	{
		obj[idx] = null;
	}

	void getTotalPrice()
	{
		for(int i = 0; i <= ind; i++)
		totalPrice+=obj[i].price;
	}
	
	public static void main(String args[])
	{
		Library ob = new Library();
		ob.add();
		ob.add();
		ob.add();
		ob.add();
		ob.add();
		ob.getTotalPrice();
		System.out.println("Total price of all the books is : "+ob.totalPrice);
	}
}
