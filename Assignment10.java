import java.util.*;
class Student
{
	String name;
	int roll;
	String subjects[] = new String[2];
	
	Student()
	{
		this.name = "";
		this.roll = 0;
	}

	void set()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the student : ");
		name = sc.nextLine();
		System.out.println("Enter the roll number of the student : ");
		roll = sc.nextInt();
		System.out.println("Enter the name of two subjects : ");
		for(int i = 0; i < 2; i++)
		subjects[i] = sc.next();
	}

	void get()
	{
		System.out.println("The name of the student is : "+name);
		System.out.println("The roll number of the student is : "+roll);
	}
}

class TabulationSheet
{
	int roll[];
	int marks[];
	int N;

	TabulationSheet(int n)
	{
		roll = new int[n];
		marks = new int[n];
		N = n;
	}
	
	void getMarks()
	{
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < N; i++)
		{
			System.out.println("Enter the roll number : ");
			int current_roll = sc.nextInt();
			System.out.println("Enter the marks obtained : ");
			int marks_obtained = sc.nextInt();
			roll[i] = current_roll;
			marks[i] = marks_obtained;
		}
	}
}

class Marksheet
{
	String name;
	int roll;
	int marksInAllSubjects[] = new int[5];
	
	Marksheet(Student obj)
	{
		this.name = obj.name;
		this.roll = obj.roll;
	}

	void calculate(TabulationSheet ts[])
	{
		for(int i = 0; i < ts.length; i++)
		{
			int flag = 0;
			for(int j = 0; j < 3; j++)
			{ 
				if(ts[i].roll[j] == this.roll)
				{
					flag = 1;
					marksInAllSubjects[i] = ts[i].marks[j];
					break;
				}																																		                }

			if(flag == 0)
			marksInAllSubjects[i] = 0;
		}					
	}

	void show()
	{
			System.out.println("The name of the student is : "+this.name);
			System.out.println("The roll number of the student is "+this.roll);
			System.out.println("Marks Obtained : ");
			for(int i = 0; i < 2; i++)
			{
				System.out.println("Marks obained in subject "+(i+1)+" is : "+marksInAllSubjects[i]);
			}
			
			System.out.println("-----------------------------------------------");
	}

	public static void main(String args[])
	{
		Student st1 = new Student();
		Student st2 = new Student();
		Student st3 = new Student();
		st1.set(); st2.set(); st3.set();

		TabulationSheet ts[] = new TabulationSheet[2];

		for(int i = 0;i < 2; i++)
		{
			ts[i] = new TabulationSheet(3);
			System.out.println("Enter the marks for subject :"+(i+1));
			ts[i].getMarks();
		}

		Marksheet ms1 = new Marksheet(st1);
		Marksheet ms2 = new Marksheet(st2);
		Marksheet ms3 = new Marksheet(st3);

		ms1.calculate(ts); ms2.calculate(ts); ms3.calculate(ts);

		ms1.show();
		ms2.show();
		ms3.show();
	}
}
