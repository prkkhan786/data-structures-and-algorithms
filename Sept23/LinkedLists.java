package Sept23;
public class LinkedLists {
	private class node {
		int data;
		node next;	
	}
	node head;
	node tail;
	int size=0;
	public void addatlast(int val){
		node n = new node();
		n.data = val;
		n.next = null;
		if(size>0){
			tail.next = n;
			tail = n;
			size++;
		}
		else{
			head = tail = n;
			size++;
		}	
	}
	public void display(){
		node temp = head;
		while(temp!=null){
			System.out.print(temp.data+ " ->");
			temp = temp.next;	
		}
		System.out.println(".");
	}
	public int getatfirst(){
		if(size==0){
			System.out.println("list is empty");
			return -1;
		}
		return head.data;
	}
	public int getatlast(){
		if(size==0){
			System.out.println("list is empty");
			return -1;
		}
		return tail.data;
		
	}
		public int getatindex(int index){
			if(index>=size || size<0){
				System.out.println("index out of bond");
				return -1;
			}
			node temp = head;
			int i = 0;
			while(i<index){
				temp = temp.next;
				i++;
			}
			return temp.data;
		}
		
		public void addatfirst(int val){
			node n = new node();
			n.data = val;
			n.next = head;
			head = n;
			if(size==0){
				tail = n;
			}
			size++;	
		}
		public int removefirst(){
			if(size==0){
				System.out.println("list is empty");
				return -1;
			}
			int val = head.data;
			node temp= head;
			head = head.next;
			temp.next = null;
			if(size==1){
				tail=null;
			}
			size--;
			return val;
		}
		
		private node getnodeat(int index){
			if(index>=size || size<0){
				System.out.println("index out of bond");
				return null;
			}
			node temp = head;
			int i = 0;
			while(i<index){
				temp = temp.next;
				i++;
			}
			return temp;
		}
		public int removeatlast(){
			if(size==0){
				System.out.println("list is empty");
				return -1;
			}
			else if(size==1){
				int data = tail.data;
				head = tail = null;
				size=0;
				return data;
			}
			else{
				int data = tail.data;
				node n = getnodeat(size-2);
				n.next = null;
				size--;
				return data;	
			}	
		}		
		public void addat(int index,int data){
			if(index>size || index<0){
				System.out.println("index out of bond");
				return;
			}
			else if(index==0){
				addatfirst(data);
				return;
			}
			else if(index == size){
				addatlast(data);
				return;
			}
			else{
				node n = new node();
				node nm1 = getnodeat(index-1);
				node ind = getnodeat(index);
				nm1.next = n;
				n.data = data;
				n.next = ind;
				size++;	
			}	
		}
		public int removeat(int index){
			if(index>=size || index<0){
				System.out.println("index out of bond");
				return -1;
			}
			else if(index==size){
				return removeatlast();
			}
			else if (index==0){
				return removefirst();
			}
			else{
				node nm1 = getnodeat(index-1);
				 node n = nm1.next;
				 node np1 = n.next;
				 int val = n.data;
				 nm1.next = np1;
				 size--;
				 return val;			 
			}
		}
		public void reverseiterative(){
			int left = 0;
			int right = size-1;
			while(left < right){
				node l = getnodeat(left);
				node r = getnodeat(right);
				int temp = l.data;
				l.data = r.data;
				r.data = temp;
				left++;
				right--;
			}
		}
		public void reversepointer(){
			node left = head;
			
			
			
		}
		
		public static void main(String [] args){
			LinkedLists n1 = new LinkedLists();
			
			n1.addatlast(50);
			n1.addatlast(60);
			n1.addatlast(11);
			n1.addatlast(20);
			n1.addatlast(33);
			n1.addatlast(40);
			n1.addatlast(45);
			n1.display();
			n1.evenodd();
			n1.display();
			
		}
		
		public void displayreversehelper(node node){
			
			if(node==null){
				return;
			}
			displayreversehelper(node.next);
			System.out.println(node.data + " ->");
		}
		
		private void displayreversepointerhelper(node node){
			if(node == tail){
				return;
			}
			displayreversepointerhelper(node.next);
			node.next.next = node;
		}
		
		public void displaypointerreverse(){
			displayreversepointerhelper(head);
			node temp = head;
			head = tail;
			tail = temp;
			tail.next = null;
		}
		node left;
		public void displaydatareverse(){
			left = head;
			displaydatareversehelpe(head,0);
		}
		private void displaydatareversehelpe(node right ,int floor){
			if(right==null){
				return;
			}
			displaydatareversehelpe(right.next,floor+1);
			if(floor >= size/2){
				int temp = left.data;
				left.data = right.data;
				right.data = temp;
				left=left.next; 
			}			
		}
		public void ispalindrome(){
			left = head;
			System.out.println(ispalindromehelper(head, 0));
			left = null;
		}
		private boolean ispalindromehelper(node right,int floor) {
			if(right==null){
				return true;
			}
			boolean flag = ispalindromehelper(right.next, floor+1);
			if(flag == false){
				return false;
			}
			if(floor>=size/2){
				if(right.data == left.data){
					left= left.next;
					return true;
				}
				else{
					return false;
				}		
		}
			return flag;
	}
		
		public void fold(){
			left = head;
			foldhelper(head, 0);
			left = null;
		}
		private void foldhelper(node right,int floor){
			if(right==null){
				return;
			}
			foldhelper(right.next, floor+1);
			if(floor>=size/2){
				node temp = left.next;
				left.next = right;
				right.next = temp;
				left = temp;
			}
			if(floor==size/2){
				tail = right;
				tail.next=null;
			}
	}
		public void unfold(){
			//have to do 
		}
		
		private void removerepetation(){
			node crnt = head;
			node n = head.next;
			size = 1;
			while(true){
				if(n==null){
					crnt.next = null;
					tail=crnt;
					break;
				}
				if(crnt.data == n.data)
				{
					n = n.next;
				}
				else{
					size++;
					crnt.next = n;
					crnt=n;
					n=n.next;
					}
			}
		}
		
		public void mid(){
			midhelper();
			
		}
		private void midhelper(){
			node fast=head;
			node slow=head;
			
			while(fast.next!=null && fast.next.next != null){
				fast=fast.next.next;
				slow=slow.next;
			}
			System.out.println(slow.data);
		}
		
		public void kthterm(){
			kthtermhelper(2);
			
		}
		
		public node midnode(){
			return midnodehelper();
			
		}
		private node midnodehelper(){
			node fast=head;
			node slow=head;
			
			while(fast.next!=null && fast.next.next != null){
				fast=fast.next.next;
				slow=slow.next;
			}
			return slow;
		}
		
		
		private void kthtermhelper(int k ){
			node fast=head;
			node slow=head;
			for(int i = 0;i<=k;i++){
				fast=fast.next;
			}
			while(fast!=null){
				fast = fast.next;
				slow = slow.next;
			}
			
			System.out.println(slow.data);
		}
		
		public static LinkedLists mergetwolist(LinkedLists list1,LinkedLists list2){
			LinkedLists list3 = new LinkedLists();
			node first = list1.head;
			node second= list2.head;
			while(first!=null && second!=null){
				if(first.data < second.data){
					list3.addatlast(first.data);
					first=first.next;
				}
				else{
						list3.addatlast(second.data);
						second=second.next;
				}
			}
				
				while(first!=null){
					list3.addatlast(first.data);
					first=first.next;
				}
				
				while(second!=null){
					list3.addatlast(second.data);
					second=second.next;
				}
			
			return list3;
		}
		
		public static LinkedLists mergesortlist(LinkedLists list){
			if(list.size == 1){
				return list;
			}
			node mid = list.midnode();
			node midn = mid.next;
			LinkedLists fh = new LinkedLists();
			LinkedLists sh = new LinkedLists();
			
			fh.head = list.head;
			fh.tail = mid;
			fh.tail.next = null;
			fh.size = (list.size +1)/2;
			
			sh.head = midn;
			sh.tail = list.tail;
			sh.size = list.size - fh.size;
			fh = mergesortlist(fh);
			sh = mergesortlist(sh);
			LinkedLists sorted  =  LinkedLists.mergetwolist(fh, sh);
			mid.next = midn;
			return sorted;
		}
		
		public void kreverse(int k){
			LinkedLists prev = new LinkedLists();
			LinkedLists curr = new LinkedLists();
			while(this.size!=0){
				for(int j =1;j<k;j++)
				{
					curr.addatfirst(this.removefirst());
				}
				if(prev==null){
					prev = curr;
				}
				else
				{	
					prev.tail.next = curr.head;
					prev.tail = curr.tail;
					prev.size = this.size;
				}
				curr = new LinkedLists();
			}	
			head= prev.head;
			tail = prev.tail;
			size = prev.size;
		}
		
		public void oddeven(){
			LinkedLists odd = new LinkedLists();
			LinkedLists even = new LinkedLists();
			while(this.size!=0){
				int rem = this.removefirst();
				if(rem % 2 ==1){
					odd.addatlast(rem);
				}
				else{
					even.addatlast(rem);
				}
			}
			if(odd.size ==0){
				this.head = even.head;
				this.tail = even.tail;
				this.size = even.size;
			}
			else if(even.size ==0){
				this.head = odd.head;
				this.tail = odd.tail;
				this.size = odd.size;
			}
			else{
				this.head = odd.head;
				this.tail = even.tail;
				this.size = odd.size + even.size;
				odd.tail.next = even.head; 
			}
			
			
		}
		
		public void evenodd(){
			LinkedLists even = new LinkedLists();
			LinkedLists odd = new LinkedLists();
			while(this.size != 0){
				int rem = this.removefirst();
				if(rem % 2 == 0){
					even.addatlast(rem);
				}
				else{
					odd.addatlast(rem);
				}	
			}
			if(even.size == 0){
				this.head = odd.head;
				this.tail = odd.tail;
				this.size = odd.size;
			}
			else if(odd.size == 0){
				this.head = even.head;
				this.tail= even.tail;
				this.size = even.size;
			}
			else{
				this.head = even.head;
				this.tail = odd.tail;
				this.size =even.size + odd.size;
				even.tail.next = odd.head;
			}
			
		}
}