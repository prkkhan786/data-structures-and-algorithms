package GEEKSFORGEEKS;
public class StringsPremutations {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String src = "ABC";
		// permutattion(src, 0, src.length() - 1);
		
		System.out.print(answer(30, 2));
	}

	public static void permutattion(String src, int left, int right) {
		if (left == right) {
			System.out.println(src);
		} else {
			for (int i = left; i <= right; i++) {
				src = swap(src, left, i);
				permutattion(src, left + 1, right);
				src = swap(src, left, i); // backtracking
			}
		}
	}
	private static String swap(String src, int left, int i) {
		char temp;
		char[] charArray = src.toCharArray();
		temp = charArray[left];
		charArray[left] = charArray[i];
		charArray[i] = temp;
		return String.valueOf(charArray);
	}
	public static double answer(double x, double k) 
	{
		int i = 10;
		double max = Math.pow(i, k) - 1;
		System.out.println(max % x);
		return max - (max % x);
	}
	public static double minanswer(double x, double k) {
		double i = 10;
		double min = Math.pow(i, k - 1);
		if (min % x == 0) {
			return min;
		} else {
			return ((min + x) - (min + x) % x);
		}
	}
}