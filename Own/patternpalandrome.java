package Own;

public class patternpalandrome {

	public static void main(String[] args) {
		int n = 5;
		int r=0;
		while(r<n){
			int c=0;
			int val =1;
			while(c<=r){
				
				System.out.print(val + " ");
				int newval = val * (r-c) / (c+1) ;
				val = newval;
				c++;
			}
			
			r++;
			System.out.println();
		}
		
		

	}

}
