import java.util.*;
class Book
{
	String bookName[] = new String[3];
        String authorName[] = new String[3];
	String publisher[] = new String[3];
	int cost[] = new int[3];
	int stock[] = new int[3];
	
	String bookSearched;
	int copiesRequired;
	int idx;

	Book()
	{
		bookName[0] = "Gitanjali";
		bookName[1] = "Alchemist";
		bookName[2] = "Feluda";

		authorName[0] = "Rabindranath Tagore";
		authorName[1] = "Paulo Coelho";
		authorName[2] = "Satyajt Ray";

		publisher[0] = "Visva Bharati Press";
		publisher[1] = "Harper Collins";
		publisher[2] = "Anada Publishers";
		
		cost[0] = 200;
	        cost[1] = 350;
		cost[2] = 450;

		stock[0] = 50;
	        stock[1] = 75;
		stock[2] = 40;
	}

	void searchBook()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the book : ");
		bookSearched = sc.next();
		idx = -1;
		for(int i = 0; i < 3; i++)
		{
			if(bookSearched.equalsIgnoreCase(bookName[i])==true)
			{
				idx = i;
				break;
			}
		}	
		
		System.out.println("\t\t\t   SEARCHING THE BOOK   \t\t\t");
		System.out.println("-----------------------------------------------------------------------------------------");
		if(idx!=-1)
		{
			System.out.println("The book is found!");
			System.out.println("\t\t\t   BOOK DETAILS   \t\t\t");
			System.out.println("Author : "+authorName[idx]);
			System.out.println("Publisher : "+publisher[idx]);
			System.out.println("Price : "+cost[idx]);

			System.out.println("Enter the number of copies requied : ");
			copiesRequired = sc.nextInt();

			if(copiesRequired <= stock[idx])
			{
				int amount = copiesRequired * cost[idx];
				System.out.println("The total amount to be paid is : "+amount);
				System.out.println("\t\t\t   THANKS FOR SHOPPING   \t\t\t");
				System.out.println("-----------------------------------------------------------------------------------");
			}
			
			else
			{
				System.out.println("Sorry! Number of copies available is : "+stock[idx]);
				System.out.println("----------------------------------------------------------------------------------");
			}
		}

		else
		{
			System.out.println("Sorry the book is not available!");
			System.out.println("-----------------------------------------------------------------------------------");
		}		
	}

	public static void main(String args[])
	{
		Book obj = new Book();
		obj.searchBook();
	}
}
