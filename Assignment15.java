interface Shape
{
        void area();
        void draw();
        void rotate();
        void move();
}

class Circle implements Shape
{
        Circle(int number)
	{
		System.out.println("---------------------------------------------");
		System.out.println("Printing details of circle "+number+" : ");
	}

	public void area()
        {
                System.out.println("Area of circle is PI * Radius * Radius");
        }

        public void draw()
        {
                System.out.println("Drawing a circle");
        }

        public void rotate()
        {
                System.out.println("Rotating the circle");
        }

        public void move()
        {
                System.out.println("Moving the circle");
        }

	void getDetails()
	{
		this.area();
		this.draw();
		this.rotate();
		this.move();
	}
}

class Rectangle implements Shape
{       
	Rectangle(int number)
	{
		System.out.println("---------------------------------------------");
		System.out.println("Printing details of rectangle "+number+" : ");
	}

        public void area()
        {
                System.out.println("Area of rectangle is Length * Breadth");
        }

        public void draw()
        {
                System.out.println("Drawing a rectangle");
        }

        public void rotate()
        {
                System.out.println("Rotating the rectangle");
        }

        public void move()
        {
                System.out.println("Moving the rectangle");
        }

	void getDetails()
	{
		this.area();
		this.draw();
		this.rotate();
		this.move();
	}
}

class Shapes
{
	public static void main(String args[])
	{
		Circle c1 = new Circle(1);
		c1.getDetails();

		Circle c2 = new Circle(2);
		c2.getDetails();

		Rectangle r1 = new Rectangle(1);
		r1.getDetails();

		Rectangle r2 = new Rectangle(2);
		r2.getDetails();

		Rectangle r3 = new Rectangle(3);
		r3.getDetails();
	}
}

