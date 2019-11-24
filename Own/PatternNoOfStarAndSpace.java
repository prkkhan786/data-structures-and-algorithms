package Own;

public class PatternNoOfStarAndSpace {

	public static void main(String[] args) {
		
		int n = 5;
		int r =1;
		int nos = n/2 + 1;
		int nospace =1;
		
		while(r<=n){
			//star set one
			
			int cst1=1;
			while(cst1<=nos){
				System.out.print("*");
				cst1++;
			}
			// spaces 
			int css=1;
			
			while(css<=nospace){
				System.out.print(" ");
				css++;
			}
			//star setv two
			
			int cst2=1;
			while(cst2<=nos){
				System.out.print("*");
				cst2++;
			}
			//change the value of no of star and spaces in columns
			if(r <= n/2){
				nos--;
				nospace +=2;
				}
				else{
					nospace-=2;
					nos++;
					
				}
			
			
	
			System.out.println();
			r++;
		}

	}

}
