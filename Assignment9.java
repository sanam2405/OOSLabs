import java.util.*;
class Employee
{
	String name;
	int id;
	String address;
	float sal;

	Employee()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the Employee : ");
		this.name = sc.nextLine();
		System.out.println("Enter the id of the Employee : ");
		this.id = sc.nextInt();
		String dummy = sc.nextLine();
		System.out.println("Enter the address of the Employee : ");
		this.address = sc.nextLine();
		System.out.println("Enter the salary of the Employee : ");
		this.sal = sc.nextFloat();
	}	
}

class Dept
{
	Employee obj[]  = new Employee[100];
	int ind = -1;
	float totalExp = 0;
		
	void add()
	{
		ind++;
		obj[ind] = new Employee();
	}

	void remove(int idx)
	{
		obj[idx] = null;
	}
	
	void totalExpenditure()
	{
		for(int i = 0; i <= ind; i++)
		totalExp+=obj[i].sal;
	}

	public static void main(String args[])
	{
		Dept InformationTechnology = new Dept();
		InformationTechnology.add();
		InformationTechnology.add();
		InformationTechnology.add();
		InformationTechnology.add();
		InformationTechnology.add();
		InformationTechnology.totalExpenditure();
		System.out.println("The yearly expenditure of the department is : "+InformationTechnology.totalExp);
	}
}
