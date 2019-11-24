package Own;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
      
	 Scanner src = new Scanner(System.in);
	 System.out.println("enter no.");
	    int n = src.nextInt();
	    int r=1;
        while(r<=n){
        	int val =1;
        	for(int i=1;i<=r;i++){
        		System.out.print(val +" ");
        		val++;
        	}
        	
        	System.out.println();
        	r++;
        }
        
           
    }

}
