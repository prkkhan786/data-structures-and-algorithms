package stack;

public class DynamicStack extends Stackstory {

	public DynamicStack(int cap) {
		super(cap);
		
	}

	public void push(int val){
		int [] oa = data;
		data = new int [oa.length * 2];
		for(int i =0;i<oa.length-1;i++){
			data[i] = oa[i];
		}
		super.push(val);
	}
	
	
}
