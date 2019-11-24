package GeeksforgeeksIP;

import java.util.Stack;

public class isPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1001;
		Stack<Integer> st = new Stack<>();
		int temp = n;
		while(n!=0){
			st.push(n%10);
			n=n/10;
		}
		
		int sum=0;
		int multi=1;
		while(!st.isEmpty()){
			sum+=st.pop() * multi;
			multi*=10;
		}

		if(sum==temp){
			System.out.println(true);
		}else{
			System.out.println 	(false);
		}
	}
	

}
