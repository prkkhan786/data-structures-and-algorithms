import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class QuestionString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// StringQuestion("b1bscg24");
		// Count(100, 250);
		subs("abc");

	}

	public static void StringQuestion(String src) {
		ArrayList<Character> c = new ArrayList<>();
		ArrayList<Character> i = new ArrayList<>();
		for (char ch : src.toCharArray()) {
			if (ch > '0' && ch < '9') {
				// number

				c.add(ch);
			} else {
				i.add(ch);
			}
		}

	}

	public static void Count(int min, int max) {
		// HashMap<Integer, Integer> hm = new HashMap<>();
		// for (int i = min; i <= max; i++) {
		// if (hm.containsKey(i)) {
		// hm.put(i, hm.get(i) + 1);
		// } else {
		// hm.put(i, 1);
		// }
		// }
		// return hm.get(3);
		int count = 0;
		for (int i = 100; i <= 135; i++) {
			int n = i;
			while (n > 0) {
				int rem = n % 10;
				if (rem == 3) {
					System.out.println(i);
					count++;
				}
				n /= 10;
			}
		}
		System.out.println(count);
	}

	public static void CommonSubstring(String s1, String s) {
		String[] array1 = s1.split("");
		String[] array2 = s.split("");
		HashSet<String> h1 = new HashSet<>();
		HashSet<String> h2 = new HashSet<>();
		Collections.addAll(h1, array1);
		Collections.addAll(h2, array2);
		if (Collections.disjoint(h1, h2)) {
			System.out.println("no");
		} else {
			System.out.println("yes");
		}
	}
	public static void subs(String s){
		for(int i =0;i<s.length();i++){
			for(int j = i+1;j<=s.length();j++){
				System.out.println(s.substring(i, j));
			}
		}
	}
}
