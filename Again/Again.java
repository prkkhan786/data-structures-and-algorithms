package Again;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;

public class Again {
	public static void main(String[] args) {
		// toDelAnagram("cde", "abc");
		// webkulpattern(5);
		// deffodillQuestion("44sd55s6d56d4");
		// // String ch = "1234";
		// // pattern7(5);
		// sieveOfEratosthenes(100);
		// System.out.println(bracketsMatched("{[(())]}"));
		// System.out.println(isprime(1));
		// System.out.println(counter);
		// anagram1("silent", "listen");
		// webkulpattern(5);
		// sieveOfEratosthenes1(30);
		// removeSpaces("this is a boook");
		// //String sr[] = { "Rahul", "maqsood", "mksood", "seema", "ashwin",
		// "priyank", "xyz", "sood", "raqsood",
		// " priya" };
		// // "montena","soodied","oksoodok" };
		// // stringcontains(sr);
		// // alternatingCharachter("BBBBB");
		// //stringcontains(sr);
		// //contanssss("mksood");
		Sherlockstring("aabbccddeefghi");
	}

	static int counter;

	public static boolean isprime(int n) {
		if (n == 1 || n == 0) {
			return false;
		}
		int i = 2;
		while (i * i <= n) {
			counter++;
			if (n % i == 0) {
				return false;
			}
			i++;

		}
		return true;
	}

	public static void allprime(int n) {
		int count = 2;
		while (count <= n) {
			int i = 2;
			while (i * i < count) {
				if (count % i == 0) {
					break;
				}
				i++;
			}
			if (i * i > count)
				System.out.println(count);
			count++;
		}
	}

	public static void largestprimealll(int n) {
		int count = 2;
		while (count <= n) {
			int i = 2;
			while (i * i < count) {
				if (count % i == 0) {
					break;
				}
				i++;
			}
			if (i * i > count) {
				System.out.println(count);
			}
			count++;
		}
	}

	public static void reverseanumber(int n) {
		while (n != 0) {
			int ln = n % 10; // last number
			n = n / 10; // reduce the number
			System.out.print(ln);
		}
	}

	public static void gcd(int a, int b) {
		int rem = a % b;
		while (rem != 0) {
			b = a;
			a = rem;
			rem = a % b;
		}
		System.out.println(a);
	}

	public static void d(int a, int b) {
		int rem = a % b;
		while (rem != 0) {
			b = a;
			a = rem;
			rem = a % b;

		}
		System.out.println(a);
	}

	public static void nthfibonacci(int n) {
		int a = 0;
		int b = 1;
		int count = 1;
		while (count <= n) {
			System.out.println(a);
			int c = a + b;
			a = b;
			b = c;
			count++;
		}
		System.out.println(a);
	}

	public static void nthfib2(int n) {
		int a = 0;
		int b = 1;
		int count = 1;
		while (count <= n) {
			System.out.println(a);
			int c = a + b;
			a = b;
			b = c;
			count++;
		}
	}

	public static void pattern1(int r) {
		int row = 0;
		while (row < r) {
			int c = 0;
			while (c <= row) {
				System.out.print("* \t");
				c++;
			}
			System.out.println();
			row++;
		}
	}

	public static void patternone(int n) {
		int row = 0;
		while (row < n) {
			int col = 0;
			while (col <= row) {
				System.out.print("* ");
				col++;
			}
			System.out.println();
			row++;
		}
	}

	public static void pattern2(int n) {
		int num = 0;
		int r = 0;
		while (r < n) {
			int c = 0;
			while (c <= r) {
				System.out.print(num + " ");
				num += 1;
				c++;
			}
			System.out.println();
			r++;
		}
	}

	public static void pattern3(int n) {
		int row = 0;
		int a = 0;
		int b = 1;
		while (row < n) {
			int col = 0;
			while (col <= row) {
				System.out.print(a + " ");
				int c = a + b;
				a = b;
				b = c;
				col++;
			}
			System.out.println();
			row++;

		}
	}

	public static void fibpattern(int n) {
		int r = 0;
		int a = 0;
		int b = 1;
		while (r < n) {
			int c = 0;
			while (c <= r) {
				System.out.print(a + " ");
				int l = a + b;
				a = b;
				b = l;
				c++;
			}
			System.out.println();
			r++;
		}
	}

	public static void pattern4(int n) {
		int row = 0;
		while (row < n) {
			int val = 1;
			int col = 0;
			while (col <= row) {
				System.out.print(val + " ");
				int newval = val * (row - col) / (col + 1); // purani value se
															// new value find kr
															// rhe hai
				val = newval;
				col++;
			}
			System.out.println();
			row++;
		}
	}

	public static void patter4again(int n) {
		int r = 0;
		while (r < n) {
			int c = 0;
			int val = 1;
			while (c <= r) {
				System.out.println(val + " ");
				val = val * (r - c) / (c + 1);
				c++;
			}
			System.out.println();
			r++;
		}
	}

	public static void pattern5(int n) {
		int row = 1;
		while (row <= n) {
			int col = 1;
			while (col <= n) {
				if (row == col) {
					System.out.print("* ");
				} else if (row + col == n + 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
				col++;
			}
			System.out.println();
			row++;
		}
	}

	public static void pattern6(int n) {
		int row = 1;
		int npace = 1;
		int ntar = n / 2 + 1;
		while (row <= n) {
			// star part one
			int csp = 1;
			while (csp <= ntar) {
				System.out.print(" * ");
				csp++;
			}
			// space
			int cspace = 1;
			while (cspace <= npace) {
				System.out.print("   ");
				cspace++;
			}
			// star part two

			int csp2 = 1;
			while (csp2 <= ntar) {
				System.out.print(" * ");
				csp2++;
			}
			// logic to calculte no of stars and no of spaces
			if (row <= n / 2) {
				ntar--;
				npace += 2;
			} else {
				ntar++;
				npace -= 2;
			}
			System.out.println();
			row++;
		}
	}

	public static void pattern7(int n) {
		int row = 1;
		int nstar = 1;
		int nspace = n / 2;
		while (row <= n) {

			// System.out.println(nspace + " " + nstar);
			// space part one
			int cspace = 1;
			while (cspace <= nspace) {
				System.out.print("  ");
				cspace++;
			}

			// star
			int cstar = 1;
			while (cstar <= nstar) {
				System.out.print("* ");
				cstar++;
			}

			// space part two

			int cspace2 = 1;
			while (cspace2 <= nspace) {
				System.out.print("  ");
				cspace2++;
			}

			if (row <= n / 2) {
				nstar += 2;
				nspace -= 1;
			} else {
				nstar -= 2;
				nspace++;
			}
			System.out.println();
			row++;
		}
	}

	public static void pattern8(int n) {
		int row = 1;
		int nstar = 1;
		int space = n / 2;
		int sp = 1;
		while (row <= n) {

			int cpace = 1;
			while (cpace <= space) {
				System.out.print("  ");
				cpace++;
			}
			int cstar = 1;
			int val = sp;
			while (cstar <= nstar) {

				System.out.print(val + " ");
				if (cstar <= nstar / 2) {
					val++;
				} else {
					val--;
				}

				cstar++;
			}
			int cpace1 = 1;
			while (cpace1 <= space) {
				System.out.print("  ");
				cpace1++;
			}
			if (row <= n / 2) {
				nstar += 2;
				space--;
				sp++;
			} else {
				space++;
				nstar -= 2;
				sp--;
			}
			System.out.println();
			row++;
		}
	}

	public static void decimaltobinary(int n) {
		int bin = 0;
		int pow = 1;
		while (n != 0) {
			int rem = n % 2;
			n = n / 2;
			bin += rem * pow;
			pow = pow * 10;
		}
		System.out.println(bin);
	}

	public static void binarytodecimal(int bn) {
		int dn = 0;
		int power = 1;
		while (bn != 0) {
			int rem = bn % 10;
			bn = bn / 10;
			dn = rem * power;
			power = power * 2;
		}
		System.out.println(dn);
	}

	public static void binarytoOctal(int dn) {
		int oct = 0;
		int power = 1;
		while (dn != 0) {
			int rem = dn % 8;
			dn = dn / 8;
			oct += rem * power;
			power = power * 10;
		}
		System.out.println(oct);
	}

	public static void octaltodecimal(int oct) {
		int dc = 0;
		int power = 1;
		while (oct != 0) {
			int rem = oct % 10;
			oct = oct / 10;
			dc += rem * power;
			power = power * 8;
		}
		System.out.println(dc);
	}

	public static int decimaltoanybase(int no, int db) {
		int anybase = 0;
		int power = 1;

		while (no != 0) {
			int rem = no % db;
			no = no / db;
			anybase += rem * power;
			power = power * 10;
		}
		return anybase;
	}

	public static int anybasetodecimal(int no, int sb) {
		int dn = 0;
		int power = 1;
		while (no != 0) {
			int rem = no % 10;
			no = no / 10;
			dn += rem * power;
			power *= sb;
		}
		return dn;
	}

	public static void anyBaseToAnybase(int no, int sb, int db) {
		int dn = anybasetodecimal(no, sb);
		int out = decimaltoanybase(dn, db);
		System.out.println(out);
	}

	public static void onthebit(int n, int k) {
		System.out.println(Integer.toBinaryString(n));
		int mask = 1 << k;
		if ((mask & n) == 0) {
			System.out.println("bit os off");
		} else {
			System.out.println("bit is on");
		}
	}

	public static void binarysearch(int data, int arr[]) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == data) {
				System.out.println("found");
				return;
			} else if (data < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		System.out.println("not found");
	}

	public static void linearsearch(int data, int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == data) {
				System.out.println("yes");
				return;
			}
		}
		System.out.println("no");
	}

	public static void bubblesort(int arr[]) {
		int jc = 1;
		while (jc < arr.length - 1) {
			for (int i = 0; i <= arr.length - 1 - jc; i++) {
				if (arr[i] > arr[i + 1]) {
					swap(arr, i, i + 1);
				}
			}
			jc++;
		}
	}

	public static void selectionsort(int arr[]) {
		int jc = 1;
		while (jc < arr.length - 1) {
			for (int i = jc; i <= arr.length - 1; i++) {
				if (arr[jc] > arr[i]) {
					swap(arr, jc, i);
				}
			}
			jc++;
		}
	}

	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

	public static void inverseofanarray(int arr[]) {
		int two[] = new int[arr.length];
		for (int i = 0; i <= arr.length - 1; i++) {
			int temp = arr[i];
			two[temp] = i;
		}
		System.out.println(Arrays.toString(two));
	}

	public static void ismirrorinverse(int arr[]) {
		int two[] = new int[arr.length];
		int flag = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] == i) {
				flag += 1;
			}
		}
		if (flag == arr.length) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

	public static void substring(String s) {
		for (int i = 0; i <= s.length() - 1; i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				System.out.println(s.substring(i, j));
			}
		}
	}

	public static void togglecharacter(String s) {
		StringBuilder sb = new StringBuilder(s);
		for (int i = 0; i < sb.length(); i++) {
			char ch = sb.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				ch = (char) (ch - 'a' + 'A');
				sb.setCharAt(i, ch);
			} else {
				ch = (char) (ch - 'A' + 'a');
			}
		}
	}

	public static void compress(String s) {
		StringBuilder sb = new StringBuilder(s);
		StringBuilder n = new StringBuilder();
		int counter = 1;
		for (int i = 0; i < sb.length() - 1; i++) {
			if (sb.charAt(i) != sb.charAt(i + 1)) {
				n.append(sb.charAt(i));
				n.append(counter);
				counter = 1;
			} else {
				counter++;
			}
		}
		System.out.println(n);
	}

	public static void secondlargestelementinarray(Integer arr[]) {
		Arrays.sort(arr, Collections.reverseOrder());
		if (arr[0] == arr[1]) {
			System.out.println(arr[2]);
		} else {
			System.out.println(arr[1]);
		}
	}

	public static void secndlargest(int arr[]) {
		int first, second;
		first = second = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > first) {
				second = first;
				first = arr[i];
			} else if (arr[i] > second && arr[i] != first) {
				second = arr[i];
			}
		}
		if (second == Integer.MIN_VALUE) {
			System.out.println("no second largest element ");
		} else {
			System.out.println(second);
		}
	}

	public static void star(int n) {
		int nstar = 1;
		int nspace = n / 2;

		for (int r = 0; r < n; r++) {
			for (int c = 0; c < n; c++) {

				System.out.print("* ");
			}
			System.out.println();
		}

	}

	public static void Stringuestion(String src) {
		StringBuilder sb = new StringBuilder();
		StringBuilder in = new StringBuilder();
		char ch[] = src.toCharArray();
		for (char c : ch) {
			if (Character.isDigit(c)) {
				sb.append(c);
			} else if (Character.isAlphabetic(c)) {
				in.append(c);
			} else {

			}
		}
		String s = sb.toString();
		char[] array = s.toCharArray();
		Arrays.sort(array);
		System.out.println(array);

		System.out.println(in);
	}

	public static ArrayList<String> largestsubstring(String src) {
		ArrayList<String> ans = new ArrayList<>();
		for (int i = 0; i < src.length(); i++) {
			for (int j = i + 1; j < src.length(); j++) {
				String s = src.substring(i, j);

				if (isstringpalindrom(s)) {
					System.out.println(s);
				}
				ans.add(s);
			}
		}
		return ans;
	}

	public static boolean isstringpalindrom(String src) {
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

	public static boolean iswordanagram(String s1, String s) {
		if (s1.length() != s.length()) {
			return false;
		}
		char[] ar = s1.toCharArray();
		Arrays.sort(ar);
		System.out.println(ar);
		return true;
	}

	public static boolean anagram(String s, String n) {
		if (s.length() != n.length()) {
			return false;
		}
		char[] a = s.toCharArray();
		char[] b = n.toCharArray();

		Arrays.sort(a);
		Arrays.sort(b);
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}

	public static void toDelAnagram(String s, String n) {
		int count = 0;
		int arr1[] = new int[26];
		int arr[] = new int[26];
		for (int i = 0; i < s.length(); i++) {
			arr1[s.charAt(i) - 97]++;

		}
		for (int i = 0; i < n.length(); i++) {
			arr[n.charAt(i) - 97]++;

		}
		for (int i = 0; i < 26; i++) {
			count += Math.abs(arr1[i] - arr[i]);
		}
		System.out.println(count);
	}

	public static void webkulpattern(int n) {
		int space1 = 2;
		int star1 = 1;
		int space2 = 4;
		int space3 = 1;
		int space4 = 4;
		int space5 = 1;
		int space6 = 2;
		int row = 1;
		while (row <= n * 2) {
			// logic to print space1
			for (int cspace1 = 1; cspace1 <= space1; cspace1++) {
				System.out.print("  ");
			}
			// logic to print star1;
			for (int cstar = 1; cstar <= star1; cstar++) {
				System.out.print("* ");
			}
			// logic to print space2
			if (row == 3) {
				for (int cspace1 = 1; cspace1 <= space2; cspace1++) {
					System.out.print("$ ");
				}
			} else {
				for (int cspace1 = 1; cspace1 <= space2; cspace1++) {
					System.out.print("  ");
				}
			}

			// space3
			if (row >= 3) {
				for (int cspace1 = 1; cspace1 <= space3; cspace1++) {
					System.out.print("$ ");
				}
			} else {
				for (int cspace1 = 1; cspace1 <= space3; cspace1++) {
					System.out.print("  ");
				}
			}

			// space4
			for (int cspace1 = 1; cspace1 <= space4; cspace1++) {
				System.out.print("  ");
			}

			// space5
			for (int cspace1 = 1; cspace1 <= space5; cspace1++) {
				System.out.print("  ");
			}
			// space6
			for (int cspace1 = 1; cspace1 <= space6; cspace1++) {
				System.out.print("  ");
			}
			if (row <= (n / 2)) {
				space1--;
				star1++;
			} else if (row > 3 && row <= 5) {
				space1++;
				star1--;
			}

			System.out.println();
			row++;
		}

	}

	public static void daffodil(String src) {
		src = src.toLowerCase();
		StringBuilder inte = new StringBuilder();
		StringBuilder str = new StringBuilder();

		for (char ch : src.toCharArray()) {
			if (ch <= 122 && ch > 65) {
				str.append(ch);
			} else {
				inte.append(ch);
			}
		}
		int arr = Integer.parseInt(inte.toString());
		System.out.println(arr);

	}

	public static void deffodillQuestion(String src) {
		StringBuilder str = new StringBuilder();
		// StringBuilder inte = new StringBuilder();
		ArrayList<ss> l = new ArrayList<>();
		for (char ch : src.toCharArray()) {
			if (ch >= '0' && ch <= '9') {
				l.add(new ss(ch));
			} else {
				str.append(ch);
			}
		}
		char arr[] = str.toString().toCharArray();
		Arrays.sort(arr);

		for (char ch : arr) {
			System.out.print(ch);
		}
		Collections.sort(l);
		for (ss ch : l) {
			System.out.print(ch.ch);
		}
	}

	public static class ss implements Comparable<ss> {
		char ch;

		public ss(char ch) {
			this.ch = ch;
		}

		@Override
		public int compareTo(ss o) {
			// TODO Auto-generated method stub
			return o.ch - this.ch;
		}
	}

	public static void hamiltonPath(int src) {

	}

	public static void sieveOfEratosthenes(int n) {
		boolean arr[] = new boolean[n + 1];
		Arrays.fill(arr, true);
		for (int p = 2; p * p <= n; p++) {
			if (arr[p] == true) {
				for (int i = p * p; i <= n; i += p) {
					arr[i] = false;
				}
			}
		}

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 2; i <= n; i++) {
			if (arr[i] == true) {
				if (min > i) {
					min = i;
				}
				if (max < i) {
					max = i;
				}
				System.out.println(i + " ");

			}

		}
		System.out.println(min + " min");
		System.out.println(max + " max ");
	}

	public static void largestprime(int arr[]) {

	}

	public static boolean bracketsMatched(String src) {
		Stack<Character> st = new Stack<Character>();
		for (char ch : src.toCharArray()) {
			if (ch == '[' || ch == '{' || ch == '(') {
				st.push(ch);
			} else if (ch == ']' || ch == '}' || ch == ')') {
				if (st.size() == 0) {
					return false;
				} else if (ch == '}' && st.peek() == '{') {
					st.pop();
				} else if (ch == ']' && st.peek() == '[') {
					st.pop();
				} else if (ch == ')' && st.peek() == '(') {
					st.pop();
				} else {
					return false;
				}
			}
		}
		if (st.size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void anagram1(String src, String s) {
		HashMap<Character, Integer> s1 = new HashMap<>();
		HashMap<Character, Integer> s2 = new HashMap<>();
		if (src.length() != s.length()) {
			System.out.println("no");
			return;
		}

		for (char ch : src.toCharArray()) {
			if (s1.containsKey(ch)) {
				s1.put(ch, s1.get(ch) + 1);
			} else {
				s1.put(ch, 1);
			}
		}

		for (char ch : s.toCharArray()) {
			if (s1.containsKey(ch)) {
				s2.put(ch, s1.get(ch) + 1);
			} else {
				s2.put(ch, 1);
			}
		}

		System.out.println(s1.keySet().equals(s2.keySet()));
	}

	public static void patternnn(int n) {
		// *
		// **
		// ***$
		// ** $
		// * $ *
		// $ **
		// $***
		// **
		// *
		for (int i = 0; i < n / 2; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// _______________________________________________________________
		for (int i = 0; i < n / 2; i++) {
			for (int j = (n / 2) + 1 - i; j > 0; j--) {

				System.out.print("*");
			}
			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			System.out.print("$");
			System.out.println();
		}
	}

	public static void sieveOfEratosthenes1(int n) {
		boolean[] prime = new boolean[n + 1];
		Arrays.fill(prime, true);
		for (int p = 2; p * p <= n; p++) {
			if (prime[p]) {
				for (int i = p * p; i <= n; i += p) {
					prime[i] = false;
				}
			}
		}
		for (int i = 2; i <= n; i++) {
			if (prime[i]) {
				System.out.println(i);
			}
		}
	}

	public static void removeSpaces(String src) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < src.length() - 1; i++) {
			char ch = src.charAt(i);
			char ch2 = src.charAt(i + 1);
			if (ch != ' ') {
				sb.append(ch);
			} else if (ch == ' ' && ch2 != ' ') {
				sb.append(ch);
			}
		}
		sb.append(src.charAt(src.length() - 1));
		System.out.println(sb);
	}

	public static void countvovels(String src) {
		int noOfVovels = 0;
		for (char ch : src.toCharArray()) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				noOfVovels++;
			}
		}
		System.out.println(noOfVovels);
	}

	public static void stringcontains(String src[]) {
		for (String s : src) {
			int noOfVovels = 0;
			for (char ch : s.toCharArray()) {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					noOfVovels++;
				}
			}
			if ((!s.contains("sood")) && (noOfVovels <= 2)) {
				System.out.println(s);
			}
		}
	}

	public static void contanssss(String src) {
		System.out.println(src.contains("sood"));
	}

	public static void alternatingCharachter(String src) {
		int count = 0;
		for (int i = 0; i < src.length() - 1; i++) {
			char ch = src.charAt(i);
			char ch2 = src.charAt(i + 1);
			if (ch == ch2) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static void Sherlockstring(String src) {
		HashMap<Character, Integer> h = new HashMap<>();
		for (char ch : src.toCharArray()) {
			if (h.containsKey(ch)) {
				h.put(ch, h.get(ch) + 1);
			} else {
				h.put(ch, 1);
			}
		}
		
		System.out.println(h);
		int count = 0;
//		for (int i : h.values()) {
//			if (i >= 2) {
//				if (i == 2) {
//					count++;
//				}
//			} else {
//				continue;
//			}
//
//		}
//
//		if (count > 1) {
//			System.out.println("no");
//		}else{
//			System.out.println("yes");
//		}
		int s = 0;
		boolean istrue = false;
		for(int i =0;i<src.length()-1;i++){
			char ch = src.charAt(i);
			char ch2=src.charAt(i+1);
			if(h.get(ch)!=h.get(ch2)){
				if(s<1){
					if(h.get(ch)>h.get(ch2)){
						h.put(ch, h.get(ch)-1);
					}else{
						h.put(ch2, h.get(ch2)-1);
					}
					s=1;
				}else{
					istrue=false;
					return;
				}
			}else{
				istrue=true;
			}
		}
		System.out.println(istrue);
	}
}
