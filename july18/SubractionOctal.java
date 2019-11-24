package july18;

import java.util.Scanner;

public class SubractionOctal {

	public static void main(String[] args) {
			
	Scanner src = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n = src.nextInt();
		int m =src.nextInt();
		int digit1;
		int digit2;
		int y=8;
		int base=0;
	
		int f=0;
		int x=1;
		int b=0;
		
		
		while(n!=0 || m!=0 ||b!=0 ){
			digit1 = n%10 - b;
			digit2 = m%10;
			
			if(digit1> digit2)
			{
				base=digit1-digit2;
				n=n/10;
				b=0;
				
			}
			else
			{
				base= (digit1+y ) - digit2;
				n=n/10;
				b=1;
				
			}
			
			m=m/10;
			f = f + base * x;
			x=x*10;

						
			}
		
		System.out.println(f);

	}

}
