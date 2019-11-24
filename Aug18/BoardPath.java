package Aug18;

public class BoardPath {
	static int counter=1;

	public static void main(String[] args) {
				
		validboard(0,10,"");
	}
	
	public static void board(int src, int des,String path){
		
		if(src==des){
			System.out.println(path);
			return;
		}
		
		for(int i=1;i<=6;i++){
			int inter = src + i; 
			if(inter<=des){
			board(inter,des,path+i);
			}
		}
	}

	

	
	public static void validboard(int src, int des,String path){
		
		
		if(src==des){
			
			System.out.println("Path number -> " + counter+ " "+ path);
			counter++;
			return;
			
		}
		
		for(int i=1;i<=6;i++){
			
			int inter = src + i; 
			if(inter<=des){
				
				if(src==0){
					validboard(inter+1, des, path+1);
				}
				if(src==0){
					validboard(inter+1, des, path+6);
				}
				if(src!=0){
					validboard(inter+i, des, path+i);
				}
				
			}
		}
	}
}
