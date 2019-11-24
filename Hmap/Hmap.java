package Hmap;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Hmap {
	public static void main(String[] args) {
		HashMap<String, Integer> hmpa = new HashMap<>();
		hmpa.put("india", 120);
		hmpa.put("pakistan", 92);
		// getfrequency("aaabbbc");
		// int arr[] = {1,1,2,2,3,6,5};
		// int arr3[] = {1,1,2,3,3,5};
		// common(arr, arr3);
		// intersection(arr, arr3);
		getfrequency("hellllllllleeeeee");
	}

	public static void getfrequency(String String) {
		HashMap<Character, Integer> frequency = new HashMap<>();
		for (int i = 0; i < String.length(); i++) {
			char ch = String.charAt(i);
			Integer value = frequency.get(ch);
			if (value != null) {
				frequency.put(ch, new Integer(value + 1));
			} else {
				frequency.put(ch, 1);
			}
		}
		for (Character c : frequency.keySet()) {
			int val = frequency.get(c);
			System.out.println(c + " " + val);

		}
	}

	public static void common(int arr[], int arr3[]) {
		HashMap<Integer, Integer> f = new HashMap<>();
		for (int i = 0; i <= arr.length - 1; i++) {
			int key = arr[i];
			if (!f.containsKey(key)) {
				f.put(key, arr[i]);
			}
		}
		for (int i = 0; i <= arr3.length - 1; i++) {
			int k = arr3[i];
			if (f.containsKey(k))
				;
			{
				System.out.print(k);
				f.remove(k);
			}
		}
	}

	public static void intersection(int arr[], int arr3[]) {
		HashMap<Integer, Integer> f = new HashMap<>();
		for (int i = 0; i <= arr.length - 1; i++) {
			int key = arr[i];
			if (!f.containsKey(key)) {
				f.put(key, 1);
			} else {
				f.put(key, f.get(key) + 1);
			}
		}
		for (int i = 0; i <= arr3.length - 1; i++) {
			int k = arr[i];
			if (f.containsKey(k)) {
				System.out.println(k);
				f.put(k, f.get(k) - 1);
			}
		}
	}

	public static void longestseuence(int arr[]) {
		HashMap<Integer, Integer> f = new HashMap<>();
		for (int i = 0; i <= arr.length - 1; i++) {
			int key = arr[i];
			f.put(i, key);

		}
	}
}