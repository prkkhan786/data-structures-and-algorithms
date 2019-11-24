
public class OwnStack {
	public static void main(String[] args) {
		OwnStack s = new OwnStack(5);

		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		//s.display();
		System.out.println(s.top());
	}

	private int data[];
	private int top = -1;
	int size = 0;

	public OwnStack(int cap) {
		this.data = new int[cap];
	}

	public void push(int val) {
		if (size == data.length) {
			System.out.println("isfull");
			return;
		}
		top++;
		data[top] = val;
		size++;
	}

	public int pop() {
		if (size == 0) {
			System.out.println("is empty");
			return -1;
		}
		return data[top--];
	}

	public void display() {
		for (int i = 0; i <= top; i++) {
			System.out.println(data[i]);
		}
	}

	public void size() {
		System.out.println(this.size);
	}

	public int top() {
		return data[top];
	}
}
