package Pep10jan;

import java.util.ArrayList;
import java.util.HashMap;

public class hashmapdemo {
	public static void main(String[] args) {
		// int arr[] = { 1, 2, 3, 4, 1, 2, 1 };
		int arr1[] = { 4, 5, 2, 2, 1, 1, 2 };
		int arr[] = { 2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6 };
		// TODO Auto-generated method stub
		// highfrequency("aabbbbc");
		gc1(arr,arr1);
		
	}

	public static void highfrequency(String src) {
		HashMap<Character, Integer> h = new HashMap<>();
		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			if (h.containsKey(ch)) {
				h.put(ch, h.get(ch) + 1);
			} else {
				h.put(ch, 1);
			}
		}
		ArrayList<Character> key = new ArrayList<>(h.keySet());
		int max = 0;
		char ans = 'a';
		for (char ch : key) {
			int val = h.get(ch);
			if (max < val) {
				max = val;
				ans = ch;
			}
		}
		System.out.println(ans);
	}

	public static void gc1(int arr[], int arr1[]) {
		HashMap<Integer, Integer> hp = new HashMap<>();
		for (int i : arr) {
			if (hp.containsKey(i)) {
				hp.put(i, hp.get(i) + 1);
			} else {
				hp.put(i, 1);
			}
		}
		for (int j : arr1) {
			if (hp.containsKey(j)) {
				System.out.println(j);
				hp.remove(j);
			}
		}
	}

	public static void gc2(int arr[], int arr1[]) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i : arr) {
			if (hm.containsKey(i)) {
				hm.put(i, hm.get(i) + 1);
			} else {
				hm.put(i, 1);
			}
		}
		for (int j : arr1) {
			if (hm.containsKey(j) && hm.get(j) > 0) {
				System.out.println(j);
				hm.put(j, hm.get(j) - 1);
			}
		}
	}

	public static void lcs(int arr[]) {
		HashMap<Integer, Boolean> hm = new HashMap<>();
		for (int i : arr) {
			hm.put(i, true);
		}
		for (int i : arr) {
			if (hm.containsKey(i - 1)) {
				hm.put(i, false);
			}
		}
		int ln = 1;
		int ml = -1;
		int mval = 0;
		for (int i : arr) {
			if (hm.get(i)) {
				int val = i;
				while (hm.containsKey(val + ln)) {
					ln++;
				}
				if (ml < ln) {
					ml = ln;
				}
			}
		}
		System.out.println("starting from " + mval + "ending " + ml);
	}
}