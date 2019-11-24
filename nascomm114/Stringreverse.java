package nascomm114;

public class Stringreverse {
	
	public static void replace(String s, int i, char ch){
		char[] arr =  s.toCharArray();
		arr[i] = ch;
		
		for(char val : arr){
			System.out.print(val);
		}
		
	}

	public static void main(String[] args) {
		String src = "hello";
		//replace(src, 2, 'z');
		upper(src);
	}
	
	public static void upper(String s1){
			StringBuilder sb = new StringBuilder(s1);
			for(int i=0;i<sb.length();i++){
				char ch  = sb.charAt(i);
				if(ch >='a' && ch<'z' )
				{
					ch = (char)(ch - 'a' + 'A' );
					sb.setCharAt(i, ch);
				}
				else{
					ch = (char)(ch - 'A' + 'a');
					sb.setCharAt(i, ch);
				}
			}
		 String sf =sb.toString();
		 System.out.println(sf);
	}
}
