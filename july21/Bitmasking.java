package july21;

public class Bitmasking {

	public static void main(String[] args) {
		
		int n = 57;
		int k = 2;
		int mask = 1<<k;
		
		System.out.println(Integer.toBinaryString(57));
		
		if((mask & n) == mask )
		{
			System.out.println("the bit is on");
		}
		else{
			System.out.println("the bits off");
			}
	}

}
