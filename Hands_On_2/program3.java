package Hands_On_2;

import java.util.Arrays;
import java.util.Scanner;

public class program3 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String t = in.nextLine();
		
		boolean res = isValidAnagram1(s,t);
		System.out.println(res);
		
	}
	
	private static boolean isValidAnagram1(String s,String t) {
		if(s.length() != t.length()) {
			return false;
		}
		
		int[] freq = new int[26];
		
		for(int i=0;i<s.length();i++) {
			freq[s.charAt(i)-'a']++;
			freq[t.charAt(i) - 'a']--;
		}
		
		for(int x : freq) {
			if(x != 0) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean isValidAnagram2(String s,String t) {
		if(s.length() != t.length()) {
			return false;
		}
		
		char[] s1 = s.toCharArray();
		char[] t1 = t.toCharArray();
		
		Arrays.sort(s1);
		Arrays.sort(t1);
		
		return Arrays.equals(s1, t1);
	}
	
}
