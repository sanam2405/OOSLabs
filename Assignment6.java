class ComplexNumber
{
	int real, imaginary;
	ComplexNumber()
	{
		this.real = 0;
		this.imaginary = 0;
	}
	
	ComplexNumber(int r)
	{
		this.real = r;
		this.imaginary = 0;
	}	

	ComplexNumber(int r, int i)
	{
		this.real = r;
		this.imaginary = i;
	}

	void add(ComplexNumber ob1, ComplexNumber ob2)
	{
		int real = ob1.real+ob2.real;
		int img = ob1.imaginary+ob2.imaginary;
		System.out.println("The summation of the complex  numbers is : "+real+"+"+img+"i");
	}

	void multiply(ComplexNumber ob1, ComplexNumber ob2)
	{
		int real = ob1.real*ob2.real  - ob1.imaginary*ob2.imaginary;
		int img = ob2.real*ob1.imaginary+ob1.real*ob2.imaginary;
		System.out.println("The product of the complex  numbers is : "+real+"+"+img+"i");
	}
	
	public static void main(String args[])
	{
		ComplexNumber a = new ComplexNumber(3,2);
		ComplexNumber b = new ComplexNumber(4,-2);
		ComplexNumber obj = new ComplexNumber();
		obj.add(a,b);
		obj.multiply(a,b);
	}
}
