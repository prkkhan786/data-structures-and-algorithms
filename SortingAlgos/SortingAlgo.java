package SortingAlgos;

public class SortingAlgo {

	public static void main(String[] args) {
		int arr [] = {10,9,8,7,6,5,4,3,2,1};
		selectionsorting(arr);
	for(int val : arr){
		System.out.println(val);
	}
		

	}
	public static void bubble2(int[] arr){
		int n = arr.length;
		for(int jc=1;jc<=n-1;jc++){
			for(int j=0;j<=n-1-jc;j++){
				if(arr[j]>arr[j+1]){
					swap(arr,j,j+1);
				}
				
			}
		}
		
	}
	
	public static void revrsearray(int arr[]){
		int i = 0;
		int left = arr.length-1;
		while(i<left){
			swap(arr, i, left);
			i++;
			left--;
		}
	}
	public static void selectionsort(int [] arr){
		int n = arr.length;
		int jc = 1;
		while(jc<=n-1){
			for(int i=jc;i<n;i++){
				if(arr[i] < arr[jc -1]){
					swap(arr, i, jc-1);
				}
			}
			jc++;
		}
		
	}
	public static void insertionsort(int arr[])
	{
		int n = arr.length-1;
		int jc = 1;
		while(jc<=n){
			for(int i = jc;i<0;i--){
				if(arr[i]<arr[i-1]){
					swap(arr, i, i-1);
				}
				else{
					break;
				}
			}
			jc++;
		}
	}
	private static void swap(int[] arr, int j, int i) {
		int temp ;
		temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
		
	}
	public static void inverseanarray(int arr []){
		int two [] = new int [arr.length];
		int n = arr.length - 1 ;
		for(int i = 0;i<=n;i++){
			int val = arr[i];
			two[val] = i;
		}
		
		for(int val : two){
			System.out.println(val);
		}
	}
	
	public static void isinverse(int arr[])
	{
		int flat = 1;
		int n = arr.length - 1;
		for(int i = 0;i<=n;i++){
			int val = arr[i];
			if(arr[val]!=i){
				flat = 0;
			}
			
		}
		if(flat==1){
			System.out.println(" inverse");
		}
		
		else{
			System.out.println("not inverse");
		}
	}
	
	public static void rotateanarray(int arr [], int d )
	{
			reverse(arr,0,d-1);
			reverse(arr,d , arr.length-1);
			reverse(arr, 0, arr.length-1);
			for(int val: arr){
				System.out.print(val);
			}
			
			
			
	}
	private static void reverse(int[] arr, int left, int right) {
		while(left<right){
			int temp = arr[left] ;
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
			
		}
		
	}
	
	public static void buublesorting(int arr[]){
		for(int i =0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					swap(arr, j, j+1);
				}
			}
		}
	}
	public static void selectionsorting(int arr[]){
		for(int i =0;i>arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					swap(arr, i, j);
				}
			}
		}
	}

}
