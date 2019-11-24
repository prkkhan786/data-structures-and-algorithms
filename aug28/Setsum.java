package aug28;

import java.util.ArrayList;

import july29.Stings;

public class Setsum {

	public static void main(String[] args) {
		
		
		int [] arr = {10,20,30,40,50};		
//		setsumwitharraylist(arr, 0, new ArrayList<>(), 0, new ArrayList<>(), 0);
//		max(arr, 0, new ArrayList<Integer>(), 0, 40);
		abc("ABCD", "");
	}
	
	public static void setsum(int arr[] , int vidx,String set1, int sums1,String set2,int sums2){
		
		if(vidx==arr.length) {
			
			if(sums1==sums2) {
				System.out.println(set1 + "\t" + set2);	
				
			}
			
			return;
		}
		
	 	setsum(arr, vidx+1, set1 + arr[vidx], sums1 + arr[vidx], set2, sums2); 
		setsum(arr, vidx+1, set1, sums1, set2 + arr[vidx], sums2 + arr[vidx]);
		
	}
	
	
public static void setsumwitharraylist(int arr[] , int vidx,ArrayList<Integer> set1, int sums1,ArrayList<Integer> set2,int sums2){
		
		if(vidx==arr.length) {
			
			if(sums1==sums2) {
				System.out.println(set1 + "\t" + set2);	
			}	
			return;
		}
		 set1.add(arr[vidx]);
		 setsumwitharraylist(arr, vidx+1,set1, sums1 + arr[vidx], set2, sums2);
		 set1.remove(set1.size() -1);
		 set2.add(arr[vidx]);
		 setsumwitharraylist(arr, vidx+1, set1, sums1, set2, sums2 + arr[vidx]);
		 set2.remove(set2.size() -1);
	}


public static void max(int arr[] , int vidx,ArrayList<Integer> set1, int sums1,int tar){
	
	if(vidx==arr.length) {
		if(tar==sums1) {
			System.out.println(set1 + "\t");	
		}	
		return;
	}
		max(arr, vidx+1, set1, sums1, tar);
	 set1.add(arr[vidx]);
	 max(arr, vidx+1,set1, sums1 + arr[vidx], tar);
	 set1.remove(set1.size() -1);
	
}


public static void abc(String ques,String asf){
	
	if(ques.length() == 0){
		System.out.println(asf);
		return;
	}
	
	char ch = ques.charAt(0);
	String res = ques.substring(1);
		for(int i=0;i<=asf.length();i++){
			 String left = asf.substring(0, i);
			 String right = asf.substring(i);

			 abc(res,left + ch + right);
			 
		}
		
}



	
	
}


