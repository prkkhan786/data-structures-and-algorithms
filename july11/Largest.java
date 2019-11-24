package july11;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10000000;
		int b = 30 ;
		int c = 20;
		
		if(a >= b && a>=c ){
			System.out.println(a +  " is largest");
		}
		else{
			if(b >=a && b >= c ){
				System.out.println(b + "is largest" );
			}
			else {
				System.out.println(c + "is largest");
			}
		}

	}

}



