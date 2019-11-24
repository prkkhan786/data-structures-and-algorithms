package july21;

public class Celsius {

	public static void main(String[] args) {
		
		int min = 0;
		int step = 20;
		int max = 300;
		int far=0;
		int i=0;
		
		
		
		for(far=min ; far<=max ; far+=step)
		{
			
			
			
			int celsius = (int) (5.0/9 * (far - 32 ));
			
			
			System.out.println(celsius);
		}
	}

}
