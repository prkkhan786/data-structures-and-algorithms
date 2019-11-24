package Stackwithqueue;

import DataStructure.Que;
import stack.Stackstory;

public class Stackwithqueue {
	Que dq;
	Que hq;
	
	
	public Stackwithqueue(int cap){
		
		dq = new Que(cap);
		hq = new Que(cap);
		
	}
	//pop efficiant
	public void push(int data){
	 while(dq.size()>0){
		 hq.enqueue(dq.dequeue());
		 
	 }
	 dq.enqueue(data);
	 
	 while(hq.size()>0){
		dq.enqueue(hq.dequeue());
	 }
	}
	public int size(){
		return dq.size();
	}
	public boolean isEmpty(){
		return dq.isfull();
	}
	public int pop(){
		return dq.dequeue();
	}
	public void display(){
		dq.display();
	}
	
	public static void main(String[] args){
		Stackwithqueue s = new Stackwithqueue(5);
		s.push(25);
		s.pop();
		s.display();
	}

}
