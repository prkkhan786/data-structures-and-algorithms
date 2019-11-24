package July25;

public class MirrorInverseArray {
	public static void main(String[] args) {
		int[] arr = { 3, 4, 2, 0, 1 };
		checkmirror(arr);
	}

	public static void checkmirror(int[] arr) {
		int flag = 0;
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			if (arr[temp] == i) {
				flag = flag + 1;
			} else {
				System.out.println(false);
				return;
			}
			if (flag == arr.length) {
				System.out.println(true);
			}

		}

	}

}
