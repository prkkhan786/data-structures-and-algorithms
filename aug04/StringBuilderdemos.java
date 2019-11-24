package aug04;

import java.util.Arrays;
import java.util.HashMap;

public class StringBuilderdemos {

	public static void main(String[] args) {
		
		String src [] = {"1","3","3","5","10","31415926535897932384626433832795"};
		
		String i = "31415926535897932384626433832795";
		long l = Integer.parseInt(i);
		System.out.println(l);
		//sort(src);
	}

	public static void uppercasestring(StringBuilder s) {
		for (int i = 0; i <= s.length() - 1; i++) {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				ch = (char) (ch - 'a' + 'A');
				s.setCharAt(i, ch);
			} else {
				ch = (char) (ch - 'A' + 'a');
				s.setCharAt(i, ch);
			}

		}

		String sr = s.toString();
		System.out.println(sr);
	}

	static int hurdleRace(int k, int[] height) {
		int max = Integer.MIN_VALUE;
		for (int i : height) {
			if (i > max) {
				max = i;
			}
		}
		System.out.println(max);
		if (max > k) {
			System.out.println(max - k);
			return max - k;
		} else {
			return 0;
		}
	}

	static void designerPdfViewer(int[] h, String word) {
		HashMap<Character, Integer> hm = new HashMap<>();
		int i = 0;
		for (char ch = 'a'; ch <= 122; ch++) {
			hm.put(ch, h[i++]);
		}

		System.out.println(hm);
	}

	public static int reversenumber(int n) {
		String rev="";
		while (n != 0) {
			int rem = n % 10;
			n = n / 10;
			rev = rev + rem;
		}
		return Integer.parseInt(rev);
	}
	  public static boolean isBeautiful(int n,int k){
	        int rev = reversenumber(n);
	        if(Math.abs(n - rev)% k ==0 ){
	            return true;
	        }else{
	            return false;
	        }

	    }

	  public static void sort(String src[])
	  {	
		  long a[]= new long[100];
		  int i =0;
		  for(String s:src){
			 a[i++] = Integer.parseInt(s);
		  }
		
		Arrays.sort(a);
		for(long s: a){
			System.out.println(s);
		}
	  }
}
