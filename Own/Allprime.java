package Own;

public class Allprime {

	public static void main(String[] args) {
		int n=9;
		
		int i=2;
		while(i*i<=n){
			
			if(n%i==0){
				System.out.println("not prime");
				break;
			}
			
			i++;
			
		}
	
		
		if(i*i>n){
			System.out.println("prime ");
		}

	}

}
