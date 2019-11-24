package stackquestions;

import stack.Stackstory;

public class stockspanq {
		
	public static void main(String[] args){
		
	}
	public static void stock(int [] arr){
		Stackstory st = new Stackstory(arr.length);
		int [] ans = new int [arr.length];
		st.push(0);
		ans[0] = 1;
		for(int i=1;i<arr.length;i++){
			while(!st.isEmpty() || arr[i]>arr[st.top()]){
				st.pop();
			}
			
			if(st.size()==0){
				ans[i] = i+1;
			}
			else{
				ans[i] = i =st.top();
				
			}
			
			
		}
		
		
	}
}
