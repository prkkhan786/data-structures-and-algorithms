package targetsum;

public class Targetsum {
	public static void main(String[] args) {
	
			int arr[] = {1,2,3,4,5,6,7,8,9};
			int ts = 7;
			int left = 0;
			int right = arr.length-1;
			while(left<right || left+1<=right ){
				if(arr[left]+arr[right]==ts){
					System.out.println(arr[left] + " " + arr[right]);
					left++;
					right--;
				}
				else if(arr[left]+arr[right]<ts){
					
					left++;
				}
				else{
					right--;
				}
			}
			
			
	}
	

}
