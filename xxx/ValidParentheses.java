package xxx;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> st = new Stack<Character>();
		String str = "()[]{}";
		boolean answer;
		
		loop:
		for(int i = 0; i < str.length(); i++) {
			switch (str.charAt(i)) {
				case '(':
				case '[':
				case '{':
					st.push(str.charAt(i));
					break;
				case ')':
				case ']':
				case '}':
					if(st.empty()) {
						answer = false;
						break loop;
					}
					if(str.charAt(i) != st.pop()) {
						answer = false;
						break loop;
					}
					break;
			}
		}
	}

}