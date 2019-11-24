package july15;

import java.util.Scanner;

public class Hcf {
	
	public static void main(String[] args) {
		
		
		int n1=52;
		int n2=68;
		int rem = n1 % n2;
		while(rem!=0){
			n1=n2;
			n2=rem;
			System.out.println(n1);
			System.out.println(n2);
			rem = n1 % n2;
		}
		System.out.println(n2);
		
		
	}

}
