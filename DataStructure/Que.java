package DataStructure;

public class Que {
	protected int [] data;
	protected int front =0;
	protected int size =0;
	
	public Que(int cap){
		this.data = new int[cap];
	}
	
	public void enqueue(int val){
		if(isfull()==true){
			System.out.println("Queu is full");
			return;
		}
		data[(front+size)%data.length] = val;
		size++;
		
	}

	public  boolean isfull() {
		if(size()==data.length){
			return true;
		}
		return false;
	}

	public int size() {
		return size;
	}
	public int dequeue(){
		if(isEmpty()==true){
			System.out.println("is empty");
			return-1;
		}
		int ele = data[front];
		front = (front + 1)%data.length;
		size--;
		return ele;
	}

	private boolean isEmpty() {
		if(size==0){
			return true;
		}
		return false;
	}
	public void display(){
		for(int i =0 ;i<size;i++){
			System.out.println(data[front+i]);
		}
	}
	public int front(){
		if(isEmpty()==true){
			System.out.println("is empty");
			return-1;
		}
		int ele = data[front];
		return ele;
	}
	public void main(String[] args){
		DynamicQueie a = new DynamicQueie(5);
		a.enqueue(10);
		a.enqueue(50);
		a.enqueue(50);
		a.enqueue(50);
		a.enqueue(50);
		a.enqueue(50);
		a.enqueue(50);
		a.display();
		
	}
	
}
