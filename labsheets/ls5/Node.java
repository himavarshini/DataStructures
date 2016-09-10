public class Node 
{
	public int data;
	public Node next;
	public static int count=0;
	/* Constructor */
	public Node()
	{
		count++;
		data = 0;
		next = null;
	}
	
	public Node(int x)
	{
		count++;
		data = x;
		next = null;
	}
	
	public Node(int x, Node n)
	{	
		count++;
		data = x;
		next = n;
	}

}
