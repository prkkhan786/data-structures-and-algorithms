package Own;

public class KadaneAlgo {

	public static void main(String[] args) {
		
		int arr[] = {2,3,-6,1,2,3,-4,5};
		kadane(arr);

	}
	public static void kadane(int arr[]){
		int csum = arr[0];
		int osum = arr[0];
		int cstart = 0;
		int cend = 0;
		int ostart = 0;
		int oend = 0;
		for(int i = 1;i<=arr.length-1;i++){
			if(csum < 0){
				csum = arr[i];
				cstart = cend = i;
			}
			else{
				csum = csum + arr[i];
				cend++;
				
			}
			if(csum > osum){
				osum = csum;
				ostart = cstart;
				oend = cend;
			}
			
		}
		System.out.println(osum + " " + ostart + " " + oend);
	}

}
