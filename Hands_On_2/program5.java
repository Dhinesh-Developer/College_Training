package Hands_On_2;

import java.util.Scanner;

public class program5 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String t = in.nextLine();
		
		boolean res = wordContains(s,t);
		System.out.println(res);
		
	}
	
	private static boolean wordContains(String s,String t) {
		if(s.length() != t.length()) {
			return false;
		}
		
		String temp = s+s;
		return temp.contains(t);
	}
}

/*
abcde
cdeab
true
 * */
