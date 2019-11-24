package Own;

public class Pattern7NoofSpaceAndStar {

	public static void main(String[] args) {
		
		int n=5;
		int r=1;
		int nospace=n/2;
		int nostar=1;
		
		while(r<=n){
			
			
			int space = 1;
			while(space<=nospace){
				System.out.print(" ");
				space++;
			}
			int strs=1;
			while(strs<=nostar){
				System.out.print("*");
				strs++;
			}
			
			
			
			int space2 = 1;
			while(space2<=nospace){
				System.out.print(" ");
				space2++;
			}
			
			
			if(r<=n/2){
				nospace--;
				nostar+=2;
			}
			else{
				nospace++;
				nostar-=2;
			}
	System.out.println();
			
			r++;
		}

	}

}
