package Aug18;

public class Snakegame {
	
	public static void main(String[] args) {
	 int [] moves  = {2,6,6,5,3,6,5,1,6,4,1,2,3};
	 int [] snakeladder = new int[28];
	 snakeladder[3] = 19;
	 snakeladder[9] = 24;
	 snakeladder[26] = 2;
	 snakeladder[20] = 4;
	 snake(0,28,"",snakeladder,moves,0);
	}
	
	public static void snake(int src,int des,String ans,int [] ladersnake,int [] move ,int mindex){
		
		if(src==des){
			System.out.println("win");
			return;
		}
		if(mindex==move.length){
			System.out.println(false);
			return;
		}
		
		if(src == 0){
			if(move[mindex] == 1 || move[mindex]== 6)
			{
				snake(src+1, des, ans, ladersnake, move, mindex+1);
			}
			else 
			{
				snake(src, des, ans, ladersnake, move, mindex+1);	
			}
		}
		else{
			if(src+move[mindex]>des){
				snake(src, des, ans, ladersnake, move, mindex+1);
			}
			else{
				int inter = src + move[mindex];
				if(move[inter] == 0){
					snake(src, des, ans, ladersnake, move, mindex+1);
				}
				else{
					snake(ladersnake[inter], des, ans, ladersnake, move, mindex);
				}
			}
		}

	}

}
