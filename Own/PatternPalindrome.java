package Own;

public class PatternPalindrome {

	public static void main(String[] args) {
	
		int n=5;
		int i=1;
		int t1=0;
		int t2=1;
		int next=t1+t2;
		while(i<=n){
			int z=1;
			while(z<=i){
				System.out.print(t1+ " ");
				t1=t2;
				t2=next;
				next=t1+t2;
				z++;
			}
			System.out.println();
			i++;
		}

	}

}
