public class CircularQueue
{
	public int n = 20;
	private int [] queue = new int [n];
	public int front = -1 , rear = -1;
	
	public void Enqueue(int X)
	{
		if(IsEmpty())
			front = rear = 0 ;
		else if(!IsEmpty())
		{
			rear = (rear+1)%n;
			
		else
		{
			System.out.println("Enqueue cant be done");
			break;
		}
		queue[rear] = X;
	} 
	
	public void Dequeue()
	{
		if(IsEmpty())
			System.out.println("Queue is empty no elements to remove");
		else if(front == rear)
			front = rear = -1;
		else 
			front = (front+1)%n;
	}
	
	public int Size()
	{
		if(IsEmpty())
			return 0;
		else if(front == rear)
			return 1;
		else
			return rear-front+1;
	}
		
	boolean IsEmpty()
	{
		if(front == -1 && rear == -1)
			return true;
		else 
			return false;
	}
	
	public int Front()
	{
		if(IsEmpty())
		{
			System.out.println("Queue is empty");
			return 0;
		}
		else 
			return queue[front];
	}

	public void DisplayQueue()
	{
		if(!(IsEmpty()) || front == rear)
		{
			if( !(IsEmpty()) )
			{
				int tmp = front;
				while(tmp < rear+1)
				{
					System.out.print(" " + queue[tmp]);
					tmp += 1;
				}
				System.out.println();
			}
			else
				System.out.println(queue[front]);
		}
		else
			System.out.println("Queue is Empty");		
	}
				 	 	
}
	
