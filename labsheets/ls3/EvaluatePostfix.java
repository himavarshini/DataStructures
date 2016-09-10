import java.io.*;


public class EvaluatePostfix
{
	public static int Operation(char x)
	{
		int op1 = st.getTop();
		st.pop();
		int op2 = st.getTop();
		st.pop();
		int res = 0;
		switch(x)
		{
			case '+' : res = op2+op1;
				   break;
			case '-' : res = op2-op1;
	   			   break;			
			case '*' : res = op2*op1;
				   break;
	   		case '/' : res = op2/op1;
		   		   break;			
			case '^' : res = op2^op1;
				   break;
			
		}
		return res;
	}
	
	public static boolean isOperator(char x)
	{	
		switch(x)
		{
			case '+' :
			case '-' :
			case '*' : 	
			case '/' :
			case '^' : return true;
			default  : return false;
		}
	}

	private static String postfixExp = new String() ;
	public static StackInt st = new StackInt();

	public static void main( String [] args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in) );
		System.out.println("Enter Postfix expression to evaluate");
		postfixExp = br.readLine();	
		
		for(int i =0; i<postfixExp.length();i++)
		{
			char ch = postfixExp.charAt(i);
			if(ch == ' ')
				i++;
			String str = new String();
			for(int j=i;!(postfixExp.charAt(j) == ' ');j++)
			{
				str = str + postfixExp.charAt(j);
			}			
			i+=1;	
			if(!(isOperator(ch)))
			{
				int ich = Integer.parseInt(str);
				st.push(ich);
			}
			else if(isOperator(ch))
			{
				st.push(Operation(ch));
			}	
		}
		if(st.isEmpty())
			System.out.println("Invalid Expression");
		else
			System.out.println("The value of the evaluated expression is " + st.stack[st.top]);
	}

}
