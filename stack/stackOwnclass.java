package stack;

public class stackOwnclass {
	private static int top = -1;
	private static int data[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stackOwnclass st = new stackOwnclass(10);

		// st.display();
		// System.out.println("--------------------");
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(60);
		st.pop();
		st.pop();
		st.display();
	}

	public stackOwnclass(int cap) {
		data = new int[cap];
	}

	public void push(int val) {
		if (data.length - 1 == top) {
			System.out.println("stack is full");
			return;
		}
		top++;
		data[top] = val;
	}

	public int pop() {
		if (top == -1) {
			System.out.println("stack is empty");
			return -1;
		}
		return data[top--];
	}

	public void display() {
		if (top == -1) {
			System.out.println("stack is empty");
			return;
		}
		for (int i = 0; i <= top; i++) {
			System.out.println(data[i]);
		}
	}

	public int peek() {
		if (top == -1) {
			System.out.println("stack is empty");
			return -1;
		}
		return data[top];
	}
}
