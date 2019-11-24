package InterviewVenera;
import java.util.HashMap;
import java.util.Stack;
public class Venera {
	public static void main(String args[]){
		String s = "aaaabbbcccc";	
		keyvalue(s);
	}
	public static void keyvalue(String src){
		HashMap<Character,Integer> hm = new HashMap<>();
		for(char ch : src.toCharArray()){	
			if(hm.containsKey(ch)){
				hm.put(ch, hm.get(ch) + 1);
			}else{
				hm.put(ch, 1);
			}
		}
		System.out.println(hm);
	}
}
