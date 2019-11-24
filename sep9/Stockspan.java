package sep9;
import stack.Stackstory;

public class Stockspan {

	
	public static void main(String[] args) {
		int [] stock = {30,35,40,60,50,45,48,49,55,70,20,29,35,30,20};
		int [] ans=span(stock);
		for(int val:ans){
			System.out.println(val);
		}
	}
	public static int [] span(int [] arr){
		
		int [] ans = new int [arr.length];
		Stackstory st = new Stackstory(arr.length);
		st.push(0);
		ans[0]=1;
		for(int i=1;i<=arr.length-1;i++){
			while(!st.isEmpty() && arr[i]>arr[st.top()]){
				st.pop();	
				}
				if(st.size()==0){
					ans[i]=i+1;
			} 
				else{
					ans[i]=i-st.top();
				}
				st.push(i);
		}
		return ans;
	}
}
