package Day3_HandsOn_1;

import java.util.Scanner;

public class program1 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		
		boolean res = isValidPalidrome(s);
		System.out.println(res);
		
	}
	
	private static boolean isValidPalidrome(String s) {
		s = s.toLowerCase();
		s = s.replaceAll("[^a-b0-9]","");
		int n = s.length();
		int low = 0,high = n-1;
		while(low <= high) {
			if(s.charAt(low) != s.charAt(high)) {
				return false;
			}
			low++;
			high--;
		}
		return true;
		
	}
	
}
