public class ParenthesisBalence
{
	 char stack[] = new char[10];

	String  EXP = new String(exp);
	int top = -1 ;

	public void push(char x)
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

	public boolean OpeningBracket(char x)
	{
		switch(x)
		{
			case '{': return true;
			case '(': return true;

			case '[': return true;

			default : return false;
		}
	}

	public char CorrespondingBracket(char x)
	{
		switch(x)
		{
			case '{': return '}';

			case '(': return ')';

			case '[': return ']';

			default : return 'a';
		}
	}

	public static void main(String [] args)
	{
		for(int i=0 ; i<EXP.length(); i++)
		{
			char c = EXP.charAt(i);
			if(OpeningBracket(c))
			{
				push(c);
			}

			if(EXP.charAt(i) == CorrespondingBracket(stack[top]))
			{
				pop();
				i += 1;
			}
			else
			{
				System.out.println(i+1);
			}
		}
		if(top == -1)
			System.out.println("Success");
		else
		{
			i = 0;
			while(EXP.charAt(i)==stack[top])
				i++;
			System.out.println(i+1);
		}
	}

}
						
