import java.util.Scanner;

public class SortedInsertion_List
{
	static linkedList list = new linkedList();
	public static void SortedInsertion(int X)
	{
		if(list.head == null)
			list.insertAtHead(X);
		else
		{
			int i=1;
			Node tmp = list.head;
			while(X < tmp.data)
			{
				i++;
				tmp = tmp.next;
			}
			list.insertAtPos(X,i+1);
		}
	}
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		char ch;
		do
		{
			System.out.println("Enter the element to be inserted: ");
			SortedInsertion_List.SortedInsertion(s.nextInt());
			System.out.println("Do you want to insert more elements?('y' or 'n')");
			ch = s.next().charAt(0);
		}while(ch == 'Y' || ch == 'y');
		list.displayList();
	}		 
}					
