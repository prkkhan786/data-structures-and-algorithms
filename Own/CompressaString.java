package Own;

public class CompressaString {

	public static void main(String[] args) {
//		String s = "aaabbbcccddddddeeeee";
//		String s1= "abc";
//		compress3(s);
		
//		int arr[] = {1,3,2,5,6,2};
//		int f [] = allindices(arr, 0, 2, 0);
//		for(int val : f){
//			System.out.println(val);
//		}
//		
		withoutEnd("vocal");

	}
	
	public static void Compress1(String s){
		for(int i=0;i<s.length()-1;i++){
			char ch = s.charAt(i);
			char ch1 = s.charAt(i+1);
			if(ch!=ch1){
				System.out.print(ch);
			}
		}
		
		System.out.println(s.charAt(s.length()-1));
	}
	public static void compress3(String s){
		int counter =1;
		for(int i = 0;i<s.length()-1;i++){
			char ch = s.charAt(i);
			char ch1= s.charAt(i+1);
			if(ch==ch1){
				counter++;
			}
			else{
				System.out.print(ch);
				System.out.print(counter);
				counter=1;
			}
		}
		
		System.out.print(s.charAt(s.length()-1));
		System.out.print(counter);
	}
	
	public static void TOH(String src,String des,String help,int n)
	{
		if(n==0)
		{
			return;
		}
		TOH(src, help, des, n-1);
		System.out.println("move"+ n + "from " +src + "to"+ des );
		TOH(help, des, src, n-1);
	}
	public static int largest(int [] arr,int vidx)
	{
		if(vidx==arr.length)
		{
			return -1;
		}
		int maxm1 =	largest(arr, vidx+1);
		if(arr[vidx]>maxm1)
		{
			return arr[vidx];
		}else
		{
			return maxm1;
		}
	}

	public static boolean Found(int arr[] , int vidx,int data)
	{
		if(vidx==arr.length)
		{
			return false;
		}
		boolean lf = Found(arr, vidx+1, data);
		if(data==arr[vidx])
		{
			return true;
		}
		return lf;
	}
	public static int firstindexfound(int arr[] ,int vidx,int data){
		
		if(vidx==arr.length){
			return -1;
		}
		if(data==arr[vidx]){
			return vidx;
		}
		int fi = firstindexfound(arr, vidx+1, data);
		
		
		return fi;
	}
	
public static int lastindexfound(int arr[] ,int vidx,int data){
		
		if(vidx==arr.length){
			return -1;
		}
		
		int fi = lastindexfound(arr, vidx+1, data);
			if(fi!=-1){
				return fi;
			}else{
				if(data==arr[vidx]){
					return vidx;
				}else{
					return -1;
				}
			}
	}

public static int [] allindices(int [] arr,int vidx,int data,int csf)
	{
		if(arr.length == vidx){
			return new int[csf];
		}
		int ar [] = null;
		if(arr[vidx]==data){
			ar = allindices(arr, vidx+1, data,csf+1);
			ar[csf] = vidx;
		}else
		{
			ar = allindices(arr, vidx+1, data,csf);
		}
		return ar;
	}

public static void withoutEnd(String str) 
{
	 char[] arr =str.toCharArray();
	 for(int i =1;i<=arr.length-2;i++)
	 {
		 System.out.println(arr[i]);
	 }
	 
	}
}
