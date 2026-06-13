package Day_2_HandsOn_1;

import java.util.Scanner;
import java.util.Stack;

public class program8 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		
		boolean res = isValidParanthesis(s);
		System.out.println(res);
		
	}

	private static boolean isValidParanthesis(String s) {
		
		Stack<Character> st = new Stack<>();
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch == '{' || ch=='[' || ch=='(') {
				st.push(ch);
			}else {
				if(st.isEmpty()) return false;
				if((ch == ']' && st.pop() != '[') ||
						(ch == '}' && st.pop() != '{') || 
						(ch == ')' && st.pop() != '(')) {
					return false;
				}
			}
		}
		
		
		return st.isEmpty();
	}
}
