package sortingwithrecursion;
public class Mergesort {
	public static void main(String[] args) {
//		int[] two = {0,3,7,8,11};
//		int [] merged =  Mergetwo(one, two);
		int[] arr = {2,5,9,15,19,20};
		int[] merged = mergesort(arr, 0 ,arr.length - 1);
		for(int val : merged){
			System.out.print(val+" ");
		}
	}
	public static int[] Mergetwo(int [] one,int []two){
		int [] merged  = new int [one.length + two.length];
		int i=0;
		int j =0;
		int k =0;
		while(i<one.length && j<two.length){
			if(one[i]<two[j]){
				merged[k] = one[i];
				i++;
				k++;
			}
			else{
				merged[k] = two[j];
				j++;
				k++;
			}
		}
		while(i<one.length){
			merged[k] = one[i];
			k++;
			i++;
		}
		while(j<two.length){
			merged[k] = two[j];
			k++;
			j++;
		}
		return merged;
	}
	
	public static int[] mergesort(int [] arr ,int low ,int high){
		
		if(low==high){
			int[] base = new int [1];
			base[0] = arr[low];
			return base;
		}
		int mid = (low + high)/2;
		int[] firsth = mergesort(arr, low, mid);
		int[] secondh = mergesort(arr, mid+1, high);
		int [] sorted = Mergetwo(firsth, secondh);
		return sorted;
	}

}
