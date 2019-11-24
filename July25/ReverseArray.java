package July25;

public class ReverseArray {

	public static void main(String[] args) {
		
	int[] arr = {4,0,3,1,2};
	int[] inv = inverse(arr);
	display(inv);
 		

	}
	
	public static int[] inverse (int[] arr){
		int[] inv= new int[arr.length];
		
		for(int i=0;i<arr.length;i++){
			//System.out.println(arr[i] + "--  " + i);
			
			int temp = arr[i];
			inv[temp] = i;
			
			
		}
		
		return (inv);
	}
	
	public static void display(int arr[]){
		for( int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
			}
		
	}
	
	

}
