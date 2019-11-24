package oct27;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class GenericLinkedlist<T> implements Iterable<T> {
	node head;
	node tail;
	int size = 0;

	private class node {
		T data;
		node next;
	}

	public void addatlast(T val) {
		node n = new node();
		n.data = val;
		n.next = null;
		if (size > 0) {
			tail.next = n;
			tail = n;
			size++;
		} else {
			head = tail = n;
			size++;
		}
	}

	public void display() {
		node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ->");
			temp = temp.next;
		}
		System.out.println(".");
	}

	public T getatfirst() {
		if (size == 0) {
			System.out.println("list is empty");
			return null;
		}
		return head.data;
	}

	public T getatlast() {
		if (size == 0) {
			System.out.println("list is empty");
			return null;
		}
		return tail.data;
	}

	public T getatindex(int index) {
		if (index >= size || size < 0) {
			System.out.println("index out of bond");
			return null;
		}
		node temp = head;
		int i = 0;
		while (i < index) {
			temp = temp.next;
			i++;
		}
		return temp.data;
	}

	public void addatfirst(T val) {
		node n = new node();
		n.data = val;
		n.next = head;
		head = n;
		if (size == 0) {
			tail = n;
		}
		size++;
	}

	public T removefirst() {
		if (size == 0) {
			System.out.println("list is empty");
			return null;
		}
		T val = head.data;
		node temp = head;
		head = head.next;
		temp.next = null;
		if (size == 1) {
			tail = null;
		}
		size--;
		return val;
	}

	private node getnodeat(int index) {
		if (index >= size || size < 0) {
			System.out.println("index out of bond");
			return null;
		}
		node temp = head;
		int i = 0;
		while (i < index) {
			temp = temp.next;
			i++;
		}
		return temp;
	}

	public T removeatlast() {
		if (size == 0) {
			System.out.println("list is empty");
			return null;
		} else if (size == 1) {
			T data = tail.data;
			head = tail = null;
			size = 0;
			return data;
		} else {
			T data = tail.data;
			node n = getnodeat(size - 2);
			n.next = null;
			tail = n;
			size--;
			return data;
		}
	}

	public void addat(int index, T data) {
		if (index > size || index < 0) {
			System.out.println("index out of bond");
			return;
		} else if (index == 0) {
			addatfirst(data);
			return;
		} else if (index == size) {
			addatlast(data);
			return;
		} else {
			node n = new node();
			node nm1 = getnodeat(index - 1);
			node ind = getnodeat(index);
			nm1.next = n;
			n.data = data;
			n.next = ind;
			size++;
		}
	}

	public T removeat(int index) {
		if (index >= size || index < 0) {
			System.out.println("index out of bond");
			return null;
		} else if (index == size - 1) {
			return removeatlast();
		} else if (index == 0) {
			return removefirst();
		} else {
			node nm1 = getnodeat(index - 1);
			node n = nm1.next;
			node np1 = n.next;
			T val = n.data;
			nm1.next = np1;
			size--;
			return val;
		}
	}

	@Override
	public Iterator<T> iterator() {
		return new LinkedListIterator();
	}

	class LinkedListIterator implements Iterator<T> {
		node temp;

		public LinkedListIterator() {
			this.temp = head;
		}
		
		@Override
		public boolean hasNext() {
			if (temp == null) {
				return false;
			} else {

			}
			return true;
		}

		
		@Override
		public T next() 
		{
			if (temp != null) {
				T data = temp.data;
				temp = temp.next;
				return data;
			} else {
				throw new NoSuchElementException();
			}
		}

	}
}