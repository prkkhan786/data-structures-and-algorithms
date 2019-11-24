package Queue;

public class Queuee {
	private int[] data;
	private int front = 0;
	private int size = 0;

	public Queuee(int cap) {
		this.data = new int[cap];
	}

	public void enqueue(int val) {
		if (isfull() == true) {
			System.out.println("Queue is full");
			return;
		}
		//System.out.println((front + size) % data.length);
		data[(front + size) % data.length] = val;
		size++;
	}

	public int dequeue() {
		if (isEmpty() == true) {
			System.out.println("queue is empty");
			return -1;
		}
		int ele = data[front];
		front = (front + 1) % data.length;
		//System.out.println(front);
		size--;
		return ele;
	}

	private boolean isEmpty() {
		if (size == 0)
			return true;
		return false;
	}

	public boolean isfull() {
		if (this.size == data.length) {
			return true;
		}
		return false;
	}

	public int size() {
		return size;
	}

	public int front() {
		return data[front];
	}

	public void display() {
		for (int i = 0; i < size; i++) {
			System.out.println(data[front + i]);
		}
	}

	public static void main(String[] args) {
		Queuee q = new Queuee(5);
		q.enqueue(20);
		q.enqueue(25);
		q.enqueue(10);
		q.enqueue(30);
		q.enqueue(40);
		q.display();
	}
}
