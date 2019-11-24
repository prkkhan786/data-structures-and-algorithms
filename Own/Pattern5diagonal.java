package Own;

public class Pattern5diagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		int r=1;
		while(r<=n){
			int c=1;
			while(c<=n){
				if(r==c || r+c==n+1)
						{
					System.out.print("*");
				}
					
					else{
						
						System.out.print("  ");
					}
				c++;
					
				}
			System.out.println();
			r++;	
			}
		
			
			
		}

	}


