package Own.recursion;

import java.util.ArrayList;

public class bubblesort {
	static String[] codes  = {" ","abc","de","fghi","jkl","mn","op","rstu","vw","xyz"};
	public static void main(String[] args) {
		
		int ladder[] = new int[16];
		ladder[2]=13;
		ladder[3]=11;
		ladder[5]=7;
		//ladder(0, 10, "", ladder);
		int snl[] = new int[21];
		snl[3]=17;
		snl[7]=11;
		snl[13]=5;
		snl[19]=2;
		int [] move = {2,5,3,4,6,3,4,3,5,1,2,3};
		snakewithladder(0, 20, snl, move, 0);
	}

		public static void bubble(int arr[]){
			int n = arr.length;
			for(int i=0;i<n-1;i++)
			{
				for(int j=0;j< n-i-1;j++){
					if(arr[j]>arr[j+1]){
						  swap(arr, j, j+1);
					}
				}
			}
			for(int val : arr){
				System.out.println(val);
			}
		}

		private static void swap(int[] arr, int j, int i) {
			int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;		
		}
		
		public static void bubblesort(int arr[],int si,int li){
			if(li==0)
			{
				return ;
			}
			if(si==li){
				bubblesort(arr,0, li-1);
				return;
			}
			if(arr[si]>arr[si+1]){
				swap(arr, si, si+1);
			}
			bubblesort(arr, si+1, li);
			
		}
		public static ArrayList<String> gss(String str){
			if(str.length() ==0){
				ArrayList<String> bs = new ArrayList<>();
				bs.add(" ");
				return bs;
			}
			char c = str.charAt(0);
			String rs = str.substring(1);
			
			ArrayList<String> rr = gss(rs);
			ArrayList<String> op = new ArrayList<>();
			for(String ans : rr){
				op.add(ans);
				op.add(c + ans);
			}
			return op;
		}
		
		public static ArrayList<String> gsswithasci(String str){
			if(str.length() ==0){
				ArrayList<String> bs = new ArrayList<>();
				bs.add(" ");
				return bs;
			}
			char c = str.charAt(0);
			String rs = str.substring(1);
			
			ArrayList<String> rr = gsswithasci(rs);
			ArrayList<String> op = new ArrayList<>();
			for(String ans : rr){
				op.add(ans);
				op.add(c + ans);
				op.add((int ) c + ans);
			}
			return op;
		}
		
		public static ArrayList<String> keypad(String str,String arr[]){
			if(str.length() ==0){
				ArrayList<String> bs = new ArrayList<>();
				bs.add(" ");
				return bs;
			}
			char ch = str.charAt(0);
			String rs = str.substring(1);
			ArrayList<String> rr = keypad(rs, arr);
			ArrayList<String> op = new ArrayList<>();
			for(String ans:rr){
				String code = arr[ch - '0'];
				for(int i=0;i<=code.length()-1;i++){
					char chcode = code.charAt(i);
					op.add(chcode+ans);
				}
			}
			return op;
	}
		
		public static void printsubss(String ques, String asf){
			if(ques.length()==0){
				System.out.println(asf);
				return;
			}
			char ch = ques.charAt(0);
			String reofq = ques.substring(1);
			printsubss(reofq, asf);   // no waali call
			printsubss(reofq, asf+ch); // yes waali call
		}
		
		public static void printkeypad(String ques,String asf){
			
			if(ques.length() == 0){
				System.out.println(asf);
				return;
			}
			
			char ch = ques.charAt(0);
			String ros = ques.substring(1);
		
			String charcode = codes[ch - '0'];
			for(int i =0;i<=charcode.length()-1;i++){
				char chcode  = charcode.charAt(i);
				printkeypad(ros, asf+chcode);	
			}		
		}
		public static void printboardpath(int src,int des,String asf)
		{
			if(src==des)
			{
				System.out.println(asf);
				return;
			}
			if(src>des)
			{
				return;
			}
			for(int dice = 1;dice<=6;dice++)
			{
				int inter = dice+ src;
				printboardpath(inter, des,asf+dice);
			}
		}
		public static void printboardpathpro(int src,int des,String asf)
		{
			if(src==des)
			{
				System.out.println(asf);
				return;
			}
			
			for(int dice = 1;dice<=6;dice++)
			{
				if(src<des)
				{
					int inter = dice+ src;
					printboardpathpro(inter, des,asf+dice);
				}
				
			}
		}
		public static void boardopenwithone(int src,int des,String asf){
			if(src==des)
			{
				System.out.println(asf);
				return;
			}
			if(src>des)
			{
				return;
			}
			if(src==0){
				boardopenwithone(1, des, asf+1);
				boardopenwithone(1, des, asf+6);
			}else{
				for(int dice=1;dice<=6;dice++){
					int inter = dice+src;
					boardopenwithone(inter, des, asf+dice);
				}	
			}	
		}
		public static void ladder(int src,int des,String asf,int ladder[]){
			if(src==des)
			{
				System.out.println(asf);
				return;
			}
			if(src>des){
				return;
			}
			if(src==0)
			{
				ladder(1, des, asf+1, ladder);
				ladder(1, des, asf+6, ladder);
			}
			else if(ladder[src]!=0){
				ladder(src+ladder[src], des, asf+ladder[src], ladder);
			}
			else{
				for(int dice=1;dice<=6;dice++){
					int inter = dice+src;
					ladder(inter, des, asf+dice,ladder);
				}
			}
		}
		public static void snakewithladder(int src,int des,int [] snl,int move[],int mindx){
			if(src==des){
				System.out.println("win");
				return;
			}
			if(mindx==move.length){   //moves khatam ho jaati hai
				System.out.println(src);
				return;
			}			
				if(src==0){   //agr board khula hi nahi hai abhi
					if(move[mindx]==1 || move[mindx]==6){ //agr 1 ya 5 ayya
						snakewithladder(src+1, des, snl, move, mindx+1);
					}
					else{   //agr 1 ya 6 nahi aaya
						snakewithladder(src, des, snl, move, mindx+1);
					}
				}
				else{   //board khul gya hai
					if(snl[src]!=0){  //agr snake ya ladder hai 
						snakewithladder(snl[src], des, snl, move, mindx);
					}else
					{ //snake ya ladder nahi hai 
						if(src+move[mindx]<=des){  //board se bahar ni jaa rha hai agr
							snakewithladder(src+move[mindx], des, snl, move, mindx+1);
						}else{  //board se bahar jaa rha hai agr
							snakewithladder(src, des, snl, move, mindx+1);
						}
					}
				}
		}
}