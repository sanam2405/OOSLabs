import java.util.*;
class Room
{
	int height,width,breadth;
	Room(int height, int width, int breadth)
	{
		this.height = height;
		this.width = width;
		this.breadth = breadth;
	}

	void volume()
	{
		int vol = height*width*breadth;
		System.out.println("The volume of the room is : "+vol);
	}
}

class RoomDemo
{
	
	public static void main(String args[]) 
	{
        
	int h,w,b;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the height of the room :" );
	h = sc.nextInt();
	System.out.println("Enter the width of the room :" );
	w = sc.nextInt();
	System.out.println("Enter the breadth of the room : ");
	b = sc.nextInt();

	Room room = new Room(h,w,b);
	room.volume();
	
	}

}
