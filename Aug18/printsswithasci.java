package Aug18;

public class printsswithasci {

	public static void main(String[] args) {
		subsequencewithasci("abc","");

	}
	
	public static void subsequencewithasci(String ques, String ans){
		if(ques.length()==0){
			System.out.println(ans);
			return; 
		}
		
		char ch = ques.charAt(0);
		String rest = ques.substring(1);
		
			subsequencewithasci(rest,ans);
			subsequencewithasci(rest,ans+ch);
			subsequencewithasci(rest,ans+(int)ch); 
	}

}
