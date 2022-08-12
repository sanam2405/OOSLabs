import java.util.*;
import java.lang.*;
class Tollbooth
{
	int totalCarsPassed;
	int carsPassedWithoutPaying;
	int tollCollected;

	Tollbooth()
	{
		totalCarsPassed = 0;
	        carsPassedWithoutPaying = 0;
		tollCollected = 0;
	}

	void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of cars passed : ");
		totalCarsPassed = sc.nextInt();
		System.out.println("Enter the number of cars that did not pay the toll : ");
		carsPassedWithoutPaying = sc.nextInt();
		if(carsPassedWithoutPaying > totalCarsPassed)
		{
			System.out.println("Cars passed without paying toll must be less than the total number of cars passed!");
			System.exit(0);
		}
	}
 	
	void calculateToll()
	{
		tollCollected = 50*(totalCarsPassed-carsPassedWithoutPaying);
	}					

	void printDetails()
	{
		System.out.println("\t\t\t TOLL DETAILS \t\t\t");
		System.out.println("---------------------------------------------------------------");
		System.out.println("Total number of cars passed without paying : "+carsPassedWithoutPaying);
   		System.out.println("Total number of cars passed : "+totalCarsPassed);
		System.out.println("Total cash collected : "+tollCollected);
	}
}

class Traffic
{
	public static void main(String args[])
	{
		Tollbooth obj = new Tollbooth();
		obj.getData();
		obj.calculateToll();
		obj.printDetails();					
	}
}
