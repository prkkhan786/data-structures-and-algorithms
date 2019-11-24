
public class Multipleofarray {

	public static void main(String[] args) {
		int arr [] = {7,2,5,70,63};
		rotatebyn(arr, 2);
		for(int val : arr){
			System.out.println(val);
		}
	}
	
	public static void multipleof(int arr[]){
		int [] out = new int[arr.length];
		int count = 0;
		for(int i =0;i<=arr.length -1 ;i++){
			if(arr[i] % 7 ==0){
				out[count++] = arr[i];
			}
		}
		for(int val : out){
			System.out.println(val);
		}
	}

		public static void reversearray(int arr[],int left,int right){
			while(left<right){
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
			
		}
		
		public static void rotatebyn(int arr[] ,int d){
			reversearray(arr, 0, d);
			reversearray(arr, d+1, arr.length-1);
			reversearray(arr, 0, arr.length-1);
		}
}
