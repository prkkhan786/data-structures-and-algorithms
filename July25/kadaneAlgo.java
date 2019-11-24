package July25;

public class kadaneAlgo {
	public static void main(String[] args) {
		int[] arr = { 0, 0, 0, 0, 0 };
		int csum = arr[0];
		int cstart = 0;
		int cend = 0;
		int osum = arr[0];
		int ostart = 0;
		int oend = 0;
		for (int i = 1; i < arr.length; i++) 
		{
			if (csum > 0) {
				csum = csum + arr[i];
				cend++;
			} else {
				csum = arr[i];
				cstart = cend = i;
			}
			if (csum > osum) {
				osum = csum;
				ostart = cstart;
				oend = cend;
			}
		}
		System.out.println("the max sum is " + osum + "");
		for (int i = ostart; i < oend; i++) 
		{
			System.out.print(arr[i] + " ");
		}
	}
}
