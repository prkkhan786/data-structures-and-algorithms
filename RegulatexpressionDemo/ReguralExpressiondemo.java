package RegulatexpressionDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReguralExpressiondemo {

	public static void main(String[] args) throws IOException {
		
		System.out.println("enter");
		BufferedReader o  = new BufferedReader(new InputStreamReader(System.in));
		Scanner src = new Scanner(System.in);
		String s = o.readLine();
		System.out.println(s);
		// TODO Auto-generated method stub

		// Pattern p = Pattern.compile("geeks"); // create pattern object by
		// calling static function of pattern compile()
		// Matcher m = p.matcher("geeksforgeeks"); // static factory method
		// while(m.find()){
		// System.out.println("pattern found from " + m.start() + " to " +
		// m.end());
		// }
		// #ascii A-Z:65-90 && a-z:97-122
		//String src = "abcd";
//		StringBuilder sb = new StringBuilder();
//
//		for (int i = 0; i < src.length(); i++) {
//			char ch = src.charAt(i);
//			ch = (char) (ch + 2);
//			sb.append(ch);
//		}
//
//		System.out.println(sb);

	}

	public static int password(String s, int n) {
		int count = 0;
		Pattern patterndigit = Pattern.compile("(\\d)");
		Pattern patternupper = Pattern.compile("([A-Z])");
		Pattern patternlower = Pattern.compile("([a-z])");
		Pattern patterspcl = Pattern.compile("(\\W)");

		Matcher matcherDigit = patterndigit.matcher(s);
		Matcher matcherupper = patternupper.matcher(s);
		Matcher matcherlower = patternlower.matcher(s);
		Matcher matcherspcl = patterspcl.matcher(s);

		if (!matcherDigit.find()) {
			count++;
		}
		if (!matcherupper.find()) {
			count++;
		}
		if (!matcherlower.find()) {
			count++;
		}
		if (!matcherspcl.find()) {
			count++;
		}

		// if(count+s.length()<6){
		// count = count + 6 - (count+s.length());
		// }
		return Math.max(count, 6 - n);

	}

}
