package Again;

public class Stringclassdemo {

	public static void main(String[] args) {

		String str = "1a2/";
		System.out.println(str.replaceAll("([^a-zA-Z0-9])+", ""));
		System.out.println(palindrome(str.replaceAll("([^a-zA-Z]|\\s)+", "")));
	}

	public static void printss(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String substring = s.substring(i, j);
				if (palindrome(substring)) {
					System.out.println(substring);
				}
			}
		}
	}

	public static boolean palindrome(String src) {
		int left = 0;
		int right = src.length() - 1;
		while (left < right) {
			if (src.charAt(left) != src.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	public int isPalindrome(String A) {
		String src = A.replaceAll("([^a-zA-Z]|\\s)+", "");
		int left = 0;
		int right = src.length() - 1;
		while (left < right) {
			if (src.charAt(left) != src.charAt(right)) {
				return 0;
			}
			left++;
			right--;
		}
		return 1;
	}
}
