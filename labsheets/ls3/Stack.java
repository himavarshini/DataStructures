public class Stack
{
	public static char stack[] = new char[20];
	public static int top = -1;

	public static void push(char x)
	{
		if(top == 20)
		{
			System.out.println("The stack is full");	
		}
		else
		{
			top += 1;
			stack[top] = x;	
		}	
	}
	
	public static void pop() 
	{
		if(top == -1)
		{
			System.out.println("The stack is empty");
			
		}
		stack[top] = 0;
		top -= 1;
	}
 	
	public static boolean isFull()
	{	
		if(top == 19)
			return true;
		else 	
			return false;
	}

	public static boolean isEmpty()
	{	
		if(top == -1)
			return true;
		else 	
			return false;
	}

	public static boolean OpeningBracket(char x)
	{
		switch(x)
		{
			case '{': 
			case '(':
				  
			case '[': return true;
				  
			default : return false;
		} 
	}

	public static boolean ClosingBracket(char x)
	{
		switch(x)
		{
			case '}': 
				  
			case ')': 
				  
			case ']': return true;
				  
			default : return false;
		} 
	}
}
