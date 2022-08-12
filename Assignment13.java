import java.util.*;
class Person
{
	int age;
	double weight;
	double height;
	String dob;
	String address;
	
	void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of the person : ");
		age = sc.nextInt();
		System.out.println("Enter the weight of the person : ");
		weight = sc.nextDouble();
		System.out.println("Enter the height of the person : ");
		height = sc.nextDouble();
		String dummy = sc.nextLine();
		System.out.println("Enter the date of birth of the person : ");
		dob = sc.nextLine();
		System.out.println("Enter the address of the person : ");
		address = sc.nextLine();
	}

}

class Employee extends Person
{
	int salary;
	int dateOfJoining;
	int experience;
	
	void getEmployeeData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary : ");
		salary = sc.nextInt();
		System.out.println("Enter the date of joining : ");
		dateOfJoining = sc.nextInt();
		System.out.println("Enter the years of experience :");
		experience = sc.nextInt();
	}

	void getDetails()
	{
		System.out.println("Age of the person is : "+age);
		System.out.println("Weight of the person is : "+weight);
		System.out.println("Height of the person is : "+height);
		System.out.println("Date of Birth of the person is : "+dob);
		System.out.println("Address of the person is :"+address);
		System.out.println("Salary of the person is :"+salary);
		System.out.println("Date of joining of the person is : "+dateOfJoining);
		System.out.println("The years of experience of the person is :"+experience);
	}	
}

class Student extends Person
{
	int roll;

        void getStudentData()
        {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the roll number : ");
                roll = sc.nextInt();
        }
 
        void getDetails()
        {
                System.out.println("Age of the person is : "+age);
                System.out.println("Weight of the person is : "+weight);
                System.out.println("Height of the person is : "+height);
                System.out.println("Date of Birth of the person is : "+dob);
                System.out.println("Address of the person is :"+address);
                System.out.println("Roll number of the person is :"+roll);
        }

	
}

class Technician extends Employee
{

}

class Professor extends Employee
{
	String course[] = new String[3];
	String listOfAdvisee[] = new String[3];

	void getProfessorData()
        {
	        Scanner sc = new Scanner(System.in);
                System.out.println("Enter the first course : ");
                course[0] = sc.next();
                System.out.println("Enter the second course : ");
                course[1] = sc.next();
                System.out.println("Enter the third course :");
                course[2] = sc.next();

		System.out.println("Enter the first advisee : ");
                listOfAdvisee[0] = sc.next();
                System.out.println("Enter the second advisee : ");
                listOfAdvisee[1] = sc.next();
                System.out.println("Enter the third avisee :");
                listOfAdvisee[2] = sc.next();

        }
 
        void getDetails()
        {
                System.out.println("Age of the person is : "+age);
                System.out.println("Weight of the person is : "+weight);
                System.out.println("Height of the person is : "+height);
                System.out.println("Date of Birth of the person is : "+dob);
                System.out.println("Address of the person is :"+address);
                System.out.println("Course one is "+course[0]);
                System.out.println("Course two is "+course[1]);
		System.out.println("Course three is "+course[3]);
		System.out.println("Advisee one is "+listOfAdvisee[0]);
		System.out.println("Advisee two is "+listOfAdvisee[1]);
		System.out.println("Advisee three is "+listOfAdvisee[2]);
        }

}

class Human
{
	public static void main(String args[])
	{
		Employee ob1 = new Employee();
		Student ob2 = new Student();
		Professor ob3 = new Professor();

                ob1.getData();
		ob1.getEmployeeData();
		ob2.getData();
		ob2.getStudentData();
		ob3.getData();
		ob3.getProfessorData();

		ob1.getDetails();
		ob2.getDetails();
		ob3.getDetails();
	}
}
