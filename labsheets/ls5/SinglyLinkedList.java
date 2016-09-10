import java.util.Scanner;

public class SinglyLinkedList
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		linkedList list = new linkedList();
		char ch;	
		do
		{
			System.out.println("Singly linked list operations");
			System.out.println("1.Insert at beginning");
			System.out.println("2.Insert at End");
			System.out.println("3.Insert at position");
			System.out.println("4.Delete at position");
			System.out.println("5.check empty");
			System.out.println("6.Get size");
			int choice = scan.nextInt();
			switch(choice)
			{
				case 1 : System.out.println("Enter the element to be Inserted");
					 list.insertAtHead(scan.nextInt());
					 break;
				case 2 : System.out.println("Enter the element to be Inserted");
					 list.insertAtEnd(scan.nextInt());
					 break;
				case 3 : System.out.println("Enter the element to be Inserted");
					 int x= scan.nextInt();
					 System.out.println("Enter the position number");
					 int pos = scan.nextInt();	
					 list.insertAtPos(x,pos);
					 break;
				case 4 : System.out.println("Enter the position to be deleted");
					 list.deleteAtPos(scan.nextInt());
					 break;
				case 5 : if(list.isEmpty())
						System.out.println("List is empty");
					 else
						 System.out.println("List is not empty");
					 break;				
				case 6 : System.out.println("The list size is " + list.getSize());
					 break;
				default : System.out.println("Invalid choice");
			}
			System.out.println("Do you want to continue('y' or 'n')");
			ch = scan.next().charAt(0);
		}while(ch == 'Y' || ch == 'y');
		list.displayList();
		System.out.println("The no. of nodes created is : " + list.CountNode());
	}
}
					 
