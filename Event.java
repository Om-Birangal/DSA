class Queue
{
	int maxSize;
	String QueueArray[];
	int front;
	int rear;
	int count;
	Queue(int size)
	{
		maxSize =size;
		QueueArray=new String[maxSize];
		front = 0;
		rear = -1;
		count = 0;
	}
	public void enQueue(String eventName)
	{
		if(front == maxSize -1)
		{
			System.out.println("Events are Full, no more Event can be happen");
		}
		else
		{
			rear = (rear+1)%maxSize;
			QueueArray[rear] = eventName;
			count++;
			System.out.println(eventName + "is added");
		}
		}
	public void deQueue()
	{
		if(rear == -1)
		{
			System.out.println("Events are Completed no more events are Executed Further");
		}
		else
		{
			System.out.println(QueueArray[front]+ " is removed");
			front = (front+1)%maxSize;
			count--;
		}
	}
	public void display()
	{
		if(rear==-1)
		System.out.println("Events are Completed no more events are Executed Further");
		else 
		{
			System.out.println("Pending Events are : ");
			for(int i = 0; i<count; i++)
			{
				int index = (front +i)%maxSize;
				System.out.println(QueueArray[index] + "\t");
			}
		}
	}	
}
public class Event
{
	public static void main(String s[])
	{
		Queue q1 =new Queue(5);
		q1.enQueue("Event 1");
		q1.enQueue("Event 2");
		q1.enQueue("Event 3");
		q1.enQueue("Event 4");
		q1.enQueue("Event 5");
		q1.display();
		q1.deQueue();
		q1.display();
		
	}
} 
