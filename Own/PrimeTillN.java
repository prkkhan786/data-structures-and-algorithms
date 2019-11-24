package Own;

public class PrimeTillN {

	public static void main(String[] args) {
		
		int n=100;
		
		int cn=2;
		while(cn<=n){
			int divisor=2;
				while(divisor*divisor<=cn){
					if(cn%divisor==0){
						break;
						
					}
					
					divisor++;
				}
				
				if(divisor*divisor>cn){
					System.out.println(cn);
				}
			cn++;
		}

	}

}
