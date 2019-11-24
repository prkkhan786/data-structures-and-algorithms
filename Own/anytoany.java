package Own;
import java.io.*;
import java.util.*;


public class anytoany {
	
	

	    public static void main(String[] args) {
	        Scanner src = new Scanner(System.in);
	        System.out.println("enter no.");
	        int sn = src.nextInt();
	        int sb = src.nextInt();
	        int db = src.nextInt();
	        
	        int a = anytodec(sn,sb);
	        System.out.println(a);
	        int b = dectoany(a,db);
	        System.out.println(b);
	        
	    }
	        
	        
	        public static int anytodec(int sn ,int db ) {
	        int ans=0;
	        int power=1;
	        while(sn!=0){
	            int rem = sn % db;
	             sn = sn/db;
	            ans = ans + rem * power;
	            power = power * 10 ;
	        }
	         
	            return ans;
	        }
	            
	        public static int dectoany(int dec ,int db ) {
	        int ans=0;
	        int power=1;
	        while(dec!=0){
	            int rem = dec % db;
	             dec = dec / db;
	            ans = ans + rem * power;
	            power = power * 10 ;
	        }
	            return ans;
	        }
	        
	        
	        
	    
	}

