package Own;

import java.util.Scanner;

public class Stringpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter string");
		Scanner src = new Scanner(System.in);
	    String s = src.nextLine();
	    subspalindrome(s);
	}
	public static boolean ispalindrome(String s){
	    s = s.toLowerCase();
	    int i =0;
	    int j = s.length() -1;
	    while(i<j){
	    	if(s.charAt(i)!= s.charAt(j)){
	    		return false;
	    	}
	    	i++;
	    	j--;	
	    }
	    return true;
	}
	

	public static void subspalindrome(String s){
		
		for(int i =0 ;i<=s.length()-1;i++){
			for(int j = i+1;j<=s.length();j++){
				if(ispalindrome(s.substring(i, j))){
					System.out.println(s.substring(i,j));
				}
				
			}
			
		}
	}
}
