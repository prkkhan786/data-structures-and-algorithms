package Sep3;

import java.util.Arrays;

public class primeoptimized {

	public static void main(String[] args) {
	
		primetilln(100);
	}
	public static void primetilln(int n){
		boolean [] arr = new boolean [n+1];
		Arrays.fill(arr, true);
		arr[0] =  false;
		arr[1] = false;
		
		for(int i =2;i<=arr.length-1;i++){
			
			for(int j=i;j*i<=n;j++){
				arr[i*j] = false;
			}
		}
		for(int i = 2; i < arr.length-1; i++)
        {
            if(arr[i] == true)
                System.out.print(i + " ");
        }
		
	}

}
