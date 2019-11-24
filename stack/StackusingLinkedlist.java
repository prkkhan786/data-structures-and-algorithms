package stack;

import java.util.LinkedList;

public class StackusingLinkedlist {
	private int top=-1;
	private LinkedList<Integer> data = new LinkedList<>();
	public static void main(String[] args) {
		StackusingLinkedlist s = new StackusingLinkedlist();
		s.push(25);
		s.push(30);
		s.display();
		s.pop();
		s.pop();
		s.push(20);
		s.push(30);
		s.display();
	}
	public void push(int val){
		data.addLast(val);
		top=val; 
	}
	
	public int pop(){
		int l = top;
		data.removeLast();
		return l;
	}
	public void display(){
		for(int i : data){
			System.out.print(i+" ");
		}
	}

}
