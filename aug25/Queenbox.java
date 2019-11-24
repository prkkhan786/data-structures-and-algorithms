package aug25;

public class Queenbox {

	public static void main(String[] args) {

		boolean [] boxes = new boolean[4];
		int [] coin = new int[4];
		coin[0]=2;
		coin[1]=3;
		coin[2]=5;
		coin[3]=6;

		//queen(boxes, 1, 2, 0, "");
		coinChangeindex(coin, 10, 0, 0, "");

	}
	
	public static void queen(boolean arr[], int qn,int tnq,int box,String str){
		
		if(qn>tnq){
			System.out.println(str);
			return;
		}
		if(box==arr.length){
			return;
		}
		queen(arr, qn, tnq, box+1, str);
		queen(arr, qn+1, tnq, box+1, str+ "q"+qn + "b"+ box);
	}

	
	
	public static void coinChangeindex(int[] coin,int amt,int psf, int cindex,String asf){
		
		if(psf==amt){
			System.out.println(asf);
			return;
		}
		
		for(int i=cindex;i<coin.length;i++){
			if(coin[i]+psf<=amt)
			{
				coinChangeindex(coin, amt, psf+coin[i] ,i, asf+" "+ coin[i]);
			}
			
		}
		
	}
	
	public static void chessqueen(boolean chess [][],int qn){
		
	}
	
}
