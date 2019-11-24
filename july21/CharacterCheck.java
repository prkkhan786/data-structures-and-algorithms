package july21;

import java.util.Scanner;

public class CharacterCheck {

	public static void main(String[] args) {
		
		Scanner src = new Scanner(System.in);
		
		char ch  = src.nextLine().charAt(0);
		if(ch>= 'a'&& ch<= 'z'){
			System.out.println("lowercase");
		}
		else if((ch>= 'A'&& ch<= 'Z'))
		{
			System.out.println("upercase");
			
		}
			
		else{
			System.out.println("special");
		}
		
		
	
		
	
			
			
			
			
		}
		
}
