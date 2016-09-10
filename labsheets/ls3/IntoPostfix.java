import java.io.*;

public class IntoPostfix
{
	public static int prec(char x)
	{
		int pr=0;
		switch(x)
		{	
			case '+' :
			case '-' : pr = 1;
				   break;
			case '*' : 	
			case '/' : pr = 2;
				   break;
			case '^' : pr = 3;
				   break;
		}
		return pr;
	}

	
	public static boolean isOperator(int x)
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
	
	public static void main(String [] args)throws Exception
	{
		String infix ;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in) );
		System.out.println("Enter input string");
		infix = br.readLine();	
		StringBuilder postfix = new StringBuilder("                 ");
		Stack s = new Stack();
		int j=0;
		for(int i=0;i<infix.length() ; i++)
		{
			
			if(s.OpeningBracket(infix.charAt(i)) )
			{ 
				s.push(infix.charAt(i));
				
				while(!(s.ClosingBracket(infix.charAt(i))) )		
				{	
					i += 1;
					if( isOperator(infix.charAt(i)) )
					{
						if(s.isEmpty())
							s.push(infix.charAt(i));
						else
						{		
							if(prec(s.stack[s.top]) > prec(infix.charAt(i)) )
							{
								while(prec(s.stack[s.top]) >= prec(infix.charAt(i)) )
								{
									postfix.setCharAt(j,s.stack[s.top]);
									s.pop();
									j += 1;
									
								}						
							}
							else 
								s.push(infix.charAt(i));
							
						}
							
					}
					else   if(!(s.ClosingBracket(infix.charAt(i))))
					{
						postfix.setCharAt(j,infix.charAt(i));
						j+=1;
					}
					
				}
				
				while(!(s.OpeningBracket(s.stack[s.top])))				
				{
					postfix.setCharAt(j,s.stack[s.top]);
					j+=1;
					s.pop();	
					
				}		
				s.pop();
			}
			else
			{
				if( isOperator(infix.charAt(i)) )
				{
					if(s.isEmpty())
						s.push(infix.charAt(i));
					else
					{
						if(prec(s.stack[s.top]) > prec(infix.charAt(i)) )
						{
							postfix.setCharAt(j,s.stack[s.top]);
							s.pop();
							s.push(infix.charAt(i));
							j += 1;
						}
						else
							s.push(infix.charAt(i));
					}		
				}
					
				else   
				{
					postfix.setCharAt(j,infix.charAt(i));
					j+=1;
				}
			}		
		}	
		while(!s.isEmpty())
		{
			postfix.setCharAt(j,s.stack[s.top]);
			j+=1;
			s.pop();
		}	
		System.out.println("Postfix form of expression is : " + postfix);
		
	}
}		
	
