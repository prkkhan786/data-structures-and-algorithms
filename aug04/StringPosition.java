package aug04;
public class StringPosition {
	public static void main(String[] args) {
		// String s2 = "aaabbbaaaccdddeffghh";
		// // oddven(s1);
		// //oddven(s2);
		//
		// compresshackerank("baab");

		int arr[] = { 5, 4, 3, 2, 1 };
		int arrrr[] = mergesort(arr, 0, arr.length - 1);
		for (int val : arrrr) {
			System.out.print(val+" ");
		}
	}
	
	
	public static void oddven(String s1) 
	{
		StringBuilder sb = new StringBuilder(s1);
		for (int i = 0; i < sb.length(); i++) {
			char ch = sb.charAt(i);
			if (i % 2 == 0) {
				ch--;
				sb.setCharAt(i, ch);
			} else {
				ch++;
				sb.setCharAt(i, ch);
			}
		}
		System.out.println(sb);
	}

	public static void modify2(String s1) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s1.length() - 1; i++) {
			char c1 = s1.charAt(i);
			char c2 = s1.charAt(i + 1);
			sb.append(c1);
			sb.append(c1 - c2);
		}
		sb.charAt(s1.length() - 1);
		System.out.println(sb);
	}

	public static void compres1(String s1) {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s1.length() - 1; i++) {
			char c1 = s1.charAt(i);
			char c2 = s1.charAt(i + 1);
			if (c1 != c2) {
				sb.append(c1);
			}
		}
		sb.append(s1.charAt(s1.length() - 1));
		System.out.println(sb);
	}

	public static void compresshackerank(String src) {
		for (int i = 1; i < src.length(); i++) {
			char c1 = src.charAt(i);
			char c2 = src.charAt(i - 1);
			if (c1 == c2) {
				src = src.substring(0, i - 1) + src.substring(i + 1);
				i = 0;
			}
		}
		if (src.length() == 0)
			System.out.println("empty");
		else
			System.out.println(src);
	}

	public static void compres2(String s1) {
		StringBuilder sb = new StringBuilder();
		int counter = 1;
		for (int i = 0; i < s1.length() - 1; i++) {
			char c1 = s1.charAt(i);
			char c2 = s1.charAt(i + 1);
			if (c1 != c2) {
				sb.append(c1);
				sb.append(counter);
				counter = 1;
			} else {
				counter++;
			}
		}
		sb.append(s1.charAt(s1.length() - 1));
		System.out.println(sb);
	}

	public static int[] mergesort(int arr[], int left, int right) {
		if (left == right) {
			int[] baseArray = new int[1];
			baseArray[0] = arr[left];
			return baseArray;
		}
		int mid = (left + right) / 2;
		int leftarr[] = mergesort(arr, left, mid);
		int rightarr[] = mergesort(arr, mid + 1, right);
		int[] mergedarray = merge(leftarr, rightarr);
		return mergedarray;
	}
	
	private static int[] merge(int[] leftarr, int[] rightarr) {
		int mergedarr[] = new int[leftarr.length + rightarr.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < leftarr.length && j < rightarr.length) {
			if (leftarr[i] < rightarr[j]) {
				mergedarr[k] = leftarr[i];
				i++;
				k++;
			} else {
				mergedarr[k] = rightarr[j];
				j++;
				k++;
			}

		}
		while (i < leftarr.length) {
			mergedarr[k] = leftarr[i];
			i++;
			k++;
		}
		while (i < rightarr.length) {
			mergedarr[k] = leftarr[j];
			j++;
			k++;
		}
		return mergedarr;
	}
}
