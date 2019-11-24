package Again;

import java.util.HashMap;
import java.util.Scanner;

public class hackerearth {

	public static void main(String args[]) throws Exception {
		
		
	}

	public static boolean ispalindrome(String name) {
		int left = 0;
		int right = name.length() - 1;
		while (left < right) {
			if (name.charAt(left) != name.charAt(right)) {
				return false;
			}
			right--;
			left++;
		}
		return true;
	}
	public static void frequency(String src) 
	{
		HashMap<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			if (hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch) + 1);
			} else {
				hm.put(ch, 1);
			}
		}		
	}

}
