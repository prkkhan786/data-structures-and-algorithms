package recution5;

public class maze {

	public static void main(String[] args) {
		mazepathdiagonal(0, 0, 2, 2, "");
	}
	public static void mazepath(int sr,int sc,int dr,int dc,String asf){
		if(sr==dr && sc==dc){
			System.out.println(asf);
			return;
		}
		//horizontal call
		if(sc+1<=dc){
			mazepath(sr, sc+1, dr, dc, asf+"H");
		}
		if(sr+1<=dr){
			mazepath(sr+1, sc, dr, dc, asf+"V");
		}
	}
	
	public static void mazepathdiagonal(int sr,int sc,int dr,int dc,String asf){
		if(sr==dr && sc==dc){
			System.out.println(asf);
			return;
		}
		//horizontal call
		if(sc+1<=dc){
			mazepathdiagonal(sr, sc+1, dr, dc, asf+"H");
		}
		if(sr+1<=dr){
			mazepathdiagonal(sr+1, sc, dr, dc, asf+"V");
		}
		if(sr+1<=dr && sc+1<=dc){
			mazepathdiagonal(sr+1, sc+1, dr, dc, asf+"D");
		}
	}
	public static void flodfill(int sr,int sc,int dr,int dc,String psf,int maze[],boolean visited[]){4
		
		
	}
}
