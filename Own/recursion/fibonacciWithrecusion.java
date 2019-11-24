package Own.recursion;

public class fibonacciWithrecusion {

	public static void main(String[] args) {
		int arr[] = {8,7,5,6,3};
//		display(arr, 0);
		bubble(arr, 0, arr.length-1);
		for(int val : arr){
			System.out.println(val);
		}
	
		
//	TOH("A", "B", "C", 9);
	}
	
	public static int fib(int n){
		
		if(n==0){
			return n;
		}
		if(n==1){
			return n;
		}
		
		 int f=fib(n-1);
		 int res = n * f;
		 return res;
	}
	
	public static int power(int n,int x){
		if(x==0){
			return 1;
		}
		int f = n * power(n,x-1);
		return f;
		
	}
	
	public static int smartpower(int x, int n){
		if(n==0){
			return 1;	
		}
		
		int f = smartpower(x, n/2);
		int g = f * f;
		if(n%2==1){
			g = f * f * x;
		}
		return g;
	}
	
	public static void arrayprint(int arr[],int vidx){
		if(vidx==arr.length){
			return;
		}
		
		arrayprint(arr, vidx+1);
		System.out.println(arr[vidx]);
		
	}
	
	public static int printdecreasing(int n){
		if(n==0){
			return 0;
		}
		if(n==1){
			return 1;
		}

		int res = n * printdecreasing(n-1);
		return res;	
	}
	
	public static void TOH(String Src,String des,String help,int n){
		if(n==0){
			return;
		}
		
		TOH(Src, help, des, n-1);
		System.out.println("move "+ n + " from " + Src+ "to " + help + "using "+ des);
		TOH(help, des, Src, n-1);
	}
	
	
	public static void tower(String Src,String des,String help,int n){
		if(n==0){
			return;
		}
		tower(Src, help, des, n-1);
		System.out.println("move" + n+ "from "+ Src + "to " + help + " using " + des);
		tower(help, des, Src, n-1);
		
	}
	
	
	public static void display(int arr[],int vidx){
		if(arr.length==0){
			return;
		}
		if(vidx==arr.length){
			return;
		}
		
		display(arr, vidx+1);
		System.out.println(arr[vidx]);
	}
	
	public static int max(int arr[],int vidx){
		if(vidx==arr.length-1){
			
			return arr[vidx];
		}
		int m = max(arr, vidx+1);
		if(m>arr[vidx]){
			return m;
		}
		else {
			return arr[vidx];
			
		}
	}
	
	public static boolean find(int arr[],int  data,int vidx){
		
		if(vidx==arr.length-1){
			return false;
		}
		
		if(data==arr[vidx]){
			return true;
		}
		else{
			boolean filsa= find(arr, data, vidx+1);
			return filsa;
		}
		
	}
	
	public static int findwithindex(int arr[],int data,int vidx){
		
		if(vidx==arr.length-1){
			return -1;
		}
		if(data==arr[vidx]){
			return vidx;
		}
		else{
			int i = findwithindex(arr, data, vidx+1);
			return i;
		}
	}
	
public static int findwithlastindex(int arr[],int data,int vidx){

		if(vidx==arr.length){
			return -1;
		}
		 int i = findwithlastindex(arr, data, vidx+1);
		 if(i!=-1){
			 return i;
		 }
		 else{
			 if(data==arr[vidx]){
				 return vidx;
			 }
			 else{
				 return -1;
			 }
		 }
		
	}

public static int [] findwithallindex(int arr[],int data,int vidx,int csf){
	
	if(vidx==arr.length){
		return new int [csf];
	}
	int res [] = null;
		if(data == arr[vidx]){
			res = findwithallindex(arr, data, vidx+1, csf+1);
			res[csf] = vidx;
		}
		else{
			res = findwithallindex(arr, data, vidx+1, csf);
			
		}
		return res;
		
		
	}
	

	public static void bubble(int arr[],int si,int ei){
		
		if(ei==0){
			return;
		}
		if(si==ei){
			bubble(arr, 0, ei-1);
			return;
		}
		if(arr[si]>arr[si+1]){
			int temp = arr[si];
			arr[si] = arr[si+1];
			arr[si+1] = temp;
		}
		
		bubble(arr, si+1, ei);
	}
}
