public class StackInt
{
	private static int n_size = 10;
 	static int stack[] = new int[n_size];
	static int top = -1 ;
	
	public void push(int x)
	{
		if(top == 10)
		{
			System.out.println("The stack is full");	
		}
		else
		{
			top += 1;
			stack[top] = x;	
		}
	}
	
	public void pop() 
	{
		if(top == -1)
		{
			System.out.println("The stack is empty");
			
		}
		stack[top] = 0;
		top -= 1;
	}
		
	public static void displayElements() 
	{
		System.out.println("The elements in stack are");
		for (int i = top; i >= 0; i--) 
		{
			System.out.println(stack[i]);
		}
	}

	public static int getSize()
	{
		return top+1;
	}
	
	public static int getTop()
	{
		return stack[top];
	}
	
	public boolean isEmpty()
	{
		if (top == -1)
			return true;
		else 
			return false;
	}
		
	public boolean isFull()
	{
		if(top == 10)
			return true;
		else 
			return false;
	}
	
	
}
