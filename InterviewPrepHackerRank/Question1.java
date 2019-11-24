package InterviewPrepHackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Question1 
{
	public static void main(String[] args) {
		// System.out.println(10 % 3);

		// TODO Auto-generated method stub
		// int arr[] = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };
		// pairofcolors(arr);
		// int arr[] = { 1, 2, 3, 4, 5 };
		// minax2(arr);
		//
		// double a = 6.2222222222;
		//
		// System.out.printf("%.6f", a);

		// int arr1[] = { 7, 69, 2, 221, 8974 };
		// minax2(arr1);
		// int a[] = { 3, 2, 1, 3 };
		// candle(a);
		// int grades[] = { 73, 67, 38, 33 };
		// // timeConvirsion("07:05:45PM");
		// Integer r[] = StudentGrading(grades);
		// for (int i : r) {
		// System.out.println(i);
		// }
		// Anagram("NOVmETKPTbYu ftZPEykhjgF GGkdGjWGwW skjPJsea dtwdqcr
		// DERCUgxOxrRgDQbdzL IZjyXs");
		// repeatedString("aba", 10);
		//Substring("geeksforgeeks");
		Cipher("abcdefghijklmnopqrstuvwxyz",2);

	}

	public static void pairofcolors(int arr[]) {
		HashSet<Integer> h = new HashSet<>();
		int pair = 0;
		for (int i = 0; i < arr.length; i++) {
			int ele = arr[i];
			if (!h.contains(ele)) {
				h.add(ele);
			} else {
				pair++;
				h.remove(ele);
			}
		}
		System.out.println(pair);

	}

	public static void minmax(int arr[]) {
		Arrays.sort(arr);
		int minsum = 0;
		int maxsum = 0;
		for (int i = 0; i < 4; i++) {
			minsum += arr[i];
		}
		for (int i = arr.length - 1; i > arr.length - 1 - 4; i--) {
			// maxsum += arr[i];
		}
		System.out.println(minsum);
		System.out.println(maxsum);
	}

	public static void minax2(int arr[]) {
		int max = 0, min = 0, sum = 0;
		arr[0] = max = min = sum;
		for (int i = 1; i <= 4; i++) {
			if (arr[i] > max) {
				max = arr[i];

			}
			if (arr[i] < min) {
				min = arr[i];

			}
			sum += arr[i];
		}
		System.out.println((sum - max) + " " + (sum - min));
	}

	public static void candle(int arr[]) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i : arr) {
			if (hm.containsKey(i)) {
				hm.put(i, hm.get(i) + 1);

			} else {
				hm.put(i, 1);
			}
		}

		Arrays.sort(arr);
		System.out.println(hm.get(arr[arr.length - 1]));
	}

	public static void timeConvirsion(String src) {
		String time[] = src.split(":");
		// System.out.println(time[2]);
		int hour = Integer.parseInt(time[0]);
		String minute = time[1];
		String last = time[2];
		String sec = last.substring(0, last.length() - 2);
		String period = last.substring(last.length() - 2);

		String newtimeString = "";
		if (hour >= 0 && hour >= 12 && period.equalsIgnoreCase("AM")) {
			newtimeString = String.format("%02d", hour) + ":" + minute + ":" + sec;
		} else if (hour >= 0 && hour <= 12 && period.equalsIgnoreCase("PM")) {
			newtimeString = (12 + hour) + ":" + minute + ":" + sec;
		} else if (hour == 12 && period.equalsIgnoreCase("AM")) {
			newtimeString = "00" + ":" + minute + ":" + sec;
		} else if (hour == 12 && period.equalsIgnoreCase("PM")) {
			newtimeString = hour + ":" + minute + ":" + sec;
		}
		System.out.println(newtimeString);
	}

	public static Integer[] StudentGrading(int grades[]) {
		ArrayList<Integer> a = new ArrayList<>();
		int n = grades.length - 1;
		for (int i = 0; i <= n; i++) {
			int s1 = grades[i];
			if (s1 < 38) {
				// System.out.println(s1);
				a.add(s1);
			} else {
				int nMulofF = s1;
				while (!((nMulofF % 5) == 0)) {
					nMulofF++;
				}
				if (nMulofF - s1 < 3) {
					// System.out.println(nMulofF);
					a.add(nMulofF);
				} else {
					// System.out.println(s1);
					a.add(s1);
				}
			}

		}
		Integer[] ans = new Integer[a.size()];
		for (int i = 0; i < a.size(); i++) {
			ans[i] = a.get(i);
		}
		return ans;

	}

	public static void repeatedString(String src, int n) {
		int count = 0;
		for (char ch : src.toCharArray()) {
			if (ch == 'a') {
				count++;
			}
		}

		int factor = n / src.length();
		int rem = n % src.length();
		count = factor * count;
		for (int i = 0; i < rem; i++) {
			if (src.charAt(i) == 'a') {
				count++;
			}

		}
		System.out.println(count);
	}

	static String hackerrankInString(String s) {
		String hackerRank = "hackerrank";
		int j = 0;
		if (s.length() < hackerRank.length()) {
			return "NO";
		}
		for (int i = 0; i < s.length(); i++) {
			if (j < hackerRank.length() && s.charAt(i) == hackerRank.charAt(j)) {
				j++;
			}
		}
		if (j == hackerRank.length()) {
			return "YES";
		} else {
			return "NO";
		}

	}

	public static void Anagram(String src) {
		HashMap<Character, Boolean> h = new HashMap<>();
		String s = src.replaceAll(" ", "");
		s = s.toLowerCase();
		for (char ch : s.toCharArray()) {
			h.put(ch, true);
		}
		if (h.size() == 26) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

	public static boolean isPalindrome(String src) {
		int left = 0;
		int right = src.length() - 1;
		while (left < right) {
			if (src.charAt(left) != src.charAt(right)) {
				return false;
			}
		}
		return true;
	}

	public static void Substring(String src) {
		for (int i = 0; i < src.length(); i++) {
			for (int j = i + 1; j <= src.length(); j++) {
				String ss = src.substring(i, j);
				if (isPalindrome(ss)) {
					int l = ss.length();
					if (isprime(l)) {
						//counter++;
					} else {
						continue;
					}

				}
			}
		}
	}
	public static boolean isprime(int n) {
		int i = 2;
		while (i * i <= n) {
			if (n % i == 0) {
				return false;
			}
			i++;
		}
		return true;
	}
	public static void Cipher(String s, int k)
	{
		StringBuilder sb = new StringBuilder();
		for(int i =0;i<s.length();i++){
			char ch = s.charAt(i);
			if(ch+k>122)
			{
				int n = (int) ch + k - 122;
				char sr = (char) ((char) 96 + n);
				sb.append(sr);
			}else{
				int n = (int) ch + k;
				sb.append((char) n);
			}	
		}
		System.out.println(sb);
	}
}