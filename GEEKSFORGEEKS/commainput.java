package GEEKSFORGEEKS;
import java.util.Scanner;
public class commainput {
	public static void main(String args[]) {
		
		String src = "aaabbbbbbbcc";
		System.out.println(maxoccurance(src));
		
	}
	public static char maxoccurance(String src){
		int count [] = new int[256];
		for(int i = 0;i<src.length();i++){
			count[src.charAt(i)]++;
		}
		int max = -1;
		char result = ' ';
		for(int i = 0;i<src.length();i++){
			if(max<count[src.charAt(i)]){
				max = count[src.charAt(i)];
				result = src.charAt(i);
			}
		}
		return result;
	}
}
