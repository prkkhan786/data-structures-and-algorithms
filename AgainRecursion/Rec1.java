package AgainRecursion;

public class Rec1 {
	public static void main(String[] args) {
//		System.out.println(fact(5));
//		System.out.println(power(2, 1));
		toh("A", "B", "C", 3);
	}

	public static void printd(int n) {
		if (n == 0) {
			return;
		}
		System.out.print(n);
		printd(n - 1);
		System.out.print(n);
	}

	public static int fact(int n) {
		if (n == 1) {
			return n;
		}
		int f = n * fact(n - 1);
		return f;
	}

	public static int power(int x, int n) {
		if (n == 0) {
			return 1;
		}

		return x * power(x, n - 1);
		
	}
	public static int fibonacci(int n){
		if(n==0){
			return n;
		}
		if(n==1){
			return 1;
		}
		int f1 = fibonacci(n-1);
		int f = fibonacci(n-2);
		return f1+f;
	}
	
	public static void toh(String src,String des,String help,int n){
		if(n==0){
			return;
		}
		toh(src, help, des, n-1);
		System.out.println("move "+ n + src + "to" + help+"using "+ des);
		toh(help, des, src, n-1);
	}
}
