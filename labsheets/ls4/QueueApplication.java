public class QueueApplication
{
	public static void main(String [] args)
	{
		Queue q = new Queue();
		q.Enqueue(5);
		q.Enqueue(6);
		q.Enqueue(7);
		q.Dequeue();
		System.out.println("The size of queue is " + q.Size());
		if(!(q.Front() == 0))			
		System.out.println("The front element in the queue is " + q.Front());
		
	}
}
		
