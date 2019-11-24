package Pep10jan;

import java.util.Collections;
import java.util.PriorityQueue;

public class mediunPriorityqueue {
	private PriorityQueue<Integer> reg = new PriorityQueue<>();
	private PriorityQueue<Integer> rev = new PriorityQueue<>(Collections.reverseOrder());
	int size =0;

	public void add(int data) {
		if(reg.size()!=0 && data<reg.peek()){
			reg.add(data);
		}
		else if(rev.size()!=0 && data>rev.peek()){
			rev.add(data);
		}else{
			reg.add(data);
		}
		
		if(reg.size() - rev.size() == 2){
			rev.add(reg.remove());
		}else if(rev.size()-reg.size()==2){
			reg.add(rev.remove());
		}
		size++;
		
//		if (rev.size() - reg.size() == 0) {
//			rev.add(data);
//		}  if (data < rev.peek()) {
//			rev.add(data);
//		} else {
//			int p1 = rev.remove();
//			reg.add(p1);
//		}
	}
	public int remove() {
		if(reg.size()+ rev.size()==0){
			System.out.println("queu is empty");
			return -1;
		}
		size--;
 		 return rev.size() >= reg.size()? rev.remove() : reg.remove();	
	}

	public int peek() {
		if(size==0){
			System.out.println("Po is empty");
			return -1;
		}
		return reg.size() >= rev.size()?reg.peek():rev.peek();
	}

}
