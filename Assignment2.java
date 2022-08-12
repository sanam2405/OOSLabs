import java.util.*;
class Student
{

	String name;
	int marks[] = new int[3];
	int totalMarks;	
	void setValue()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the student : ");
		name = sc.nextLine();
		System.out.println("Enter the marks in three subjects : ");
		for(int i = 0; i < 3; i++)
		marks[i] = sc.nextInt();
		totalMarks = 0;
	}

	void getAverage()
	{
		double average;
		for(int i = 0; i < 3; i++)
		totalMarks+=marks[i];
		average = (double) totalMarks / 3.0;
		System.out.println("The average marks obtained by "+name+" is : "+average);		
	}	
	
	void display()
	{
		System.out.println("The name of the student is : "+name);
		System.out.println("The total marks obtained is : "+totalMarks);		
	}

	public static void main(String args[])
	{
		Student s = new Student();
		s.setValue();
		s.getAverage();
		s.display();
	}

}

