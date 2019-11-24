package AgainRecursion;

import java.util.ArrayList;

public class Rec3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getsubseqquence("hereiamstackerrank"));
	}

	public static ArrayList<String> getsubseqquence(String src) {

		if (src.length() == 0) {
			ArrayList<String> ba = new ArrayList<>();
			ba.add("");
			return ba;
		}

		char ch = src.charAt(0);
		String res = src.substring(1);
		ArrayList<String> s = getsubseqquence(res);
		ArrayList<String> res1 = new ArrayList<>();
		for (String r : s) {
			res1.add(r);
			res1.add(ch + r);
		}
		return res1;
	}
}
