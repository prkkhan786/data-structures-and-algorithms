package hackerrank;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Isarmstrong {

	public static void main(String[] args) {
		// isarmstrong(371);
		// armstrongtilln(1, 99999);
		// int arr[] = { 10, 5, 20, 20, 4, 5, 2, 25, 1 };
		// hackerrank(arr);
		// Kangaro(43, 2, 70, 2);

		// int scores [] = {100 ,100, 50, 40, 40, 20, 10};
		// climbingLeaderboard(scores, new int[1]);
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(5);
		list.add(3);
		System.out.println(RepetedNumber(list));

	}

	public static void isarmstrong(int val) {
		int temp = val;
		int sum = 0;
		while (val != 0) {
			int rem = val % 10;
			sum = sum + (rem * rem * rem);
			val = val / 10;
		}
		if (sum == temp) {
			System.out.println(true);
		} else {
			System.out.println(false);
			return;
		}
	}

	public static void armstrongtilln(int sr, int er) {
		for (int i = sr; i <= er; i++) {
			armstrong(i);
		}
	}

	private static void armstrong(int i) {

		int temp = i;
		int sum = 0;
		while (i != 0) {
			int rem = i % 10;
			sum = sum + (rem * rem * rem);
			i = i / 10;
		}
		if (sum == temp) {
			System.out.print(sum + " ");
		} else {
			return;
		}
	}

	public static void hackerrank(int arr[]) {
		int min = arr[0];
		int max = arr[0];
		int best = 0;
		int worst = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				best++;
			}
			if (arr[i] < min) {
				min = arr[i];
				worst++;
				System.out.println("h");
				// System.out.println("min ->"+min);
			}
		}
		System.out.println("best ->" + best);
		System.out.println(worst);
	}

	public static void Kangaro(int x1, int v1, int x, int v2) {
		int sum1 = x1 + v1;
		int sum2 = x + v2;
		int dif = Math.abs(sum1 - sum2);
		while (dif != 0) {
			int difchk = dif;
			sum1 = sum1 + v1;
			sum2 = sum2 + v2;
			dif = Math.abs(sum1 - sum2);
			if (dif > difchk) {
				System.out.println("no");
				return;
			}
			if (dif == difchk) {
				System.out.println("no");
				return;
			}
		}
		System.out.println("yess");
	}

	public static void gcd(int a, int b) {
		int rem = b / a;
		while (rem != 0) {
			b = a;
			a = rem;
			rem = b / a;
		}
		System.out.println(a);
	}

	static void migratoryBirds(List<Integer> arr) {
		HashMap<Integer, Integer> h = new HashMap<>();
		int max = Integer.MIN_VALUE;
		for (int i : arr) {
			if (h.containsKey(i)) {
				h.put(i, h.get(i) + 1);
			} else {
				h.put(i, 1);
			}
		}
		for (int i : h.keySet()) {
			if (h.get(i) > max) {
				max = i;
			}
		}
	}

	public static void bigfactorial(int n) {
		System.out.println("e");
		BigInteger fact = BigInteger.valueOf(1);
		for (int i = 1; i <= 8785856; i++)
			fact = fact.multiply(BigInteger.valueOf(i));
		System.out.println(fact);
	}

	public static int twocharacters(String src) {
		String res = "";
		for (char ch : src.toCharArray()) {
			res = removeoccurance(src, ch);
			if (isalternat(res)) {
				return res.length();
			} else {
				continue;
			}
		}
		return 0;
	}

	public static String removeoccurance(String src, char c) {
		String res = "";
		char arr[] = src.toCharArray();
		for (int i = 0; i < src.length(); i++) {
			if (arr[i] != c) {
				res += arr[i];
			} else {
				continue;
			}
		}
		return res;
	}

	public static boolean isalternat(String src) {
		for (int i = 0; i < src.length() - 2; i++) {
			char c = src.charAt(i);
			char ch = src.charAt(i + 2);
			if (c != ch) {
				return false;
			}
		}
		return true;
	}

	public static ArrayList<Integer> RepetedNumber(final List<Integer> A) {
		ArrayList<Integer> res = new ArrayList<>();
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i : A) {
			if (hm.containsKey(i)) {
				hm.put(i, hm.get(i) + 1);
			} else {
				hm.put(i, 1);
			}
		}
		for (int i : hm.keySet()) {
			if (hm.get(i) > 1) {
				res.add(i);
			}
		}
		for(int i=1;i<A.size();i++){
			if(hm.get(i)==null){
				res.add(i);
			}
		}
		return res;
	}
}
