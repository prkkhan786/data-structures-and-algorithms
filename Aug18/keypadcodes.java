package Aug18;

public class keypadcodes {
	static String[] codes  = {",;","abc","de","fghi","jkl","mn","op","rstu","vw","xyz"};
	
	public static void main(String[] args) {
		
		
		codes("789","");
		
		
	}
	 public static void codes(String ques, String ans){
		 if(ques.length()==0){
			 System.out.println(ans);
			 return;
		 }
		 
		 char ch = ques.charAt(0);
		 String str = ques.substring(1);
		 String code = codes[ch - '0'];
		 System.out.println(code);
		 
		 for(int i=0;i<codes[ch - '0'].length();i++)
		 {
				codes(str,ans+codes[ch - '0'].charAt(i));
			 		
		 }
		 
		 
		 
	 }

}
