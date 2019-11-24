package Aug12;

import java.util.ArrayList;

public class Subsequence {

	public static void main(String[] args) {
		System.out.println(sub("abc"));
		
		
//		String ans = "c";
//		System.out.println(ans.charAt(0));
//		System.out.println(ans.substring(1));
		System.out.println(Asci("abc"));
		
		
	}
	
	public static ArrayList<String> sub(String str){
		if(str.length() == 0){
			ArrayList<String> fin = new ArrayList<>();
			fin.add("");
			return fin;
		}
		
	char ch = str.charAt(0);
	String res = str.substring(1);
	ArrayList<String> ret = sub(res);
	ArrayList<String> fi = new ArrayList<>();
	
	for(String val : ret){
		fi.add(val);
		fi.add(ch+val);
		
	}
	
	return fi;
		
		
	}
	
	public static ArrayList<String> Asci(String str){
		
		char c = str.charAt(0);
		String st = str.substring(1);
		ArrayList<String> ret = Asci(st);
		ArrayList<String> fi = new ArrayList<>();
		
		for(String val : ret){
			fi.add(val);
			fi.add(st+val);
			fi.add((int)c+val );
			
		}
		
		return fi;
	}
		
		
		
		
		
	
	
	
	
}
