class Box
{

	int height;
	int width;
	int breadth;

	Box(int height, int width, int breadth)
	{
		this.height = height;
		this.width = width;
		this.breadth = breadth;
	}

	int getVolume()
	{
		int volume = height*width*breadth;
		return volume;		
	}

	int getArea()
	{
		int area = 2*(height*breadth+width*breadth+height*width);
		return area;		
	}


	public static void main(String args[])
	{
		Box box1 = new Box(10,20,30);
		System.out.println("Volume of the first box is  : "+box1.getVolume());
		System.out.println("Surface area of the first box is : "+box1.getArea());
		Box box2 = new Box(15,25,8);
		System.out.println("Volume of the second box is  : "+box2.getVolume());
		System.out.println("Surface area of the second box is : "+box2.getArea());
	}

}
