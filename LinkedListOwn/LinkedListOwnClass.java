package LinkedListOwn;

import Aug18.keypadcodes;

public class LinkedListOwnClass {

	public static void main(String args[]) {
		LinkedListOwnClass li = new LinkedListOwnClass();
		li.addlast(10);
		li.addlast(20);
		li.addlast(30);
		li.addlast(40);
		li.addlast(50);
		li.display();
		System.out.println();
//		System.out.println();
//		System.out.println(li.KthItemFromLast(1));
//		System.out.println();
//		System.out.println(li.kthfromlastwithoutsize(3));
		System.out.println(li.mid());
	}

	Node head;
	Node tail;
	int size = 0;

	class Node {
		int data;
		Node next;

		public Node(int val) {
			this.data = val;
		}
	}

	public void addlast(int val) {
		Node n = new Node(val);
		n.data = val;
		n.next = null;
		if (size > 0) {
			tail.next = n;
			tail = n;
		} else {
			head = tail = n;
		}
		size++;
	}

	public void addFirst(int val) {
		Node n = new Node(val);
		if (size <= 0) {
			head = tail = n;
			n.next = null;
		} else {
			n.next = head;
			head = n;
		}
		size++;
	}

	public Node getNodeAt(int i) {
		if (i == size) {
			return getNodeLast();
		}
		if (i == 1) {
			return getNodeFirst();
		}
		Node temp = head;
		int j = 1;
		while (j < i) {
			temp = temp.next;
			j++;
		}
		return temp;
	}

	public Node getNodeFirst() {
		return head;
	}

	public Node getNodeLast() {
		return tail;
	}

	public void addAtIndex(int val, int i) {
		if (i < 0 || i > size) {
			System.out.println("index of out of bond");
			return;
		}
		if (i == 0) {
			addFirst(val);
			return;
		} else if (i == size) {
			addlast(val);
			return;
		}
		Node n = new Node(val);
		Node temp = head;
		int o = 1;
		while (o < i) {
			temp = temp.next;
			o++;
		}
		Node c = temp.next;
		temp.next = n;
		n.next = c;
		size++;
	}

	// public int removelast() {
	// if (size == 0) {
	// System.out.println("List is empty");
	// return -1;
	// }
	// Node res = tail;
	// Node n = getNodeAt(size - 1);
	// n.next = null;
	// tail = n;
	// return res.data;
	// }

	public int removeFirst() {
		Node ans = head;
		head = head.next;
		return ans.data;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ->");
			temp = temp.next;
		}
	}

	public void reverselist() {
		for (int i = size; i > 0; i--) {
			Node res = getNodeAt(i);
			System.out.println(res.data);
		}
	}

	public void displayReverse() {
		displayReversehelper(head);
	}

	private void displayReversehelper(Node temp) {

		if (temp == null) {
			return;
		}
		displayReversehelper(temp.next);
		System.out.println(temp.data);
	}

	public void reverseData() {
		int left = 1;
		int right = size;
		while (left < right) {
			Node l = getNodeAt(left);
			Node r = getNodeAt(right);
			int temp = l.data;
			l.data = r.data;
			r.data = temp;
			right--;
			left++;
		}

	}

	public void ReverseLinkedListPointer() {
		Node prev = head;
		Node curr = head.next;
		while (curr != null) {
			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		Node temp = tail;
		tail = head;
		head = temp;
		tail.next = null;
	}

	public void ReverseRecursive() {
		ReverseRecursivehelper(head);

	}

	private void ReverseRecursivehelper(Node head2) {
		if (head2.next == null) {
			return;
		}
		ReverseRecursivehelper(head2.next);
		head2.next.next = head2;

	}

	public void rhelp() {
		r(head, head);
	}

	class heapmover {
		Node n;
	}

	public void r(Node node, Node h) {
		if (node == null) {
			return;
		}
		System.out.println(node.data);
		r(node.next, head);
		System.out.print(node.data + " ->");
	}

	public boolean ipalindrome() {
		heapmover h = new heapmover();
		h.n = head;
		return ispalindromehelper(head, h);
	}

	private boolean ispalindromehelper(Node hea, heapmover left) {
		// TODO Auto-generated method stub
		if (hea == null) {
			return true;
		}
		boolean res = ispalindromehelper(hea.next, left);
		if (res == false) {
			return false;
		} else {
			if (left.n.data == hea.data) {
				left.n = left.n.next;
				return true;
			} else {
				return false;
			}
		}

	}
	public void FoldLinkedList(){
		heapmover left = new heapmover();
		left.n = head;
		foldhelper(left,head,0);
	}

	private void foldhelper(heapmover left, Node head2, int i) {
		if(head2==null){
			return;
		}
		foldhelper(left, head2.next, i+1);
		if(i>this.size/2){
			Node originalleft = left.n.next;
			left.n.next = head2;
			head2.next = originalleft;
			left.n = originalleft;
		}
		else if(i==this.size/2){
			this.tail = head2;
			this.tail.next = null;			
		}
		
	}
	public int KthItemFromLast(int k){
		return KthItemFromLast(head,k);
	}

	private int KthItemFromLast(Node head2, int k) {
		Node temp = head2;
		int i = 1;
		
		while(i<this.size-k){
			temp = temp.next;
			i++;
		}
		return temp.data;
		
	}
	
	public int kthfromlastwithoutsize(int k){
		return kthfromlastwithoutsizeprivate(head,k);
		
	}

	private int kthfromlastwithoutsizeprivate(Node head2, int k) {
		Node slow = head2;
		Node fast = head2;
		int i =1;
		while(i<=k){
			fast = fast.next;
			i++;
		}
		
		while(fast!=null){
			fast = fast.next;
			slow = slow.next;
		}
		return slow.data;
	}
	
	public int mid(){
		return midPrivate(head);
	}

	private int midPrivate(Node head2) 
	{
		Node fast = head2;
		Node slow = head2;
		
		while(fast.next!=null){
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow.data;
	}
}