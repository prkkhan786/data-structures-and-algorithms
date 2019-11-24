package July25;
public class SumOfSubArray {
	public static void main(String[] args) {
		int maxsum = 0;
		int startsum = 0;
		int endsum = 0;
		int[] arr = { 1, 2, 3, 4, 5 };
		for (int start = 0; start < arr.length; start++) {
			for (int end = start; end < arr.length; end++) {
				int currentsum = sumofarray(arr, start, end);
				if (currentsum > maxsum) {
					maxsum = currentsum;
					startsum = start;
					endsum = end;
				}
			}
		}
		System.out.println("the max sum is " + maxsum);
		printsub(arr, startsum, endsum);
	}
	public static void printsub(int[] arr, int start, int end) {
		for (int i = start; i <= end; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	public static int sumofarray(int[] arr, int start, int end) {
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
}
