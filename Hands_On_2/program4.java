package Hands_On_2;

import java.util.Scanner;

public class program4 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		
		boolean res = isValidAnagram(s);
		System.out.println(res);
		
	}
	
	private static boolean isValidAnagram(String s) {
		s = s.toLowerCase();
		s = s.replaceAll("[^a-z0-9]", "");
		
		int len = s.length();
		int left =0 ,right = len-1;
		while(left <= right) {
			if(s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}
