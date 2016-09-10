public class linkedList
{
	public Node head;
	/* Constructor */
	public linkedList()
	{
		head = null;
	}
	//Methods	
	public void insertAtHead(int x)
	{
		Node newnode = new Node(x);
		if(head == null)
			head = newnode;
		else
		{
		newnode.next = head;
		head = newnode;
		}
	}
	public void insertAtEnd(int x)
	{
		Node newnode = new Node(x);
		if(head == null)	
			head = newnode;
		else if(head.next == null)
			head.next = newnode;
		else
		{
			Node tmp = head;
			while(tmp.next != null)
				tmp = tmp.next;
			tmp.next = newnode;
		}
	}
	public void insertAtPos(int x,int pos)
	{
		Node newnode = new Node(x);
		if(pos == 1)
		{
			newnode.next = head;
			head = newnode;
		}
		else
		{
			Node tmp = head;
			int i=1;
			while(i != pos-1)
			{
				tmp = tmp.next;
				i++;			
			}	
			newnode.next = tmp.next;
			tmp.next = newnode;
		}
	}
	public void deleteAtPos(int pos)
	{
		if(pos==1)
		{
			if(head.next != null)
				head = head.next;
			else if(head == null)
				System.out.println("Can't DELETE");
			else
				head = head.next;
		}
		else
		{
			int i=1;
			Node tmp = head;
			while(i!=pos-1)
			{
				tmp = tmp.next;
				i++;
			}
			tmp.next = tmp.next.next;
		}
	}
	public boolean isEmpty()
	{	
		if(head == null)
			return true;
		else
			return false;
	}
	
	public int getSize()
	{
		if(head == null)	
			return 0;
		else
		{
			int size=1;
			Node tmp=head;
			while(tmp.next!=null)
			{
				tmp = tmp.next;
				size++;
			}
			return size;
		}
	}
	public void displayList()
	{
		System.out.println("The list elements are");
		if(head == null)
			System.out.println("List is empty");
		else if(head.next == null)
			System.out.println(head.data);	
		else
		{	
			Node tmp = head;
			while(tmp.next != null)
			{
				System.out.print(tmp.data + "	");
				tmp = tmp.next;
			}
			System.out.println(tmp.data);
		}
	}  
	
	public int CountNode()
	{
		return Node.count;	
	}
}
			
