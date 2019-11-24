package DataStructure;

public class DSlinkedllist {
	private class node{
		node next;
		int data;		
	}
	
	node head;
	node tail;
	int size =0;
	
	public void addlast(int val){
		node n = new node();
		n.data = val;
		n.next = null;
		
		if(size>0){
			tail.next = n;
			tail=n;
			size++;
		}else{
			tail = head = n;
			size++;
		}
	}
	
	public void display(){
		node temp = head;
		while(temp!=null){
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
}
