package aug20;

public class QueenSetwithpermutation {
	static int counter=1;

	public static void main(String[] args) {
		
		
		boolean [] boxes = new boolean[4];
		int [] coin = new int[4];
		coin[0]=2;
		coin[1]=3;
		coin[2]=5;
		coin[3]=6;

		//coinChange(coin, 10, 0, "");
		//queenwithcombination(boxes,0,2,"");
		queenwithcombination(boxes,0,2,0,"");
		
	}
		
	public static void queenwithpermutation(boolean[] boxes,int qno,int tnq , int pt,String ans){
		if(qno>=tnq){
			System.out.println(ans);
			return;
		}
		
		for(int b=pt;b<=boxes.length-1;b++){
			
			if(boxes[b] == false){
				boxes[b] = true;
				queenwithpermutation(boxes,qno+1,2,pt+1,ans+"q"+qno+"b"+b );
				boxes[b] = false;
			}
				
		}
		
	}
	
	public static void queenwithcombination(boolean[] boxes,int qno,int tnq,int qn, String ans){
		if(qno>=tnq){
			System.out.println(ans);
			return;
		}
		
		for(int b=qn+1;b<=boxes.length-1;b++){
			
			if(boxes[b] == false){
				boxes[b] = true;
				queenwithcombination(boxes,qno+1,tnq,qn,ans+"q"+qno+"b"+b );
				boxes[b] = false;
			}	
		}
		
	}
	public static void coinChange(int[] coin,int amt,int psf,String asf){
	
		if(psf==amt){
			counter++;
			System.out.println(counter + " " + asf);
			return;
		}
		
		for(int i=0;i<coin.length;i++){
			if(coin[i]+psf<=amt)
			{
				coinChange(coin, amt, psf+coin[i], asf);
			}
			
		}
		
	}
	
}
