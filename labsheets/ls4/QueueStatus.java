import java.util.Scanner;

public class QueueStatus
{
	public static void main(String[] args)
	{
		Queue q = new Queue();
		Scanner s = new Scanner(System.in);
		int c, x;
		int con = 1;
		do
		{
			System.out.print("Select: \n1. Enqueue\n2. Dequeue\n3. Size\n4. IsEmpty\n5. IsFull\n6. Front\n7. Print");
			System.out.println("\nEnter: ");
			c = s.nextInt();
			switch(c)
			{
				case 1: System.out.println("Enter number to enter: ");
						x = s.nextInt();
						q.Enqueue(x);
						break;
				case 2: q.Dequeue();
						break;
				case 3: q.Size();
						break;
				case 4: if(q.IsEmpty())
							System.out.println("Queue is empty!");
						else
							System.out.println("Queue is not empty!");
						break;
				case 5: if(q.IsFull())
							System.out.println("Queue is full!");
						else
							System.out.println("Queue is not full!");
						break;
				case 6: q.Front();
						break;
				case 7: q.DisplayQueue();
						break;
				default: System.out.println("Wrong choice!");
			}
			System.out.println("Choose again?(1/0)");
			con = s.nextInt();
			
		}while(con == 1);
		s.close();
	}
}
		
