package july18;



public class OctalAddition {

	public static void main(String[] args) {
		
		
		
		
		
		int n = 757;
		int m = 4764;
		int sum = 0;
		int fin = 0;
		
		int carry = 0;
		int digit1;
		int digit2;
		int base;
		int x=1;
		
		
		while(n!=0 || m!=0){
		digit1 = n%10;
		digit2 = m%10;
		
		sum = digit1 + digit2 + carry;
		base  = sum%8;
		carry = sum/8;
		fin = fin + base * x;
		x= x*10;
		n=n/10;
		m=m/10;
		}

		
		fin = fin + carry*x;
		System.out.println(fin);
		
		
		
		


		
	}

}
