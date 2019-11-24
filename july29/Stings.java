package july29;

public class Stings {

	public static void main(String[] args) {

		String s = "hello";
		// substringonseperateline(s);
		// printallsubstring(s);

		// boolean res =ispalandrome("nitin");
		// System.out.println(res);

		// substringpalandrome("abccbc");
		// printSubsequence("abc");

		printSubsequence("abc");
	}

	public static void substringonseperateline(String a) {

		for (int i = 0; i < a.length(); i++) {
			System.out.println(a.charAt(i));
		}
	}

	public static void printallsubstring(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++)
				System.out.println(s.substring(i, j + 1));// start
		}

	}

	public static boolean ispalandrome(String s) {
		int start = 0;
		int end = s.length() - 1;
		boolean res = true;
		while (start < end) {
			if (s.charAt(start) != s.charAt(end)) {
				res = false;
				break;

			} else {
				res = true;
			}

			start++;
			end--;
		}

		return res;

	}

	public static void substringpalandrome(String s) {

		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				String ss = s.substring(i, j + 1);
				if (ispalandrome(ss) == true) {
					System.out.println(ss);

				}
			}
		}

	}

	public static void printSubsequence(String s) {
		for (int i = 0; i < (1 << s.length()); i++) {
			for (int j = 0; j < s.length(); j++) {
				int bit = s.length() - 1 - j;
				int mask = 1 << bit;
				if ((mask & i) == mask) {
					System.out.println(s.charAt(j));
				}
			}
			System.out.println();
		}
	}
}
