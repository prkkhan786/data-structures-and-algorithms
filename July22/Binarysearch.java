package July22;

public class Binarysearch {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int start = 0;
		int end = arr.length - 1;
		int data = 110;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (data == arr[mid]) {
				System.out.println(mid);
				return;
			} else if (data > arr[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		System.out.println(-1);

	}

}
