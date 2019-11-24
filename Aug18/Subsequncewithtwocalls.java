package Aug18;

public class Subsequncewithtwocalls {

	public static void main(String[] args) {
		
		System.out.println("("=="(");
		
		//subsequence("abc","");

	}
	
	public static void subsequence(String ques, String ans){
		if(ques.length()==0){
			System.out.println(ans);
			return; 
		}
		
		char ch = ques.charAt(0);
		String rest = ques.substring(1);
		
			subsequence(rest,ans);
			subsequence(rest,ans+ch);
	}

}
