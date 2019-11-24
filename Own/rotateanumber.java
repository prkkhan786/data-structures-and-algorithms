package Own;

public class rotateanumber {

	public static void main(String[] args) {
		
		rotate(0, 12345);

	}
	public static void rotate(int r,int n){
		while(n!=0){
			int rem = n%10;
			n = n/10;
			System.out.print(rem+ " ");
		}
	}

}
