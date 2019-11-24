package July25;

public class SubArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		for(int start=0;start<arr.length;start++){
			for(int end=start;end<arr.length;end++){
				printsub(arr ,start, end);
				
			}
		}
			
		

	}
	
	public static void printsub(int[] arr,int start, int end){
		
		for(int i=start;i<=end;i++){
			System.out.print(arr[i]+ " ");
		}
			System.out.println();
			System.out.println();
		
		
	}

}
