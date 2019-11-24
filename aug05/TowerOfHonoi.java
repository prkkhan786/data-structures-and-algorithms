package aug05;
public class TowerOfHonoi {
	public static void main(String[] args) {
		disk(3,"A","B","C");	
	}
	public static void disk(int n,String src,String des ,String help){
		if(n==0){
			return;
		}
		disk(n-1,src,help,des);
	System.out.println(src + n + des);
		disk(n-1,help,des,src);
	}
}
