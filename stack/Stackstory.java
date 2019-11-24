package stack;
public class Stackstory {
	protected int [] data;
	protected int tos=-1;
	public Stackstory(int cap) {
		this.data= new int [cap];
	}
	public int top(){
		if(isEmpty()==true){
			return -1;
		}
		return data[tos];	
	}
	
	public int size(){
		return tos+1;
	}
	public boolean isEmpty(){
		
		if(tos==-1){
			return true;
		}
		return false;
	}
	public void push(int val){
		
		if(size()==data.length){
			System.out.println("Stack is full");
			return;
		}
		tos++;
		data[tos]= val;
	}
	
	public int pop(){
		if(isEmpty()==true){
			System.out.println("stack is empty");
			return -1;
		}
		int item = data[tos];
		tos--;
		return item;
	}
	public void display(){
		for(int i=tos;i>=0;i--){
			System.out.println(data[i]);
		}
	}
	public boolean isfull(){
		if(tos==data.length-1){
			return true;
		}
		return false;	
	}
	public static void main(String[] args){
		DynamicStack st = new DynamicStack(5);
		st.push(20);
		st.push(30);
		st.push(5);
		st.push(25);
		st.push(5);
		st.push(4);
		st.display();
	}
}
