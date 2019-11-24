package july15;

import java.util.Scanner;

public class Decimal {
	
public static void main(String[] args) {
		
			Scanner src = new Scanner(System.in);
			
			System.out.println("Enter a number ");
			
			int n = src.nextInt();
		
		
		int r=0;
		int dc=0;
		int x = 1;
		int y=2;
		
		while(n!=0){
			r = n%10;
			n = n/10;
			dc = dc + r*x*y/2;
			y = y*2;
		}
		System.out.println(dc);
		
	}

}
