
public class CircularQueue {

	
	int data[];
	int front = 0;
	int rear = 0;
	int size = 0;

	public CircularQueue(int cap) {
		this.data = new int[cap];
	}

	public void insertion(int val) {
		if (size == data.length) {
			System.out.println("Queue is full");
			increasecapacity();
			data[(front + size) % data.length] = val;
			size++;
			
		} else {
			
		}
	}

	private void increasecapacity() 
	{
		int newcap = data.length *2;
		int newarr[] = new int[newcap];
		for(int i =0;i<size;i++)
		{
			
			newarr[front+i] = data[front+i];
		}
		data= newarr;
	}
	
	

	public int deletion()
	{
		
		if (size == 0) 
		{
			System.out.println("Queue is empty");
			return -1;
		} else
		{
			int val = data[front];
			front = (front + 1) % data.length;
			size--;
			return val;
		}
	}

	
	public void display() 
	{
		for (int i = 0; i < size; i++) 
		{
			System.out.println(data[front+i]);
		}
	}

	
	public static void main(String[] args) {
		CircularQueue a = new CircularQueue(5);
		a.insertion(1);
		a.insertion(2);
		a.insertion(3);
		a.insertion(4);
		a.insertion(5);
		a.insertion(6);
		//System.out.println(a.data.length);
		a.display();
	}
}
