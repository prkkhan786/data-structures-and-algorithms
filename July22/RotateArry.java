package July22;

public class RotateArry {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60,70,80,90,100};
		int start=0;
		int end = arr.length-1;
		int d=3;
		rotate(arr,start ,end, d);
		display(arr,start);
		
		}
	
	public static void reverse(int arr[],int left,int right){
		int start = left;
		int end= right;
		
		while(start<end){
			swap(arr, start, end);
			start++;
			end--;
		}
	}
		public static void rotate(int arr[],int left,int right, int d){
			reverse(arr,left, right - d);
			reverse(arr, right- d +1, right);
			reverse(arr,  left,right);	
		}
		 static void swap(int arr[],int left,int right)
		{
		int temp=arr[right];
		arr[right] = arr[left];
		arr[left] = temp;
		}
		public static void display(int arr[],int i){
			for( i=0;i<arr.length;i++){
				System.out.print(arr[i]+" ");
				}	
		}
}
