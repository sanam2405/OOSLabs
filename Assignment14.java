import java.util.*;
class Automobile
{
	String make;
	String type;
	int maxSpeed;
	int price;
	int mileage;
	int registrationNumber;
	

	void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the make of the car : ");
		make = sc.next();
		System.out.println("Enter the type of the car : ");
		type = sc.next();
		System.out.println("Enter the maximum speed of the car : ");
		maxSpeed = sc.nextInt();
		System.out.println("Enter the price of the car : ");
		price = sc.nextInt();
		System.out.println("Enter the mileage of the car : ");
		mileage = sc.nextInt();
		System.out.println("Enter the registration number of the car : ");
		registrationNumber = sc.nextInt();
	}	
}

class Track extends Automobile
{
	int capacity;
	String hoodType;
	int noOfWheels;

	void getDataTrack()
        {
                Scanner sc = new Scanner(System.in);
		System.out.println("Enter the hood type : ");
		hoodType = sc.next();
                System.out.println("Enter the capacity :");
                capacity = sc.nextInt();
                System.out.println("Enter the number of wheels : ");
                noOfWheels = sc.nextInt();
        }

        void getDetails()
        {
                System.out.println("The make is : "+make);
                System.out.println("The type is : "+type);
                System.out.println("The maximum speed is "+maxSpeed);
                System.out.println("The price is :"+price);
                System.out.println("The mileage is :"+mileage);
                System.out.println("The registration number is : "+registrationNumber);
                System.out.println("The hood type is :"+hoodType);
                System.out.println("The capacity is :"+capacity);
		System.out.println("The number of wheels is :"+noOfWheels);
		System.out.println("-----------------------------------------------------------------------");
        }

	
}

class Car extends Automobile
{
	int noOfDoors;
	int seatingCapacity;

	void getDataCar()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of doors : ");
		noOfDoors = sc.nextInt();
		System.out.println("Enter the seating capacity : ");
		seatingCapacity = sc.nextInt();
	}

	void getDetails()
	{
		System.out.println("The make is : "+make);
		System.out.println("The type is : "+type);
		System.out.println("The maximum speed is "+maxSpeed);
		System.out.println("The price is :"+price);
		System.out.println("The mileage is :"+mileage);
		System.out.println("The registration number is : "+registrationNumber);
		System.out.println("The number of doors is :"+noOfDoors);
		System.out.println("The seating capacity is :"+seatingCapacity);
                System.out.println("-----------------------------------------------------------------------");
	}
}

class Vehicle
{
	public static void main(String args[])
	{
		Track obj1 = new Track();
		Car obj2 = new Car();

		obj1.getData();
		obj1.getDataTrack();

		obj2.getData();
		obj2.getDataCar();

		obj1.getDetails();
		obj2.getDetails();
	}
}
