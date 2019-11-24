package stackquestions;
import stack.Stackstory;
public class Bracketmatch {
	public void main(String[] args) {
		String src = "[{b+(c+d)+e}]+f";
		//System.out.println(match(src));
		System.out.println(isprime(50));
	}
	public boolean match(String src) {
		Stackstory st = new Stackstory(src.length());
		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			if (ch == '{' || ch == '[' || ch == '(') {
				st.push(ch);

			} else if (ch == '}' || ch == ']' || ch == ')') 
			{
				if (st.size() == 0) {
					return false;
				} else {
					if (ch == '}' && st.top() == '{') {
						st.pop();
					} else if (ch == ']' && st.top() == '[') {
						st.pop();
					} else if (ch == ')' && st.top() == '(') {
						st.pop();
					} else {
						return false;
					}
				}
			}
		}

		if (st.size() == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isprime(int n){
        int i=2;
        while(i*i<=n){
            if(n%i==0){
                return false;
            }
            i++;
        }
        if(i*i>n){
        	 return true;
        }
       
    }

}
