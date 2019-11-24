package sep9;
import java.util.Stack;

import stack.Stackstory;

public class brackets {
	
	public static void main(String[] args){
		String src = "[{b+(c+d)+e}]+f";
		String src1 = "((b(c+d)+e))";
		System.out.println(match(src));
		//System.out.println(duplicate(src1));	
		Stack<Character> st = new Stack<>();

	}

	public static boolean match(String src)
	{
		Stackstory st = new Stackstory(src.length());
		for(int i=0;i<src.length();i++)
		{
			if(src.charAt(i)=='{' || src.charAt(i)=='(' || src.charAt(i)=='['){
				
				st.push(src.charAt(i));
			}
			else if(src.charAt(i)=='}' || src.charAt(i)==')' || src.charAt(i)==']') {
				if(st.size() == 0 )
				{
					return false;
				}
				else{
					
					if(src.charAt(i)=='}' && st.top()=='{'){
						st.pop();
					}
					else if(src.charAt(i)==']' && st.top() == '['){
						st.pop();
					}
					else if(src.charAt(i)==')' && st.top() == '('){
						st.pop();	
					}
					else
					{
						return false;	
					}	
			}	
		}
	}
		if(st.size() == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
		}
	public static boolean duplicate(String src){
		Stackstory st = new Stackstory(src.length());
		for(int i=0;i<src.length();i++){
			char ch = src.charAt(i);
			if(ch!=')'){
				st.push(ch);
			}
			else{
				if(st.top()=='('){
					return true;
				}
				else{
					while(st.top()!='(')
						st.pop();
						
					st.pop();
				}
			}
		}
		return false;	
	}
	
	
	
}
