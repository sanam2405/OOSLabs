class Stack
{
	int arr[];
	int size;
	int top;
	Stack(int N)
	{
		arr = new int[N];
		size = N;	
		top = -1;
	}

	void push(int value)
	{
		if(top < size)
		top++;
		arr[top] = value;
		size++;
	}

	void pop()
	{
		if(top >= 0)
		top--;
		size--;
	}

	void print()
	{
		System.out.println("The elements in the stack are : ");
		for(int i = top; i >= 0; i--)
		System.out.print(arr[i]+" ");
		System.out.println();
	}

	public static void main(String args[])
	{
		Stack st = new Stack(30);
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(15);
		st.push(9);
		
		st.print();
		
		st.pop();
		st.pop();
		st.pop();

		st.print();
	}

}
