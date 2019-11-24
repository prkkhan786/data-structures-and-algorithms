package july14;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);

		System.out.println("Enter a number");
		int n = src.nextInt();
		int r = 1;
		int nstar = 1;
		int nspace = n/2;
		while(r<=n){
			for(int i=0; i<=nspace - 1; i++){
				System.out.print(" ");
				
				}
			if(r<=n/2)
			nspace--;
			else
				nspace++;
			for(int b=0 ; b<nstar; b++){
				
				System.out.print("*");
			}
			if(r<=n/2)
			nstar = nstar + 2;
			else
				nstar -=2;
			
			System.out.println();
			r++;
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
	

}

	
	


