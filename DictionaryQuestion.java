import java.util.HashMap;

public class DictionaryQuestion {

	static String dict[] = { "i", "love", "indian", "food", "spicy" };

	public static void main(String[] args) {
		
		System.out.println(wordBreak("ilovespicy"));
	}
	public static boolean wordBreak(String s) {
		return wordBreakHelper(s, 0);
	}
	public static boolean wordBreakHelper(String s, int start) {
		if (start == s.length())
			return true;
		for (String a : dict) {
			int len = a.length();
			int end = start + len;

			if (end > s.length())
				continue;
			
			if (s.substring(start, start + len).equals(a))
				if (wordBreakHelper(s, start + len))
					return true;
		}
		return false;
	}
//	public static void wordbreak(String s)
//	{
//		int l = s.length();
//		String a = "";
//		for(int i =0;i<l;i++)
//		{
//			if(a.equals()){
//				
//			}
//		}
//	}
}
