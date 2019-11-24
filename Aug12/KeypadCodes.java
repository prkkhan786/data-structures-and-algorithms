package Aug12;
import java.util.ArrayList;
public class KeypadCodes {
	static String[] codes  = {",;","abc","de","fghi","jkl","mn","op","rstu","vw","xyz"};
	public static void main(String[] args) {
		System.out.println(Path(0,10));
	}
	public static ArrayList<String> Code(String str){
		if(str.length() == 0){
			ArrayList<String> fin = new ArrayList<>();
			fin.add("");
			return fin;
		}
		char c = str.charAt(0);
		String st = str.substring(1);
		ArrayList<String> ret = Code(st);
		ArrayList<String> fi = new ArrayList<>();
		for(String val : ret){	
			for(int i=0;i<codes[c - '0'].length();i++){
				fi.add(codes[c - '0'].charAt(i)+val);
			}
		}
		return fi;	
	}
	public static ArrayList<String> Path(int cp,int des){
		if(cp==des){
			ArrayList<String> fin = new ArrayList<>();
			fin.add("");
			return fin;
		}
		
		if(cp > des)
		{
			return new ArrayList<>();
		}
		
		ArrayList<String> fi = new ArrayList<>();
		for(int i=1;i<=6;i++){
				ArrayList<String> res = Path(cp+i,des); 
			for(String val : res){
				fi.add(i+val); 
			}		
		}
		return fi;
	}
}
