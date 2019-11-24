package Own;

import java.util.Scanner;

public class decimaltobinary {
	public static void main(String[] args) {
		 Scanner src = new Scanner(System.in);
		 System.out.println("enter no.");
		    int  dec = src.nextInt();
		    int sr = src.nextInt();
		
		int bn =0;
		int power =1;
		while(dec!=0){
			int rem = dec % sr;
			dec = dec/sr;
			
			bn = bn + rem * power;
			power = power * 10;
		}
		
		System.out.println(bn);
		
	}

}
