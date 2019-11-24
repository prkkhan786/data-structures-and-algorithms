package GEEKSFORGEEKS;

public class MainClass {

	public static void main(String[] args) {
		int arr [] = {1,2,4,5};
		findmissing(arr);

	}
	public static void findmissing(int arr[]){
		int n = arr.length -1;
		int sum = n* (n-1)/2;
		System.out.println(sum);
		for(int i =0;i<=arr.length -1;i++){
			sum = sum - arr[i];
			System.out.println(sum);
		}
		System.out.println(sum);
	}

}
