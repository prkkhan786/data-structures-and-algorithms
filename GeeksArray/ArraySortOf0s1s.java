package GeeksArray;

public class ArraySortOf0s1s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { -7, 1, 5, 2, -4, 3, 0};
		System.out.println(LeftSumArray(arr));
	}

	public static void solution(int arr[]) {
		int l = 0;
		int mid = 0;
		int h = arr.length - 1;

		while (mid <= h) {
			switch (arr[mid]) {
			case 0: {
				swap(arr, l, mid);
				l++;
				mid++;
				break;
			}
			case 1: {
				mid++;
				break;
			}
			case 2: {
				swap(arr, h, mid);
				h--;
				break;
			}
			}
		}
	}

	private static void swap(int arr[], int h, int mid) {
		int temp = arr[h];
		arr[h] = arr[mid];
		arr[mid] = temp;
	}

	public static void Missingnumber(int arr[]) {
		int count = 1;
		for (int i = 0; i < arr.length; i++) {
			if (count == arr[i]) {
				count++;
				continue;
			} else {
				System.out.println(count);
			}
		}
	}

	public static int LeftSumArray(int arr[]) {
		int sum = 0;
		int leftsum = 0;
		for (int i = 0; i < arr.length; ++i) {
			sum += arr[i];
		}

		for (int i = 0; i < arr.length; ++i) {
			sum -= arr[i];

			if (leftsum == sum) {
				return i;
			}
			leftsum += arr[i];
		}
		return -1;
	}
}
