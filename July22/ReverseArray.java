package July22;

public class ReverseArray {

	public static void main(String[] args) {
		
		
		int[] arr = {10,20,30,40,50,60,70};
		
		int start=0;
		int end = arr.length-1;
		for(int i=0;i<arr.length/2;i++){
			int temp=arr[end];
			arr[end] = arr[i];
			arr[i] = temp;
			end--;
		}
		for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+" ");
		}
	}

}
