package DataStructure;

public class DynamicQueie extends Que {
	
	public DynamicQueie(int cap) {
		super(cap);
		
	}
	
	public void enqueue(int val){
		
		int or[] = data;
		data = new int[or.length*2];
		for(int i=0;i<or.length-1;i++){
			data[i] = or[(front+1)%or.length];
			
		}
		front =0;
		super.enqueue(val);
		
	}
	
}
