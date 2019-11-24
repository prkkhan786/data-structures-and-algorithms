package july15;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
	
		System.out.println("Enter a number ");
		
		int n = src.nextInt();
		
		int q;
		
		
		int r = 0;
		
		
		while(n!=0){
			
			
			q = n/10;
			r = n%10;
			System.out.print(r);
			
			n =q;
			
			
			

		}
		

	}

}
