package Day_2_HandsOn_1;

import java.util.Scanner;
import java.util.Stack;

public class program10 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		
		String res = clearDigits(s);
		System.out.println(res);
		
	}
	
	private static String clearDigits(String s) {
		int n = s.length();
		Stack<Character> st = new Stack<>();
		for(int i=0;i<n;i++) {
			char ch = s.charAt(i);
			if(!st.isEmpty() && (ch >= '0' && ch <= '9')) {
				st.pop();
			}else {
				st.push(ch);
			}
		}
		
		if(st.isEmpty()) return "";
		
		String res = "";
		for(int x : st) {
			res += x;
		}
		
		return res;
	}
}
