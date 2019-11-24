package july14;

import java.util.Scanner;

public class Pattern4 {

	
	public static void main(String[] args) {
		
		Scanner src = new Scanner(System.in);

		System.out.println("Enter a number");
		int n = src.nextInt();
		
		
		int r = 0;
		while(r<n){
			int value= 1;
			int c=0;
			while(c<=r){
				System.out.print(value +  " ");
				int nv = value * (r - c) / (c+1);
				value = nv;
				
				c++;
				}
			System.out.println();
			r++;
			
			}
		         }
		
		
	}
	

