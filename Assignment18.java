interface Fruit
{
	void hasAPeel();
}

interface Vegetable
{
	void hasARoot();
}

class Tomato implements Fruit,Vegetable
{
	public void hasAPeel()
	{
		System.out.println("Has a peel!");
	}
	
	public void hasARoot()
	{
		System.out.println("Has a root!");
	}
}

class Plant
{
	public static void main(String args[])
	{
		Tomato obj = new Tomato();
		obj.hasAPeel();
		obj.hasARoot();
	}
}
