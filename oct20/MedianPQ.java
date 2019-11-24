package oct20;
import java.util.Collections;
import java.util.PriorityQueue;

public class MedianPQ {
	PriorityQueue<Integer> minln = new PriorityQueue<>();
	PriorityQueue<Integer> maxsn = new PriorityQueue<>(Collections.reverseOrder());
	int size = 0;
	
	public void add(int val){
		if(maxsn.size() != 0 && val < maxsn.peek()){
			maxsn.add(val);
		} else if(minln.size() != 0 && val > minln.peek()){
			minln.add(val);
		} else {
			maxsn.add(val);
		}
		
		if(maxsn.size() - minln.size() == 2){
			minln.add(maxsn.remove());
		} else if(minln.size() - maxsn.size() == 2){
			maxsn.add(minln.remove());
		}
		size++;
	}
	
	public int remove(){
		if(size == 0){
			System.out.println("PQ is empty");
			return -1;
		}
		size--;
		return maxsn.size() >= minln.size()? maxsn.remove(): minln.remove();
	}
	public int peek(){
		if(size == 0){
			System.out.println("PQ is empty");
			return -1;
		}	
		return maxsn.size() >= minln.size()? maxsn.peek(): minln.peek();
	}
}
