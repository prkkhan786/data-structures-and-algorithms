package DynamicPrograming;

public class Lecture1 {

	public static void main(String[] args) {
		int n = 5;
//		long start = System.currentTimeMillis();
//		System.out.println(fib(5, new int[n + 1]));
//		long end = System.currentTimeMillis();
//		System.out.println(start-end);
//		
//		
		
		int arr [] = new int [10];
		for(int i : arr){
			System.out.println(i);
		}
		
	}

	public static int fib(int n, int quesbank[]) 
	{
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		if (quesbank[n]!= 0) {
			return quesbank[n];
		}
		int  n1 = fib(n-1, quesbank);
		int n2= fib(n-2, quesbank);
		quesbank[n] = n1+n2;
		return n1+n2;
	}

}
