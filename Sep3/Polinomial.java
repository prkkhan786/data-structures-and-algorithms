package Sep3;

public class Polinomial {

	public static void main(String[] args) {
		
//		int i = polinomial(2, 3);
//		System.out.println(i);
//		char ch = count("abbbccaacddaacd");
//		System.out.println(ch);
//		int [] arr = {5,2,0,0,9,0,8,0,6,0,0,7};
//		int [] ans = sort(arr);
//		for(int val : ans){
//			System.out.println(val);
//		}
//		int [] arr = {2,2,4,4,5,6,6};
//		singlearray(arr);
		int [] arr = {5,18,12,7,18,5,7,8};
		singlearray2(arr);
		
		
	}
	
	public static int polinomial(int x, int n){
		
		int sum = 0;
		int power = x;
		for(int i=n;i>=1;i--){
			sum = sum + power * i;
			power = power * x;
		}
		return sum;
	}
	public static char count(String src){
		int [] arr = new int[26];
		for(int i=0;i<=src.length()-1;i++){
			char c = src.charAt(i);
			arr[c-'a']++;	
		}
		int maxi=0;
		for(int i=0;i<=arr.length-1;i++){
			if(arr[i] > arr[maxi]){
				maxi = i;
			}
		}
		return (char)(maxi+'a');
	}
	
	public static int [] sort(int [] arr){
		int arr2 [] = new int[arr.length]; 
		int i=0;
		while(i< arr.length-1){
			if(arr[i]!=0){
				int j = 0;
				arr2[j]=arr[i];
				j++;
				i++;
			}
			else{
				int j =arr.length-1;
				arr2[j] = arr[i];
				j--;
				i++;
			}
		}
		return arr2;
	}
	
	public static void singlearray(int [] arr){
		int i = 0;
		for(int val : arr){
			i= i^val;
		}
		System.out.println(i);
		
		
	}
	
	public static void singlearray2(int [] arr){
		int xor = 0;
		for(int val : arr){
			xor = xor ^ val;
		}
		int rmsb = xor & -xor;
		int x = xor;
		int y = xor;
		for(int val : arr){
			if((val&  rmsb) == 0){
				x ^=val;
			}
			else
				y ^=val;
		}
		System.out.println(x + " " + y);
	}
}
