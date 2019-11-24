package sep1;

public class StringB {

	public static void main(String[] args) {
		
//		abcwithsb( new StringBuilder("abc"), new StringBuilder(""));
//		abc("abc", "");
//		abcwiths(new StringBuilder("abc"), new StringBuilder(""));
		permutation("abab", "", new boolean [26]);
	}
	
public static void abcwithsb(StringBuilder ques,StringBuilder asf){
			
		
		if(ques.length()==0){
			
			System.out.println(asf);
			return;
		}
		
		char ch = ques.charAt(0);
		ques.deleteCharAt(0);
		
		for(int i=0;i<=asf.length();i++){
			asf.insert(i, ch);
			abcwithsb(ques, asf);
			asf.deleteCharAt(i);
		}
		ques.insert(0, ch);
	}


public static void abc(String ques,String asf){
	
	if(ques.length() == 0){
		System.out.println(asf);
		return;
	}
	
	for(int i=0;i<ques.length();i++){
		char ch = ques.charAt(i);
		abc(ques.substring(0, i)+ ques.substring(i+1), asf+ch);
		
	}
}

public static void abcwiths(StringBuilder ques,StringBuilder asf){
	if(ques.length() == 0){
		System.out.println(asf);
		return;
	}
	
	for(int i=0;i<ques.length();i++){
		char ch = ques.charAt(i);
		asf.append(ch);
		ques.deleteCharAt(i);
		abcwiths(ques, asf);
		asf.delete(asf.length()-1,ch);
		ques.insert(i, ch);	
	}
	
}

	public static void permutation(String ques,String asf,boolean [] visited){
		
		if(ques.length()==0){
			System.out.println(asf);
			return;
		}
		for(int i=0;i<ques.length();i++){
			char ch = ques.charAt(i);
			if(visited[ch-'a']==false){
				visited[ch-'a'] = true;
				permutation(ques.substring(0, i)+ ques.substring(i+1), asf+ch, new boolean [26]);
			}
			
			
			
			}
		}

}
