package Couchfasion;

public class Questions {

	public static void main(String[] args) {
		// Sumofall("the best 6 of 8 will get 9 points");
		char arr[] = { 'a', 'v', 'f', '1', '2', '4', '6', '2', '2', '4', '7' };
		secondIntegerfromalphanumeric(arr);
	}

	public static void Sumofall(String src) {
		int sum = 0;
		int last = 0;
		src = src.replaceAll(" ", "");
		for (char ch : src.toCharArray()) {
			if (ch >= '0' && ch <= '9') {
				int n = Character.getNumericValue(ch);
				if (n % 3 == 0) {
					sum += n;
				}
				last = n;
			}
		}
		System.out.println(sum);
		System.out.println(last);
	}

	public static void secondIntegerfromalphanumeric(char[] arr) {
		int max = Integer.MIN_VALUE;
		int secondmax = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (Character.isDigit(arr[i])) {
				int n = Character.getNumericValue(arr[i]);
				if (n > max) {
					secondmax = max;
					max = n;
				} else if (n > secondmax && n != max) {
					secondmax = n;
				}
			}
		}

		System.out.println(max);
		System.out.println(secondmax);
	}
}
