package july11;

import java.util.Scanner;

public class Allprime {

	public static void main(String[] args) {

		Scanner src = new Scanner(System.in);

		int n = 100;

		int cn = 2;
		while (cn <= n) { // to feed curent n
			int divisor = 2;
			while (divisor * divisor <= cn) {
				if (cn % divisor == 0) {
					break;

				}

				divisor++;
			}

			if (divisor * divisor > cn) {
				System.out.println(cn);
			}
			cn++;
		}
		
		//System.out.println(7%2);
	}
	
	public static void allprome(int n){
		
		int cn = 2;
		while(cn<=n){
			int divior = 2;
			while(divior * divior <=cn){
				if(cn % divior == 0){
					break;
				}
				divior++;
				
			}
			
			if(divior * divior >cn){
				System.out.println(cn);
			}
			cn++;
		}
		
	
		
	}
	
	public static void N_Allprime(int n){
		int cn = 2;
		while(cn<=n){
			int divisor = 2;
			while(divisor * divisor<=cn){
				if(cn % divisor==0){
					break;
				}
			}
			
			if(divisor*divisor>cn){
				System.out.println(cn);
			}
			
			cn++;
		}
	}
}
