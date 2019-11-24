package Own;

public class fact {

	public static void main(String[] args) {
		int n =5;
		int r=3;
		
		int ans = fact(n) / fact(n - r);
		int ans2 = fact(n) / (fact(r) * fact(n-r));	
		System.out.println(ans);
		System.out.println(ans2);
		
	}
		public static int fact(int n){
			int fact =1;
			for(int i=1;i<=n;i++){
				fact= fact*i;

			}
			return fact;
			
		}
	

}
