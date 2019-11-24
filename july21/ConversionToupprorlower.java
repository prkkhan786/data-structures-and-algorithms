package july21;

import java.util.Scanner;

public class ConversionToupprorlower {

	public static void main(String[] args) {
		
		Scanner src = new Scanner(System.in);
		System.out.println("Enter a character");
		char ch  = src.nextLine().charAt(0);
		
		if(ch>='a' && ch<='z')
		{
			
			char up=(char)(ch -'a' + 'A');
			System.out.println(up);
		}
		else{
			char lc=(char)(ch -'A' + 'a');
			System.out.println(lc);
			
		}
		
	}

}
